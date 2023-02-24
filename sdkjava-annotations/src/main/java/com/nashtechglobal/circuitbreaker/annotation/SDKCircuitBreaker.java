package com.nashtechglobal.circuitbreaker.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface SDKCircuitBreaker {

    /**
     * Name of the circuit breaker.
     * It can be SpEL expression. If you want to use the first parameter of the method as name, you can
     * express it as {@code #root.args[0]}, {@code #p0} or {@code #a0}. The method name can be accessed via
     * {@code #root.methodName}.  To invoke a method on a Spring bean, pass {@code @yourBean.yourMethod(#a0)}.
     *
     * @return the name of the circuit breaker
     */
    String name();

    /**
     * fallbackMethod method name.
     *
     * @return fallbackMethod method name.
     */
    String fallbackMethod() default "";
}
