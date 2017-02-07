package day20;

import java.util.Locale;

public class NameLocalTest {
	String s = "!!!";
	public void test1(){
		String ss = "###";
		System.out.println("s = "+s);
		System.out.println("ss = "+ss);
		class Local{
			String sss = "$$$";
			public void test2(){
				System.out.println("sss = " + sss);
				System.out.println("ss = " + ss); // 이거 원레 안됨. jdk 1.8 이상만 가능(문법 변경됨)
				System.out.println("s = "+s);
			}
		}
		Local lo = new Local();
		lo.test2();
	}
	
	public void test3(){
//		Local lo = new Local();
	}
	
	public static void main(String[] args) {
		NameLocalTest nlt = new NameLocalTest();
		
		nlt.test1();
		
	}

}
