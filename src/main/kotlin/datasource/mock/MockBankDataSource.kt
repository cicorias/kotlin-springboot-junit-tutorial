package com.cicoria.kotlintutorial.thenewboston.datasource.mock

import com.cicoria.kotlintutorial.thenewboston.datasource.BankDataSource
import com.cicoria.kotlintutorial.thenewboston.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    private val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5678", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}