import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Armut kac kilo");
        int a=scanner.nextInt();
        System.out.print("elma kac kilo");
        int e=scanner.nextInt();
        System.out.print("domates kac kilo");
        int d=scanner.nextInt();
        System.out.print("muz kac kilo");
        int m=scanner.nextInt();
        System.out.print("patlıcan kac kilo");
        int p=scanner.nextInt();
        double toplam=(armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p);
        System.out.print("toplam tutarınız= "+toplam+" tl");

    }
}
