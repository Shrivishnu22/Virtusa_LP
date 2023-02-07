package container;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	//@Before("execution(void container.ShoppingCart.checkout())")
	//@Before("execution (* *.*.checkout())")  //Without args
	@Before("execution (* *.*.checkout(..))")  //with args
	public void beforeLogger(JoinPoint jp) {
		System.out.println(jp.getSignature());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("Before Loggers");
	}
	
	//@After("execution(void container.ShoppingCart.checkout())")
	//@After("execution (* *.*.checkout())")
	@After("execution (* *.*.checkout(..))")
	public void afterLogger() {
		System.out.println("After Loggers");
	}
}
