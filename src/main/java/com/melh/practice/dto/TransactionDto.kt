package com.melh.practice.dto

import com.melh.practice.model.TransactionType
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransactionDto(
        val id: String?,
        val transactionType: TransactionType?,
        val amount: BigDecimal?,
        val transactionDateTime: LocalDateTime?,
)
