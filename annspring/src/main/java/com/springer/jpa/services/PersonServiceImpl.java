package com.springer.jpa.services;

import com.springer.jpa.entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service("personService")
@Repository
@Transactional
public class PersonServiceImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Person person) {
        entityManager.persist(person);
    }

    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return entityManager.createNamedQuery("Person.findAll", Person.class).getResultList();
    }
}
