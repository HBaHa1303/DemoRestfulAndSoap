package com.example.projectdemorestfulandsoap.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Aspect
@Configuration
@Slf4j
public class ServiceAOP {
    @Around("execution(* com.example.projectdemorestfulandsoap.controllers.*.*(..))")
    public void aroundController(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("==============================================================");
        log.info("Start Controller {} ", joinPoint);

        try {
            joinPoint.proceed();
        } catch (Throwable e){
            log.error(e.getMessage() + e.getCause().toString());
        }

        log.info("End Controller {}", joinPoint);
    }

    @Around("execution(* com.example.projectdemorestfulandsoap.services.*.*(..))")
    public void aroundService(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Start Service {} ", joinPoint);

        try {
            joinPoint.proceed();
        } catch (Throwable e){
            log.error(e.getMessage() + e.getCause().toString());
        }

        log.info("End Service {}", joinPoint);
    }

    @Around("execution(* com.example.projectdemorestfulandsoap.repositories.*.*(..))")
    public void aroundRepository(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Start Repository {} ", joinPoint);

        try {
            joinPoint.proceed();
        } catch (Throwable e){
            log.error(e.getMessage() + e.getCause().toString());
        }


        log.info("End Repository {}", joinPoint);
    }
}
