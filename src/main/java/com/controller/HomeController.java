package com.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Todo;

import jakarta.servlet.ServletContext;

@Controller
public class HomeController {
	
	@Autowired
	ServletContext context;
	
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
		// Getting the todo list from context.
		List<Todo> list=(List<Todo>)context.getAttribute("list");
		list.add(todo);
		model.addAttribute("message", "Successfully Added !");
		return "home";
	}
}
