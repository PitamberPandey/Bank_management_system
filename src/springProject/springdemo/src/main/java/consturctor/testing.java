package consturctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testing {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ciconfig.xml");
       Person person=(Person) context.getBean("person");
        System.out.println(person);
    }
}
