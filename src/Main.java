import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("1. Sayıyı Girin: ");
        a = input.nextInt();

        System.out.print("2. Sayıyı Girin: ");
        b = input.nextInt();

        System.out.print("3. Sayıyı Girin: ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        } else {
            if (b < a) {
                System.out.println("c<b<a");
            } else {
                System.out.println("c<a<b");
            }
//Büyükten Küçüğe
            /*if ((a > b) && (a > c)) {
                if (b > c) {
                    System.out.println("a>b>c");
                } else {
                    System.out.println("a>c>b");
                }
            } else if ((b > a) && (b > c)) {
                if (a > c) {
                    System.out.println("b>a>c");
                } else {
                    System.out.println("b>c>a");
                }
            } else {
                if (b > a) {
                    System.out.println("c>b>a");
                } else {
                    System.out.println("c>a>b");
                }*/
            }
        }
    }