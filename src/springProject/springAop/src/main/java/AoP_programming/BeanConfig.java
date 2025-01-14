package AoP_programming;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan(basePackages="AoP_programming")
@EnableAspectJAutoProxy
public class BeanConfig {
}
