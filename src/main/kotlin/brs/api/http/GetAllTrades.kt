package brs.api.http

import brs.api.http.common.Parameters.FIRST_INDEX_PARAMETER
import brs.api.http.common.Parameters.INCLUDE_ASSET_INFO_PARAMETER
import brs.api.http.common.Parameters.LAST_INDEX_PARAMETER
import brs.api.http.common.Parameters.TIMESTAMP_PARAMETER
import brs.api.http.common.Parameters.isFalse
import brs.api.http.common.ResultFields.TRADES_RESPONSE
import brs.services.AssetExchangeService
import brs.util.FilteringIterator
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import javax.servlet.http.HttpServletRequest

/**
 * TODO
 */
internal class GetAllTrades internal constructor(private val assetExchangeService: AssetExchangeService) :
    APIServlet.JsonRequestHandler(
        arrayOf(APITag.AE),
        TIMESTAMP_PARAMETER,
        FIRST_INDEX_PARAMETER,
        LAST_INDEX_PARAMETER,
        INCLUDE_ASSET_INFO_PARAMETER
    ) {

    override fun processRequest(request: HttpServletRequest): JsonElement {
        val timestamp = ParameterParser.getTimestamp(request)
        val firstIndex = ParameterParser.getFirstIndex(request)
        val lastIndex = ParameterParser.getLastIndex(request)
        val includeAssetInfo = !isFalse(request.getParameter(INCLUDE_ASSET_INFO_PARAMETER))

        val response = JsonObject()
        val trades = JsonArray()

        val tradeIterator = FilteringIterator(
            assetExchangeService.getAllTrades(0, -1),
            { trade -> trade != null && trade.timestamp >= timestamp }, firstIndex, lastIndex
        )
        while (tradeIterator.hasNext()) {
            val trade = tradeIterator.next()
            val asset = if (includeAssetInfo) assetExchangeService.getAsset(trade.assetId) else null

            trades.add(JSONData.trade(trade, asset))
        }

        response.add(TRADES_RESPONSE, trades)
        return response
    }
}
