package day20;

class Outer{
	int a = 10;
	public void test1(){
		System.out.println("test1()메서드 호출됨");
	}
	class Inner{
		int b=20;
		public void test2(){
			System.out.println("test2()메서드 호출됨");
		}
	}
	
	static class SInner{
		int c = 30;
		public void test3(){
			System.out.println("test3()메서드 호출됨");
		}
		public static void test4(){
			System.out.println("test4()메서드 호출됨");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		Outer ot = new Outer();
		System.out.println("ot.a = " + ot.a);
		ot.test1();
		Outer.Inner oi = ot.new Inner();
		oi.test2();
		
		Outer.SInner soi = new Outer.SInner();
		System.out.println("osi.c = " + soi.c);
		soi.test3();
		
		Outer.SInner.test4();
	}

}
