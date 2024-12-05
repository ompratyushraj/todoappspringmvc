package com.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Todo;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model){
		model.addAttribute("page", "home");
		return "home";  // This refers to home.jsp
	}
	
	@RequestMapping("/add")
	public String addTodo(Model model) {
		
		Todo todo = new Todo();
		model.addAttribute("page", "add");
		model.addAttribute("todo", todo);
		return "home";
	}
	
	@RequestMapping(value="/saveTodo", method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo todo,  Model model) {
		System.out.println(todo);
		todo.setTodoDate(new Date(0));
		return "home";
	}
}
