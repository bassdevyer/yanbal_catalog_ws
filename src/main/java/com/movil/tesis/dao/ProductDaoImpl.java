package com.movil.tesis.dao;

import com.movil.tesis.model.ProductosYanbal;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by mac on 10/31/16.
 */
public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public ProductosYanbal checkExistence(String code) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ProductosYanbal where codigoRapido = :code");
        query.setParameter("code", Integer.parseInt(code));
        return (ProductosYanbal) query.uniqueResult();
    }

}
