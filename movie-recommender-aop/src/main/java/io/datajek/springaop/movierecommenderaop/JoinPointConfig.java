package io.datajek.springaop.movierecommenderaop;


import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {

    @Pointcut("execution(* io.datajek.springaop.movierecommenderaop.data.*.*(..))")
    public void dataLayerPointcut(){}


    @Pointcut("execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))")
    public void businessLayerPointcut() {}

    //to intercept method calls for both layers:
    @Pointcut("io.datajek.springaop.movierecommenderaop.JoinPointConfig.dataLayerPointcut() || "
            + "io.datajek.springaop.movierecommenderaop.JoinPointConfig.businessLayerPointcut()")
    public void allLayersPointcut() {}

    //for a particular bean
    @Pointcut("bean(movie*)")
    public void movieBeanPointcut() {}

}
