package com.beanExample;

public class BeanClass {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Message: " + message);

    }
    public void init(){
        System.out.println("Bean is going throught ini");
    }

    public void destroy(){
        System.out.println("Bean will destroy itself");
    }
}
