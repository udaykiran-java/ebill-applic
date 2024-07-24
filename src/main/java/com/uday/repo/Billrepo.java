package com.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.model.Bill;

public interface Billrepo extends JpaRepository<Bill, Integer> {

}
