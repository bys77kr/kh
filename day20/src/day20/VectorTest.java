package day20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		/*
		 * 배열				| 콜렉션
		 * 1. 고정길이		| 가변길이
		 * 2. 기본&레퍼 자료형	| ref만 가능
		 * 3. 동종 자료형		| 타종간 자료형
		 */
		
		
		
		
		
		Vector v = new Vector(4,3); // 초기값 4 증가 3
		System.out.println("v의 저장공간 : " + v.capacity());
		System.out.println("v의 데이터 개수 : " + v.size());
		for (int i = 0; i < 9; i++) {
//			v.add(new Integer(i));
			v.add(i); //오토파싱(jdk 1.5v이상)
		}

		System.out.println("v의 저장공간 : " + v.capacity());
		System.out.println("v의 데이터 개수 : " + v.size());
		v.add(new Double(1.23));
		v.add(2.33);
		v.add("hello");

		System.out.println("v의 저장공간 : " + v.capacity());
		System.out.println("v의 데이터 개수 : " + v.size());
		
		System.out.println("v의 4번째 요소의 값 : " + v.get(4));
		System.out.println("v의 7번째 요소의 값 : " + v.get(7));
		System.out.println("v의 7번째 요소의 번지의 값 : " + v.get((Integer)v.get(7)));
		
		Vector<String> v2 = new Vector<>(); //1.7버전 이후 문법.
		Vector<String> v3 = new Vector<String>(); //이게 맞는 문법임.
		
//		39
		
		v2.add("java");
		v2.add("jsp");
		v2.add("html");
		v2.add("javascript");
		
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		
		for (int i = 0; i < arr.size(); i++) {
			int temp = arr.get(i);
			System.out.println(temp);
//			System.out.println(arr.get(i));
		}
		
	}

}
