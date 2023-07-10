package com.marketingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingproject.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
