package forEX;

import java.util.Iterator;

public class ForEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ǹ�		::	if			: ���� ������ ���� ó���� �з��Ѵ�.
		// �ݺ���		::	for, while	: ���ǵ� �ڵ带 �ݺ��Ͽ� ó���Ѵ�.
									   // ���ǵ� �ڵ�� ����?	�ݺ��� ��� ó���ұ�?
									   //						�ݺ�? ���ѷ���, ���� Ƚ���� ���� (�ʱⰪ, ����, ������)
		
		for(int i=0; i<10; i++) {
			System.out.println(i + "�� �ݺ���");
		}
		
		//1��
		for(int i=0; i<5; i++) {					// i=0	<0�� �ݺ���	i=1>	�����Ŀ� ���ؼ� i=2
			System.out.println(i + "�� �ݺ���");	// i=2	<2�� �ݺ���	i=3>	�����Ŀ� ���ؼ� i=4
			i++;									// i=4	<4�� �ݺ���	i=5>	�����Ŀ� ���ؼ� i=6
		}											// i=6	���ǿ� ���� false
		
		//2��
		for(int i=0; i<=3; i++) {
			System.out.println(i + "�� �ݺ���");
		}
		System.out.println("hahaha");
		
		//3��
		for(int i=5; i>0; i--) {
			System.out.println(i + "�� �ݺ���");
		}
		
	}

}