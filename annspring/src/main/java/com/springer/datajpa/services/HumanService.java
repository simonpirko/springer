package com.spring.datajpa.services;

import com.spring.datajpa.entity.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("humanService")
@Repository
@Transactional
public class HumanService {
    private HumanRepository humanRepository;

    @Autowired
    public void setHumanRepository(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public void save(Human human) {
        humanRepository.save(human);
    }

    @Transactional(readOnly = true)
    public List<Human> findAllHumans() {
        return (List<Human>) humanRepository.findAll();
    }
}
