package com.cicoria.kotlintutorial.thenewboston.service

import com.cicoria.kotlintutorial.thenewboston.datasource.BankDataSource
import com.cicoria.kotlintutorial.thenewboston.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}