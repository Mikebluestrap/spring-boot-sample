package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entities.Account;

@Transactional(readOnly = true)
public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByAccountNumberAndRoutingNumber(long accountId, long routingNumber);
}
