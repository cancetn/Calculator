import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        double s1, s2;
        int secim;

        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz = ");

        s1 = inp.nextDouble();

        Scanner inp1 = new Scanner(System.in);

        System.out.println("Ikinci sayiyi giriniz = ");

        s2 = inp1.nextDouble();

        Scanner inp2 = new Scanner(System.in);

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Yapmak istediginiz islemi seciniz = ");

        secim = inp2.nextInt();

        switch(secim){
            case 1: System.out.println("Toplama = "+(s1+s2));
            break;
            case 2: System.out.println("Cikarma = "+(s1-s2));
            break;
            case 3: System.out.println("Carpma = "+(s1*s2));
            break;
            case 4: System.out.println("Bolme = "+(s1/s2));
            break;
            default:System.out.println("Gecersiz secim");
        }


    }
}
