package day20;

import java.util.Calendar;
import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "���!!");
		map.put("banana", "�ٳ���?");
		map.put("plate", "����..");
		map.put("two", "��..?");
		
		System.out.println("apple ����?" + map.get("apple"));
		System.out.println("plate ����?" + map.get("plate"));
	
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
	}

}
//���ڿ��� ���� ���α׷�
// 1. ���� �����ϱ�
//2. �� ���� ����ϱ�
//3. ������Ȳ ����
//4. ����
//
//������ ���ȣ >> 102
//���� �������� "102ȣ�� �̹� ����� ����"
//
//����� ���ȣ >> 302
//����̸� "302�� �����"
//
//~�� ����� / ~�� ���
//
//101 102 103 201 202 203 301 302 303
//���ȣ ������ ������� ����





