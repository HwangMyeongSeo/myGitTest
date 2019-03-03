package com.javaprac.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAop {
	
	
	@Around("execution(* com.javaprac.service..*.*(..))")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable  {
		
		//String sign = joinPoint.getSignature().toShortString();
		System.out.println("is start");
		long st = System.currentTimeMillis();
		try {
			
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			// TODO: handle finally clause
			long et = System.currentTimeMillis();
			//System.out.println(sign + "is finished");
			//System.out.println(sign + "경과시간 : " +(et-st) );
		}
		
		
	}

}
