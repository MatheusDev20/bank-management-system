package com.mpbank.mpbank.repository;

import com.mpbank.mpbank.domain.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
  public Account findByFullName(String fullName);

  public Account findByDocument(String document);
}
