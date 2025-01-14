package springcore.anotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
 // Ensure that the base package is correct
public class Javaconfig {
    @Bean
    public Samosa getSamosa(){
        return  new Samosa();
    }
    @Bean
    public  Student getStudent(){
        //create the new object

        Student student=new Student(getSamosa());
        return student;

    }
}
