package forEX;

import java.util.Iterator;

public class ForEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문		::	if			: 참과 거짓에 따라 처리를 분류한다.
		// 반복문		::	for, while	: 정의된 코드를 반복하여 처리한다.
									   // 정의된 코드는 뭘까?	반복은 어떻게 처리할까?
									   //						반복? 무한루프, 수행 횟수를 지정 (초기값, 조건, 증감식)
		
		for(int i=0; i<10; i++) {
			System.out.println(i + "번 반복해");
		}
		
		//1번
		for(int i=0; i<5; i++) {					// i=0	<0번 반복해	i=1>	증감식에 의해서 i=2
			System.out.println(i + "번 반복해");	// i=2	<2번 반복해	i=3>	증감식에 의해서 i=4
			i++;									// i=4	<4번 반복해	i=5>	증감식에 의해서 i=6
		}											// i=6	조건에 의해 false
		
		//2번
		for(int i=0; i<=3; i++) {
			System.out.println(i + "번 반복해");
		}
		System.out.println("hahaha");
		
		//3번
		for(int i=5; i>0; i--) {
			System.out.println(i + "번 반복해");
		}
		
	}

}