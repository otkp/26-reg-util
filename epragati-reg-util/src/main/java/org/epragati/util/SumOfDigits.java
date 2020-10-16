package org.epragati.util;

import org.springframework.stereotype.Component;

@Component
public class SumOfDigits {

	//Sum of digits till single digit is obtained
	public int getSumOfDigits(int num) {

		int sum = 0;

		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		
		sum = (sum <10) ? sum : getSumOfDigits(sum);
		
		return sum;
	}
	
	public static void main(String[] args){
		
		System.out.println(new SumOfDigits().getSumOfDigits(9999));
	}

}
