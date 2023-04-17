package com.example.javaskelton.repository;

import com.example.javaskelton.entity.TransactionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionReposityory extends CrudRepository<TransactionEntity, Long> {
}
