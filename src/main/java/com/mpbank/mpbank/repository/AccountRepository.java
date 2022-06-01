package com.mpbank.mpbank.repository;

import java.util.List;

import com.mpbank.mpbank.domain.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {

  public Account findByid(String id);

  public Account findByFullName(String fullName);

  public List<Account> findByDocument(String document);

  public Account findByPhone(String phone);
}
