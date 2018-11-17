package com.springer.datajpa.services;

import com.springer.datajpa.entity.Human;
import org.springframework.data.repository.CrudRepository;

public interface HumanRepository extends CrudRepository<Human, Long> {
}
