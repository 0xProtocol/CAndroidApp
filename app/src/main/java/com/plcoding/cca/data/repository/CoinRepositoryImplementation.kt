package com.plcoding.cca.data.repository

import com.plcoding.cca.data.remote.CoinPaprikaApi
import com.plcoding.cca.data.remote.dto.CoinDetailDto
import com.plcoding.cca.data.remote.dto.CoinDto
import com.plcoding.cca.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImplementation @Inject constructor(
    private val api: CoinPaprikaApi): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
       return api.getCoins();
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId);
    }
}