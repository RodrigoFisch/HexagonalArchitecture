package com.rodrigofisch.hexagonal.architecture.adapters.out.repository;

import com.rodrigofisch.hexagonal.architecture.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
