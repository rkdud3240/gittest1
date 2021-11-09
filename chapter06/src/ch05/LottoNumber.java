package ch05;


import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	static final int LOTTO_NUM_SIZE = 6; 
	
	// 로또 번호를 생성하는 기능 (6자리)
	
	public int[] getLottoNumber() {
		// 번호를 담을 공간 만들기 
		int[] numbers = new int[LOTTO_NUM_SIZE];
		
		Random  random = new Random(); 
		// [1 ~ 45]
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i = i - 1; 
					break; 
				}
			}
		}
		// 배열 정렬 
		Arrays.sort(numbers); 
		return numbers; 
	}
	
	// 테스트 코드 
	public static void main(String[] args) {
		LottoNumber lottoNumber = new LottoNumber();
		int[] nums = lottoNumber.getLottoNumber(); 
		for (int i : nums) {
			System.out.print(i + "\t");
		}
	}
}






