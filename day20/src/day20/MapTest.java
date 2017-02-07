package day20;

import java.util.Calendar;
import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과!!");
		map.put("banana", "바나나?");
		map.put("plate", "접시..");
		map.put("two", "둘..?");
		
		System.out.println("apple 뭐냐?" + map.get("apple"));
		System.out.println("plate 뭐야?" + map.get("plate"));
	
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
	}

}
//숙박예약 관리 프로그램
// 1. 숙박 예약하기
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





