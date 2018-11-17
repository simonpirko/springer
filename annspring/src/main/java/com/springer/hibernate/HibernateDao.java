package com.springer.hibernate;

import com.springer.hibernate.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Repository("hibernateDao")
public class HibernateDao {
    //    private SessionFactory sessionFactory;
    private HibernateTemplate hibernateTemplate;

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
//        this.sessionFactory = sessionFactory;
    }

    public void save(User user) {
        hibernateTemplate.save(user);
//        session.save(user);
//        session.close();
    }

    @Transactional(readOnly = true)
    public void findAll() {

//        Session session = sessionFactory.getCurrentSession();
//        List from_user_u = session.createQuery("from User u").list();
//        from_user_u.forEach(System.out::println);
    }
}
