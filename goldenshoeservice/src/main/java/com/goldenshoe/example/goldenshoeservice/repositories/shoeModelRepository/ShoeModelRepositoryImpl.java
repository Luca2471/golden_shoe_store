package com.goldenshoe.example.goldenshoeservice.repositories.shoeModelRepository;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class ShoeModelRepositoryImpl implements ShoeModelRepositoryCustom {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<ShoeModel> findAllShoesByGenderAndCategory(String gender, String category) {
        List<ShoeModel> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(ShoeModel.class);
            cr.createAlias("shoeType", "shoeTypeAlias");
            cr.add(Restrictions.eq("gender", gender));
            cr.add(Restrictions.eq("shoeTypeAlias.category", category));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
