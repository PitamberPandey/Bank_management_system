package Spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class controller {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/collection/con.xml");

        // Get the bean 'emp1' from the context
        Emp emp1 = (Emp) context.getBean("emp1");

        // Print the address set from the bean
        System.out.println("Addresses: " + emp1.getAddress());
        System.out.println("Phones: " + emp1.getPhones());
        System.out.println("Courses: " + emp1.getCourses());
    }
}
