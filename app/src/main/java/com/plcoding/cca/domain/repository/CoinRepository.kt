package com.plcoding.cca.domain.repository

import com.plcoding.cca.data.remote.dto.CoinDetailDto
import com.plcoding.cca.data.remote.dto.CoinDto

//for testing
interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}