package com.rays.dao;

public class example {
	public static void main(String[] args) {
		String name="rahulkirar11214@gmail.com";
		int count=0;
		for (char i = 0; i <=9; i++) {
			
			for (int j = 0; j < name.length(); j++) {
				if(j==i) {
					
					count++;
				}
				
			}
			if(count>0)
				System.out.println(i+"-"+count);
			
		}
		

	}

}
