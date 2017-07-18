package com.pca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pca.bean.Person;
import com.pca.service.PersonService;




@Controller
public class HomeController {

	
	/*HibernateTemplate template;*/
	
	@Autowired
	private PersonService ser;
	
	
	@RequestMapping("/")
	public String name() {
		System.out.println("inside home controller");
		return "home";
        
	}

	/*@RequestMapping("/insertForm")
	public String name1(@ModelAttribute("signup")Person P) {
		
	
	ser.insertForm(P);	
	return "home";

	}
	@RequestMapping("/viewForm")
	public String name2(@ModelAttribute("signup")Person P) {
		
	
	ser.insertForm(P);	
	return "home";

	}
*/
	/*@RequestMapping("/insert")
	public String login(@ModelAttribute("signup") StudentBean s1) {
		System.out.println(s1.getFname());
		System.out.println("i am log in controller");
		template.save(s1);
		 
		return "home";
	}
	*/
}
