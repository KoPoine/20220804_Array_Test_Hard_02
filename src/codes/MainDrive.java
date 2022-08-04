package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		1. 컴퓨터에게 난수 값 3개를 배열로 받는다.
		int[] testNum = new int [3];
		
		for (int i = 0; i < testNum.length; i++) {
			
			while(true) {
				int randomNum = (int) (Math.random() * 9 + 1);
				// Math.random()에 우리 조건식의 최대값을 곱한 후 , 1을 더하면 => 1 <= 뽑은 숫자 =< 최대값
				
				boolean isRepeat = false;
				
				for (int num : testNum) {
					if(num == randomNum) {
						isRepeat = true;
						break;
					}
				}	
				
				if (!isRepeat) {
					testNum[i] = randomNum;
					System.out.println(randomNum);
					break;
				}
			}
		}
		
//		2. 사용자의 3자리 숫자를 받아서 > 배열로 만들어 준다
		Scanner myScanner = new Scanner(System.in);
		
//		총 시도 횟수에 대한 변수 생성
		int totalCount = 0;
		
		while (true) {
			
			totalCount++;
			
			System.out.print("답안 제출 : ");
			int inputNum = myScanner.nextInt();
			
//			2-1. 사용자가 입력한 값을 넣을 3칸짜리 배열 생성
			int[] myNum = new int[3];    //   123   myNum[0] = 1;  myNum[1] = 2; myNum[2] = 3;
			
			for (int i = myNum.length - 1; i >= 0; i--) {
				myNum[i] = inputNum % 10;
				inputNum /= 10;
			}
			
//			3. 컴퓨터가 S / B 계산해주는 로직
			int sCount = 0;
			int bCount = 0;
			
			for (int i = 0; i < myNum.length; i++) {
				
				for (int j = 0; j < testNum.length; j++) {
					
					if (myNum[i] == testNum[j]) {
						if (i == j) {
							sCount++;
						}
						else {
							bCount++;
						}
					}
					
				}
				
			}
			
//			4. S / B 계산 값을 출력
			if (sCount == 3) {
				System.out.println("삼진입니다. 축하합니다.");
				break;
			}
			else {
				System.out.println(sCount + "S" + bCount + "B입니다.");
			}
			
		}
		
		System.out.println("총" + totalCount + "회 만에 맞추었습니다.");
		
		
		
		
		
	}
	
}






















