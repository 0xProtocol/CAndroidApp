package com.plcoding.cca.data.remote

import com.plcoding.cca.data.remote.dto.CoinDetailDto
import com.plcoding.cca.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    //https://api.coinpaprika.com/v1/coins
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coindId") coinId: String): CoinDetailDto

}