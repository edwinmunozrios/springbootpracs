package co.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.activemq.dao.MessageDaoInt;

@Controller
public class MessageController {

	@Autowired
	@Qualifier("messageDao")
	private MessageDaoInt messageDao;
	
	@RequestMapping(value = "/listmessages", method = RequestMethod.GET)
	public String listMessage(Model model) {
		model.addAttribute("title", "List of Message from PING App");
		model.addAttribute("listOfMessages", messageDao.findAll());
		return "listMessages";
	}
}
