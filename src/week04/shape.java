package week04;

import java.util.Scanner;

public class shape {
	int a1,a2,a3,a4,S,S2,F,temp;					
	
	Scanner scan = new Scanner(System.in);
	
	void input() {
		
		
		while (true) {
			
	try {
		
		System.out.println("Lutfen hesaplamak istediginiz seklin (en fazla 4 kenar) "
				+ "kenar uzunluklarini giriniz (-1 Cikis) ");
		System.out.println("Lutfen 1.kenar uzunlugunu giriniz ");
		a1 = Integer.parseInt(scan.next());
		if (a1 ==-1) {														// -1 ile çıkış
			System.out.println("bye.");										
			System.exit(0);
		}
		
		System.out.println("Lutfen 2.kenar uzunlugunu giriniz  (0 ile sonlandır) :");
		a2 = Integer.parseInt(scan.next());
		if (a2 ==0) {														// 0 ile hesaplama
			System.err.println("1 kenarli sekil olmaz!");
			continue;	
		}
		
		if (a2 ==-1) {
			System.out.println("bye.");
			System.exit(0);
		}
		System.out.println("Lutfen 3.kenar uzunlugunu giriniz  (0 ile sonlandır)");
		a3 = Integer.parseInt(scan.next());
		if (a3 ==0) {
			System.err.println("2 kenarli sekil olmaz!");
			continue;	
		}
		if (a3 ==-1) {
			System.out.println("bye.");
			System.exit(0);
		}
		System.out.println("Lutfen 4.kenar uzunlugunu giriniz  (0 ile sonlandır)");
		a4 = Integer.parseInt(scan.next());
		if (a4 ==0) {
			temp++;															//Şekil sayısı değişkeni. 1. şekil 2.şekil vs.
			calculateThreeShape();
			System.out.println(temp+ ". Seklin Cevresi  : "+S+"\n"+temp+ ". Seklin Alani    : "+F);
			continue;
		}
		if (a4 ==-1) {
			System.out.println("bye.");
			System.exit(0);
		}
		calculateFourShape();
		temp++;
		System.out.println(temp+ ". Seklin Cevresi  : "+S+"\n"+temp+ ". Seklin Alani    : "+F);
		}
		
	catch (NumberFormatException nfe)
		{
		System.err.println("Sadece sayi girin;");
		}
		
	}
		
	}
	
	void calculateThreeShape() {										// ücgen hesaplama
		
		S = a1 + a2 + a3;									   			// S toplam kenar uzunlugu
		S2 = S / 2;
        F = (int) Math.sqrt(S2 * (S2 - a1) * (S2 - a2) * (S2 - a3));    // F alan	
	}
	void calculateFourShape() {											// Dörtgen hesaplama
		
		S = a1+a2+a3+a4;												// S Toplam kenar uzunlugu
		F = a1*a3;														// F alan
	}	
	
	
}
