package co.activemq.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.activemq.entity.Message;

@Repository("messageDao")
public class MessageDaoImp implements MessageDaoInt{

	@PersistenceContext
	private EntityManager entityMngr;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Message> findAll() {
		return  entityMngr.createQuery("from Message").getResultList();
	}

}
