package com.haktanozgur.perfectNumberFind;

import java.util.Scanner;

public class perfectNumberFind {

    /*findNumber metodu, mükemmel sayı hesaplamasını yaparak kullanıcıdan alınan değerin,
     mükemmel sayı olup olmadığını belirledikten sonra, geriye bilgi olarak String bir
     değer döndürür.*/	
	public static String findNumber(int number) {
		
		String message = null;
		int sum = 0;  
		
		for(int i = 1; i < number; i++) {
			
				if (number % i == 0) {
					sum = sum +i;
				}
				
				if (sum == number) {
					message = " Mükemmel sayıdır...";
				}
				else {
					message = " Mükemmel sayı değildir...";
				}			
		}
		
		return message;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Bu kısımda kullanılan for döngüsü, isteğe bağlı olarak programın en az 10 defa çalışması için yazılmıştır.
		for (int j = 0; j < 10; j++) {  
		System.out.println("Sayı giriniz....");
		int number = scanner.nextInt();
		System.out.println(number + findNumber(number));
		}
	}
}
