package com.example.javaskelton.controllers;

import com.example.javaskelton.dto.GenericResponseDto;
import com.example.javaskelton.dto.request.TransactionRequestDto;
import com.example.javaskelton.entity.TransactionEntity;
import com.example.javaskelton.service.impl.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @PostMapping("/add")
    public GenericResponseDto<TransactionEntity> transaction(@RequestBody TransactionRequestDto requestDto) {

        TransactionEntity transaction = transactionService.addTransaction(requestDto);
        return GenericResponseDto.newSuccessInstance(transaction);

    }
}
