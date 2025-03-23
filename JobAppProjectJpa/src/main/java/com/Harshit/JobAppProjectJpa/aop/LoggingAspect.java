package com.Harshit.JobAppProjectJpa.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Aspect
@Component
public class LoggingAspect {
    public final static Logger LOGGER=  LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.Harshit.JobAppProjectJpa.service.Service.*(..))")
    public void loggingmethod(JoinPoint joinPoint){
        LOGGER.info("method clled"+" "+joinPoint.getSignature().getName());
    }


}
