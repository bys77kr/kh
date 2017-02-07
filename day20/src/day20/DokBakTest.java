package day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class DokBakTest {
	HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public DokBakTest() {
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(201);
		list.add(202);
		list.add(203);
		list.add(301);
		list.add(302);
		list.add(303);
		
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), false);
		}
	}
	public static void main(String[] args) {
		DokBakTest db = new DokBakTest();
		Scanner sc = new Scanner(System.in);
		while(true){
			db.title();
			switch (sc.nextInt()) {
			case 1: db.setRoom(sc); break;
			case 2: db.deleteRoom(sc); break;
			case 3: db.getRoomRandom(); break;
			case 4: System.exit(0);
			default:
				break;
			}
		}
		
	}
	
	private void getRoomRandom() {
//		for (int i = 0;i<list.size();i++) {
//			System.out.print(list.get(i)+"���� : ");
//			if(map.get(i)) System.out.println("������ ����");
//			else  System.out.println("�� ���");
//		}
		
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		tempList.addAll(list);
		
		
		for (int i = tempList.size(); i>0; i--) {
			int rand = (int)(Math.random()*i);
			if(map.get(tempList.get(rand))){
				System.out.println(tempList.get(rand)+"�� �� : ������ ����");
				tempList.remove(rand);
			}else{
				System.out.println(tempList.get(rand)+"�� �� : ����� ��");
				tempList.remove(rand);
			}
		}

//		while(tempMap.isEmpty()){
//			tempMap.remove();
//		}
	}

	public void getRoom(){
		
	}
	
	
	private void deleteRoom(Scanner sc) {
		System.out.print("����� ���ȣ : ");
		int roomNumber = sc.nextInt();
//		if(map.get(roomNumber) == false){
//			System.out.println(roomNumber + "�� ���� �����.");
//		}else{
//			map.put(roomNumber, false);
//		}
		if(map.get(roomNumber)){
			map.put(roomNumber, false);
		}else{
			System.out.println(roomNumber + "�� ���� �����.");
		}
	}

	private void setRoom(Scanner sc) {
		System.out.print("������ ���ȣ : ");
		int roomNumber = sc.nextInt();
//		if(map.get(roomNumber) == true){
//			System.out.println(roomNumber + "�� ���� �̹� �����.");
//		}else{
//			map.put(roomNumber, true);
//		}
		if(map.get(roomNumber)){
			System.out.println(roomNumber + "�� ���� �̹� �����.");
		}else{
			map.put(roomNumber, true);
		}
	}

	public void title(){
		System.out.println("���� ���� ���� ���α׷� v1.0");
		System.out.println("1. ���� �����ϱ�");
		System.out.println("2. �� ���� ����ϱ�");
		System.out.println("3. ������Ȳ ����");
		System.out.println("4. ����");
	}

}
//���ڿ��� ���� ���α׷�
//1. ���� �����ϱ�
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