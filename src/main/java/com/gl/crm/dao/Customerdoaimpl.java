package com.gl.crm.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.crm.model.Customer;


@Repository
public class Customerdoaimpl implements Customerdoa {
	
	@Autowired
	SessionFactory factory;

	@Override
	@Transactional
	public void savecustomer(Customer customer) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(customer);
		}

	@Override
	@Transactional
	public void deletecustomer(int id) {
		 Session session = factory.getCurrentSession();
		 Customer c = session.get(Customer.class, id);
		 session.delete(c);
		}

	@Override
	@Transactional
	public Customer findbyid(int id) {
		Session session = factory.getCurrentSession();
		   return session.get(Customer.class, id);
	}

	@Override
	@Transactional
	public List<Customer> listall() {
		Session session = factory.getCurrentSession();
		   Query query = session.createQuery("from Customer");
			return query.getResultList();
	}

}
