package com.alana.springmongodb.repository;

import com.alana.springmongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
