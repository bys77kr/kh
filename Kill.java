package tp;
//ssssssssssssssssss
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kill {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		int z = 0; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("인원 : ");
		int position = Integer.parseInt(br.readLine());
		System.out.print("간격 : ");
		int kan = Integer.parseInt(br.readLine());
		
		int [] human = new int [position];
		int arrive = -1, nam = 0;
		
		for (int i = 0; i < human.length; i++) {
			human[i] = i+1;
		}
		
		int arriveNumber = position;
		do{
			int ntemp = 0;
			//죽여
			if(arriveNumber+nam>=kan){
				for(int i = 0; i<arriveNumber; i++){
					if((i+nam+1)%kan==0){
						human[i]=0;
						ntemp = 0;
					}else{
						ntemp++;
					}
				}
				nam = ntemp;
			}else{
				nam += arriveNumber;
				}
				
				
//				int result = 0;
//				int temp = kan-nam;
//				
//				if(arriveNumber>=temp){
//					result = temp-1;
//				}else{
////					result = temp%arriveNumber;
//					for (int i = 0; i < temp; i++) {
//						if(result==arriveNumber) result = 0;
//						else{
//							result++;
//						}
//					}
//				}
//				human[result] = 0;
				
				
			
			//확인
			for (int i = 0; i < human.length; i++) {
				System.out.println("human[" + i + "] = " + human[i]);
			}
			System.out.println("nam = " + nam);
			System.out.println("------------=-------------");
			
			//산사람으로 초기화
//			if(arriveNumber>kan){
//				nam = (arriveNumber+nam)%kan;
//			}else{
//				if(kan > arriveNumber+nam){
//					nam = kan%(arriveNumber+nam);
//				}else{
//					nam = (arriveNumber+nam)%kan;
//				}
//			}
//			
//			if(kan > arriveNumber+nam){
//				nam = kan%(arriveNumber+nam);
//			}else{
//				nam = (arriveNumber+nam)%kan;
//			}
			
			
			System.out.println("nam = " + nam + " kan = " + kan + " arr = " + arriveNumber);
			for (int i = 0, j=0; i < human.length; i++) {
				if(human[i]!=0){
					human[j] = human[i];
					j++;
				}
//				nam = j%kan;
				arriveNumber = j;
			}
			
			for(int i = arriveNumber; i<position; i++){
				human[i] = 0;
			}
			
			//확인
			for (int i = 0; i < human.length; i++) {
				System.out.println("human[" + i + "] = " + human[i]);
			}
			System.out.println("nam = " + nam);
			System.out.println("arriveNumber = " + arriveNumber);
			
			//산사람 검사
			if(human[1]==0){
				arrive = human[0];
				break;
			}
			System.out.println("logo");
//			z++;
//			if(z==10) break;
			
		}while(true);
		
		System.out.println("산놈 : " + arrive);
		
	}

}







