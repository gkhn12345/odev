import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvTutar , kdvliTutar, kdvOrani1=1.8 , kdvOrani2=0.8;

          Scanner input = new Scanner(System.in);

          System.out.print("Ücret Tutarını Giriniz : ");
          tutar = input.nextDouble();
        kdvTutar = tutar < 1000 ? kdvOrani1*tutar : kdvOrani2*tutar;
          kdvliTutar = tutar + kdvTutar;

        kdvliTutar = kdvTutar + tutar;
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);



    }
}
