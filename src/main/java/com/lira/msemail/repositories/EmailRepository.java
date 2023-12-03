package com.lira.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lira.msemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
