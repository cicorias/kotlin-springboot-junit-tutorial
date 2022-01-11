package com.cicoria.kotlintutorial.thenewboston.datasource

import com.cicoria.kotlintutorial.thenewboston.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}