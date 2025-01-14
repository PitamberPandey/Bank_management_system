package AoP_programming;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

import org.springframework.stereotype.Component;

@Aspect
@Component

public class Logging {

    @Before("execution(* AoP_programming.ShoppingCart.checkout(..))")
    public void beforeAdvice() {
        System.out.println("Logging: Method is about to be executed.");
    }
    @After("execution(* *.*.checkout(..))")
    public void afterAdvice() {
        System.out.println("Logging: Method is about to be executed.");
    }



}
