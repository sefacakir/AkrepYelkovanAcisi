import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Saati ve dakikayý boþluk býrakarak giriniz: ");
		double saat = scan.nextFloat();
		double dakika = scan.nextFloat();

		if(saat>=12) {
			saat -= 12;
		}

		double tutucuSaat = saat * 30;
		double tutucuDakika = dakika * (5.5);

		double aci;
		
		if(tutucuSaat > tutucuDakika) {
			aci = tutucuSaat-tutucuDakika;
		}else {
			aci = tutucuDakika-tutucuSaat;
		}
		
		if(aci > 180) {
			System.out.println("Büyük açý: "+aci);
			System.out.println("Küçük açý: "+ (360-aci));
		}
		else {
			System.out.println("Küçük açý: "+aci);
			System.out.println("Büyük açý: "+(360-aci));
		}
	}
}