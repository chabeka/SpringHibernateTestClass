package com.mkyong.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mkyong.dao.GenericDAO;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Basic DAO operations dependent with Hibernate's specific classes
 * @see SessionFactory
 */
@SuppressWarnings("unchecked")

public class GenericDAOImpl<E, K extends Serializable> implements GenericDAO<E, K>{
    
	@Autowired
    private SessionFactory sessionFactory;

    protected Class<? extends E> daoType;

    /**
     * By defining this class as abstract, we prevent Spring from creating instance of this class
     * If not defined abstract getClass().getGenericSuperClass() would return Object.
     * There would be exception because Object class does not have constructor with parameters.
     */
    public GenericDAOImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void add(E entity) {
        currentSession().save(entity);
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public E saveOrUpdate(E entity) {
        currentSession().saveOrUpdate(entity);
        return entity;
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void update(E entity) {
        currentSession().saveOrUpdate(entity);
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void remove(E entity) {
        currentSession().delete(entity);
    } 
    
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public E find(K key) {
        return (E) currentSession().get(daoType, key);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<E> getAll() {
        return currentSession().createCriteria(daoType).list();
    }
    
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public final E getById(K id)
    {
      return (E) currentSession().get(daoType, id);
    }
    
    public void flush() {  
    	currentSession().flush();  
    }  
  
    public void clear() {  
    	currentSession().clear();  
    }
}