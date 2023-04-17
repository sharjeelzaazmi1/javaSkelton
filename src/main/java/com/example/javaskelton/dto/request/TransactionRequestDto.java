package com.example.javaskelton.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransactionRequestDto {
    private String currency;
    private BigDecimal amount;
    private int accountId;
}
