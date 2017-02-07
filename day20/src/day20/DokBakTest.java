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
//			System.out.print(list.get(i)+"번방 : ");
//			if(map.get(i)) System.out.println("누군가 있음");
//			else  System.out.println("텅 빈방");
//		}
		
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		tempList.addAll(list);
		
		
		for (int i = tempList.size(); i>0; i--) {
			int rand = (int)(Math.random()*i);
			if(map.get(tempList.get(rand))){
				System.out.println(tempList.get(rand)+"번 방 : 누군가 있음");
				tempList.remove(rand);
			}else{
				System.out.println(tempList.get(rand)+"번 방 : 빈방인 듯");
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
		System.out.print("취소할 방번호 : ");
		int roomNumber = sc.nextInt();
//		if(map.get(roomNumber) == false){
//			System.out.println(roomNumber + "번 방은 빈방임.");
//		}else{
//			map.put(roomNumber, false);
//		}
		if(map.get(roomNumber)){
			map.put(roomNumber, false);
		}else{
			System.out.println(roomNumber + "번 방은 빈방임.");
		}
	}

	private void setRoom(Scanner sc) {
		System.out.print("예약할 방번호 : ");
		int roomNumber = sc.nextInt();
//		if(map.get(roomNumber) == true){
//			System.out.println(roomNumber + "번 방은 이미 예약됨.");
//		}else{
//			map.put(roomNumber, true);
//		}
		if(map.get(roomNumber)){
			System.out.println(roomNumber + "번 방은 이미 예약됨.");
		}else{
			map.put(roomNumber, true);
		}
	}

	public void title(){
		System.out.println("숙박 예약 관리 프로그램 v1.0");
		System.out.println("1. 숙박 예약하기");
		System.out.println("2. 방 예약 취소하기");
		System.out.println("3. 예약현황 보기");
		System.out.println("4. 종료");
	}

}
//숙박예약 관리 프로그램
//1. 숙박 예약하기
//2. 방 예약 취소하기
//3. 예약현황 보기
//4. 종료
//
//예약할 방번호 >> 102
//예약 되있으면 "102호는 이미 예약된 방임"
//
//취소할 방번호 >> 302
//빈방이면 "302는 빈방임"
//
//~는 예약됨 / ~는 빈방
//
//101 102 103 201 202 203 301 302 303
//방번호 순서는 보장되지 않음