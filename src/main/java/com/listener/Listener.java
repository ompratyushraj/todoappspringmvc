package listener;

import java.util.ArrayList;
import java.util.List;

import entities.Todo;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class Listener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Initialize the TODO list when the context is initialized
        List<Todo> list = new ArrayList<Todo>();
        ServletContext context = sce.getServletContext();
        context.setAttribute("list", list);  // Make sure the list is set in the context
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Do not initialize the list here
        System.out.println("Context destroyed.....");
    }
}
