import java.util.Scanner;

public class JavaCalculator101 {
    static int topla(int a, int b) {
        return a + b;
    }
    static int cikar(int a, int b) {
        return a - b;
    }
    static int carp(int a, int b) {

        return a * b;
    }
    static int bol(int a, int b) {
        return a % b;
    }
    static int usAl(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int faktoriyel(int a) {
        if (a == 1 || a == 0) {
            return 1;
        }
        return faktoriyel(a - 1);
    }
    static int modAlma(int a, int b) {
        return a % b;
    }
    static int DikdortgenAlan(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a, b, result = 0;
        Scanner input = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        int select;
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Lütfen 1. sayıyı giriniz");
                    a = input.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz");
                    b = input.nextInt();
                    System.out.println("Sonuç: "+topla(a, b));
                    break;
                case 2:
                    System.out.print("Lütfen 1. sayıyı giriniz");
                    a = input.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz");
                    b = input.nextInt();

                    System.out.println("Sonuç: " + cikar(a, b));
                    break;
                case 3:
                    System.out.print("Lütfen 1. sayıyı giriniz");
                    a = input.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz");
                    b = input.nextInt();

                    System.out.println("Sonuç: " + carp(a, b));
                    break;
                case 4:
                    System.out.print("Lütfen 1. sayıyı giriniz");
                    a = input.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz");
                    b = input.nextInt();
                    ;
                    System.out.println("Sonuç: " +bol(a, b));
                    break;
                case 5:
                    System.out.print("Lütfen 1. sayıyı giriniz");
                    a = input.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz");
                    b = input.nextInt();
                    System.out.println("Sonuç: " +bol(a, b));
                    break;
                case 6:
                    System.out.print("Lütfen 1. sayıyı giriniz");
                    a = input.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz");

                    System.out.println("Sonuç: " +faktoriyel(a));
                    break;
                case 7:
                    System.out.print("Lütfen 1. sayıyı giriniz");
                    a = input.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz");
                    b = input.nextInt();
                    ;
                    System.out.println("Sonuç: " +modAlma(a, b));
                    break;
                case 8:
                    System.out.print("Lütfen 1. sayıyı giriniz");
                    a = input.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz");
                    b = input.nextInt();
                    ;
                    System.out.println("Sonuç: " +DikdortgenAlan(a, b));
                    break;
                case 0:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("geçersiz komut");
            }
        } while (select != 0);

    }
}