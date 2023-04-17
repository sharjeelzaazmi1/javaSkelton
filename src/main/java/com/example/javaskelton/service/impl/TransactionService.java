package com.example.javaskelton.service.impl;

import com.example.javaskelton.dto.request.TransactionRequestDto;
import com.example.javaskelton.entity.TransactionEntity;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
     /**
      * Save Bank transaction in database
      * @param transactionDto
      * @return
      */
     TransactionEntity addTransaction(TransactionRequestDto transactionDto);
}
