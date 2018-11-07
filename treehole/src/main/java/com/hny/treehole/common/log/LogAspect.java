package com.hny.treehole.common.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {
	@AfterReturning("within(com.hny.treehole..*) && @annotation(logAnn)")
	public void operateAfter(JoinPoint jp, LogAnnotation logAnn) {
		System.out.println(logAnn.logContent()+"之后");
	}
	@Before("within(com.hny.treehole..*) && @annotation(logAnn)")
	public void operateBefore(JoinPoint jp, LogAnnotation logAnn) {
		System.out.println(logAnn.logContent()+"之前");
	}
}
