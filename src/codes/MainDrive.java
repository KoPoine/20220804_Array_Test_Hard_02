package codes;

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
					break;
				}
			}
		}
		
		
		
	}
	
}
