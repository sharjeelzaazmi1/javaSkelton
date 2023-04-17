package com.example.javaskelton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "transaction")
public class TransactionEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String currency;
    private BigDecimal amount;
    private int accountId;

    public TransactionEntity(String currency, BigDecimal amount, int accountId) {
        this.currency = currency;
        this.amount = amount;
        this.accountId = accountId;
    }
}
