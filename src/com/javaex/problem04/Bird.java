package com.javaex.problem04;

public abstract class Bird {
    private String name;
    
    public Bird() {}
    
    public Bird(String name) {
    	this.name = name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    protected String getName() {
    	return name;
    }
    
    public abstract void sing();
    
    public abstract void fly();
    
    public void showName() {
    	System.out.println("새의 이름은 "+name+"입니다.");
    }
    
    



}
