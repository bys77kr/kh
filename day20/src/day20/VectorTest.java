package day20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		/*
		 * �迭				| �ݷ���
		 * 1. ��������		| ��������
		 * 2. �⺻&���� �ڷ���	| ref�� ����
		 * 3. ���� �ڷ���		| Ÿ���� �ڷ���
		 */
		
		
		
		
		
		Vector v = new Vector(4,3); // �ʱⰪ 4 ���� 3
		System.out.println("v�� ������� : " + v.capacity());
		System.out.println("v�� ������ ���� : " + v.size());
		for (int i = 0; i < 9; i++) {
//			v.add(new Integer(i));
			v.add(i); //�����Ľ�(jdk 1.5v�̻�)
		}

		System.out.println("v�� ������� : " + v.capacity());
		System.out.println("v�� ������ ���� : " + v.size());
		v.add(new Double(1.23));
		v.add(2.33);
		v.add("hello");

		System.out.println("v�� ������� : " + v.capacity());
		System.out.println("v�� ������ ���� : " + v.size());
		
		System.out.println("v�� 4��° ����� �� : " + v.get(4));
		System.out.println("v�� 7��° ����� �� : " + v.get(7));
		System.out.println("v�� 7��° ����� ������ �� : " + v.get((Integer)v.get(7)));
		
		Vector<String> v2 = new Vector<>(); //1.7���� ���� ����.
		Vector<String> v3 = new Vector<String>(); //�̰� �´� ������.
		
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
