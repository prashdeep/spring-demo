package com.eurofins.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import com.eurofins.model.Employee;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.eurofins.service.EmployeeServiceImpl.insertEmployee(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("logging before the method is getting executed");
		System.out.println(joinPoint);
	}

	@After("execution(* com.eurofins.service.*.Employee*())")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("logging after the method has executed");
	}

	@Before("allServiceMethodsPointcut()")
	public void allServiceMethodsAdvice(){
		System.out.println("Before executing the service method");
	}

	@AfterReturning(pointcut = "execution(* findAllEmployees())", returning = "returnList")
	public void getNameReturningAdvice(List<Employee> returnList) {
		System.out.println("findAllEmployees executed. Returned List=" + returnList);
	}

	// Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.eurofins.service.*)")
	public void allServiceMethodsPointcut() {
	}

}
