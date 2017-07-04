package com.mkyong.dao;

import java.util.List;

/**
 * 
 * @param <E>
 * @param <K>
 * 
 */
public interface GenericDAO<E,K> {
    public void add(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public void flush();
    public void clear();
    public E saveOrUpdate(E entity) ;
    public E find(K key);
    public E getById( K id );
    public List<E> getAll() ;
}