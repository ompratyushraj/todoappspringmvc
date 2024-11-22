package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // Updated /home method to handle dynamic page attributes
    @RequestMapping("/home")
    public String home(Model model) {
        // Set page attribute to dynamically display content
    	String str="home";
        model.addAttribute("page", str);  // "home" means show "All TODOS"
        return "home";  // This is pointing to home.jsp
    }

    // Method for handling the Add TODO page
    @RequestMapping("/add")
    public String addTodo(Model model) {
        // Set page attribute to dynamically show "Add TODO"
        model.addAttribute("page", "add");  // "add" means show "Add TODO"
        return "home";  // Reuse the same home.jsp for displaying the Add TODO form
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
