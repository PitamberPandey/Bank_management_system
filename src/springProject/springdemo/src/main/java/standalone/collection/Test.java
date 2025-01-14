package standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Load Spring XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone/collection/config.xml");

        // Retrieve the person bean
        Person person1 = (Person) context.getBean("person1");

        // Call method to display the list of friends
        System.out.println(person1);

    }
}
