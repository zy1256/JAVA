package com.itwill.lotto;

public class Lotto {
	int[] numbers = new int[6];

	public void generateNumber() {
		int lottoNumber = (int)(Math.random()*45)+1;
		//Math.random();
		for (int i = 0; i < numbers.length; i++) {
			lottoNumber = (int)(Math.random()*45)+1;
			numbers[i] = lottoNumber;
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]){
					lottoNumber = (int)(Math.random()*45)+1;
					numbers[i] = lottoNumber;
					i = i-1;
					break;
				}
			}
		}
		
	}

}
