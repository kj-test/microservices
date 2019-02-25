package com.example.msmail.repository;

import com.example.msmail.entity.Mail;
import org.springframework.data.repository.CrudRepository;

public interface MailRepository extends CrudRepository<Mail, Long> {

}