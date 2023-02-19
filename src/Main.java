import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c,alan,u;
        System.out.println("üçgenin ilk kenarını giriniz=");
        a=input.nextDouble();

        System.out.println("üçgenin ikinci kenarını giriniz=");
        b=input.nextDouble();

        System.out.println("üçgenin üçüncü kenarını giriniz");
        c=input.nextDouble();

        u=(a+b+c)/2;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı="+alan);
    }
}