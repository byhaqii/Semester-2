import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Input the number of elements you want to count : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.println("Input the data value to-" + (i + 1) + " : ");
            fk[i].num = sc.nextInt();
        }
        System.out.println("=============================================");
        System.out.println("Factorial Result with Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Factorial of Value " + fk[i].num + " is : " + fk[i].faktoialBF(fk[i].num));
        }
        System.out.println("=============================================");
        System.out.println("Factorial Results with Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Factorial of value " + fk[i].num + " is : " + fk[i].faktorialDC(fk[i].num));
        }
        System.out.println("=============================================");

    }
}