package co.activemq.dao;

import java.util.List;

import co.activemq.entity.Message;

public interface MessageDaoInt {

	public List<Message> findAll();
}
