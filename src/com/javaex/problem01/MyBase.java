package com.javaex.problem01;

public class MyBase extends Base{

    //코드작성
	public void service(String state) {

        if (state.equals("낮")) {
            day();
        } else if (state.equals("밤")){
            night();
        } else {
        	afternoon();
        }
    }
	
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}

    
    
}