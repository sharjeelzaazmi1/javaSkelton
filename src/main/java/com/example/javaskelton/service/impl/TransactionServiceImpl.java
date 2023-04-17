package com.example.javaskelton.service.impl;

import com.example.javaskelton.dto.request.TransactionRequestDto;
import com.example.javaskelton.entity.TransactionEntity;
import com.example.javaskelton.repository.TransactionReposityory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionReposityory transactionReposityory;

    @Override
    public TransactionEntity addTransaction(TransactionRequestDto transactionDto) {
        return transactionReposityory.save(new TransactionEntity(transactionDto.getCurrency(),transactionDto.getAmount(),transactionDto.getAccountId()));

    }
}
