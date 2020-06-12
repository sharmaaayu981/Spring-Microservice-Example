package com.in28minutes.springboot.microservice.example.currencyconversion;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository
@EnableAutoConfiguration
@EnableTransactionManagement
public interface CurrencyRepository extends CrudRepository<CurrencyConversionBean,Integer>{
}
