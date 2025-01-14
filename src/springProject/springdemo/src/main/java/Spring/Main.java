package Spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the student1 bean
        Student student = (Student) context.getBean("student1");

        // Print the student details
        System.out.println(student);
    }

    }

