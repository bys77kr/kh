package day20;

class NoName{
	int a = 10;
	public NoName() {
		getInfo();
		
	}
	
	public void getInfo(){
		System.out.println("??");
	}
}

public class NoNameTest {

	public static void main(String[] args) {
		NoName n = new NoName(){
			@Override
			public void getInfo() {
				System.out.println("�͸�Ŭ���� ������� �������� �޼���!@#");
				System.out.println("a = " + a);
			}
		};
	}

}
