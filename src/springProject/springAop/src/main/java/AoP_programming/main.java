package AoP_programming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
ShoopingCart card=context.getBean(ShoopingCart.class);
card.checkout("Canceled");
    }
}
