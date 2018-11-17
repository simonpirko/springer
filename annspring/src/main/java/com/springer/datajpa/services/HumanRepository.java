package com.spring.datajpa.services;

import com.spring.datajpa.entity.Human;
import org.springframework.data.repository.CrudRepository;

public interface HumanRepository extends CrudRepository<Human, Long> {
}
