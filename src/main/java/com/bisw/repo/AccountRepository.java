package com.bisw.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bisw.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
