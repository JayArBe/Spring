package io.datajek.springaop.movierecommenderaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AccessCheckAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(String io.datajek.springaop.movierecommenderaop..*.*Filtering(..))")
    public void filterAccess(JoinPoint joinPoint){

    }

    @Before("execution(String io.datajek.springaop.movierecommenderaop..*.*(..))")
    public void allStringAccess(JoinPoint joinPoint){

    }

    @Before("execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))")
    public void userAccess(JoinPoint joinPoint){
        logger.info("Intercepted call before execution: {}", joinPoint);
    }

    @Before("execution(* io.datajek.springaop.movierecommenderaop.data.*.*(..))")
    public void dataAccess(JoinPoint joinPoint){
        logger.info("Intercepted call before execution: {}", joinPoint);
    }

    @Before("execution(* io.datajek.springaop.movierecommenderaop..*.*(..))")
    public void allAccess(JoinPoint joinPoint){

    }
    /*More to consider
    *
    *@Before("execution(* io.datajek.springaop.movierecommenderaop..*.*(String))")
    *@Before("execution(*io.datajek.springaop.movierecommenderaop..*.*(String,..))")
    *@Before("execution(* io.datajek.springaop.movierecommenderaop..*.*Filtering(..)) || execution(String io.datajek.springaop.movierecommenderaop..*.*(..))")
    *
    * */

}

