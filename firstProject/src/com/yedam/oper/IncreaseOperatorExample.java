package com.yedam.oper;

public class IncreaseOperatorExample {
	public static void main(String[] args) {
		boolean run = false;
		int var1 = 0;
		
		var1++; //va1 = 1
		
		for(int i=0;i<3;i++) {// 0 1 2--총3번의루프
			run = !run; // ! 부정연산자(not)
			//i 가 0일때 run값은 true, if문 실행, i = 0일떄, var1 = 1, var1 = 2
		    //i 가 1일때 run 값은 false, if문 실행X
			//i 가 2일때 run 값은 true, if문실행   i = 2일떄 , var = 2 , var1 = 3
			if(run) {
				var1++;// var = var +1;
			} //if문 종료
			
		} //for문 종료
		
		System.out.println(var1);
	}
}
