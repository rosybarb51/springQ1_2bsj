package com.bitc.number.dto;

public class EvenNumber {

	private int num;
	private int result;
	private int i;
	private int even;
	
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public int getResult() {
		while (i <= num) {
			if (i % 2 == 0) {
			even += i;
			}
				i++;
					
		}
		
		return even;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getEven() {
		return even;
	}

	public void setEven(int even) {
		this.even = even;
	}
	
	
	
	
	

	
}
