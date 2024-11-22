package controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entities.Todo;
import jakarta.servlet.ServletContext;

@Controller
public class HomeController {
	
	@Autowired
	ServletContext context;

    // Updated /home method to handle dynamic page attributes
    @RequestMapping("/home")
    public String home(Model model) {
        // Set page attribute to dynamically display content
    	String string="home";
        model.addAttribute("page", string);  
        
        List<Todo> list=(List<Todo>)context.getAttribute("list");
        model.addAttribute("todos", list);
        // "home" means show "All TODOS"
        return "home";  // This is pointing to home.jsp
    }

    // Method for handling the Add TODO page
    @RequestMapping("/add")
    public String addTodo(Model model) {
        // Set page attribute to dynamically show "Add TODO"
    	Todo todo = new Todo();
        model.addAttribute("page", "add"); 
        model.addAttribute("todo", todo);// "add" means show "Add TODO"
        return "home";  // Reuse the same home.jsp for displaying the Add TODO form
    }
    
    @RequestMapping(value="/saveTodo", method=RequestMethod.POST )
    public String saveTodo(@ModelAttribute("todo") Todo todo, Model model) {
    	System.out.println(todo);
    	todo.setTodoDate(new Date(0));
    	
    	// get the todo list from context;
    	List<Todo> list = (List<Todo>)context.getAttribute("list");
    	list.add(todo);
    	model.addAttribute("message", "Successfully added.....");
    	return "home";
    }

    // The about page
    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("name", "Pratyush Raj");
        model.addAttribute("age", "45");
        return "about";  // about.jsp will display this information
    }

    // The data page
    @RequestMapping("/data")
    public ModelAndView mydata() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "Aditya Pandey");
        mav.addObject("age", "32");

        mav.setViewName("data");  // data.jsp will display this information
        return mav;
    }
}
