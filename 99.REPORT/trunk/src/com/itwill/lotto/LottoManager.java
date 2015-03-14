package com.itwill.lotto;

public class LottoManager {
	Lotto[] lottoArray;
	public void generateLotto(int money) {
		//Lotto °¹¼ö ¸¸Å­ Lotto °´Ã¼»ý¼º
		Lotto[] lottoArray=new Lotto[4];
		lottoArray[0] = new Lotto();
		lottoArray[1] = new Lotto();
		lottoArray[2] = new Lotto();
		lottoArray[3] = new Lotto();
		
		lottoArray[0].generateNumber();
		lottoArray[1].generateNumber();
		lottoArray[2].generateNumber();
		lottoArray[3].generateNumber();

		print();
	}
	
	
	private void print(){
		for (int i = 0; i < lottoArray.length; i++) {
			System.out.println(lottoArray[i]);
		}
	}
}
