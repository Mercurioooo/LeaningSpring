package org.ljn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("logAnnotation")
@Aspect
public class LogBeforeAnnotation {
	
	@Before("execution(public * addStudent(..))")
	public void myBefore(JoinPoint jp) {
		System.out.println("注解形式前置通知");
		System.out.println(jp.getKind());
		
	}
	
	@AfterReturning(pointcut="execution(public * deleteStudent(..))",returning="returningValue")
	//@AfterReturning("execution(public * deleteStudent(..))")
	public void myAfter(JoinPoint jp,Object returningValue) {
		System.out.println("注解形式前置通知");
		System.out.println(jp.getThis()+" "+returningValue);
	}
	
	/*
	//环绕通知
	@Around("execution(public * addStudent(..))")
	public void myAround(ProceedingJoinPoint jp  ) {
		//方法之前:前置通知
		System.out.println("环绕前置֪ͨ");
		
		try {
			//方法执行时
			jp.proceed() ;
	
			//方法执行之后:后置通知
			System.out.println("环绕后置");
		}catch(Throwable e) {
			//异常通知
			System.out.println("环绕异常");
		}finally {
			//最终通知
			System.out.println("环绕最终");
		}
	}*/
	
	//异常通知
	@AfterThrowing(pointcut= "execution(public * addStudent(..))",throwing="e")
	public void myException(JoinPoint pj, NullPointerException e) {//只捕获特定类型的异常
		System.out.println("异常信息"+e.getMessage());
	}
	
	//最终通知
	@After("execution(public * addStudent(..)) or execution(public * deleteStudent())")
	public void myAfter() {
		System.out.println("最终通知");
	}
}
