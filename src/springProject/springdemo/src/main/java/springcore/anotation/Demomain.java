package springcore.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demomain {
    public static void main(String[] args) {
        // Load the Spring context using the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);

        // Retrieve the bean named "firststudent"
        Student student = (Student) context.getBean("getStudent");

        // Use the student object
        System.out.println(student);
        student.study();
    }
}
