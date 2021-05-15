import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Saati ve dakikay� bo�luk b�rakarak giriniz: ");
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
			System.out.println("B�y�k a��: "+aci);
			System.out.println("K���k a��: "+ (360-aci));
		}
		else {
			System.out.println("K���k a��: "+aci);
			System.out.println("B�y�k a��: "+(360-aci));
		}
	}
}