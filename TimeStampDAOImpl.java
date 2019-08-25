package com.jwt.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.TimeStamp;

@Repository
@Transactional 
public class TimeStampDAOImpl implements TimeStampDAO {
	/*
	@PersistenceContext
    EntityManager em;
*/
	@Autowired
	private SessionFactory sessionFactory;



	@Override
	public void addTimeStamp(TimeStamp timestamp) {
		sessionFactory.getCurrentSession().saveOrUpdate(timestamp);
		
	}
	
	@Override
	public void deleteAllTimeStamp() {
		sessionFactory.getCurrentSession().createQuery("delete from TimeStamp").executeUpdate();
		}

}