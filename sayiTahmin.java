package com.sayitahmin;

import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {

	public static void main(String[] args) {

		
		// kütüphaneler
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		// random sayı oluşturma
		int random_sayi = rnd.nextInt(100);
		// bilinip bilinmediğini kontrol için flag
		boolean flag = false;
		//System.out.println(random_sayi); --> random sayıyı ekrana yazma ( kontrol için ) 
		for (int tahmin_sayisi = 0; tahmin_sayisi < 10; tahmin_sayisi++) {
			System.out.println("kalan tahmin hakkınız: " + (10 - tahmin_sayisi));
			System.out.print("tahmin giriniz: ");
			int tahmin = scanner.nextInt();
			if (tahmin == random_sayi) {
				System.out.println("tebrikler...");
				flag = true;
				break;
			} else if (tahmin > random_sayi) {
				System.out.println("Tahmininiz doğru cevaptan büyük:)");
				System.out.println("tekrar deneyin");
			} else if (tahmin < random_sayi) {
				System.out.println("Tahmininiz doğru cevaptan küçük :)");
				System.out.println("Tekrar deneyiniz");
			}

		}
		if (!flag) {
			System.out.println("oyun bitti");
		}
	}
}