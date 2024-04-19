import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa tempat yang kamu siapkan : ");
        int i = sc.nextInt();
        Car carlist[] = new Car[i];

        for (int j = 0;j < carlist.length;j++) {
            System.out.print("Car Name : ");
            String na = sc.next();
            System.out.print("CC : ");
            int totalcc = sc.nextInt();
            System.out.print("Buy Price : ");
            int carprice = sc.nextInt();
            System.out.print("Production Year : ");
            int caryear = sc.nextInt();
        }
        double totalmaintenance = 0;
        int jumlahmobil = 0;
        for (Car car : carlist) {
            car.printData();
            if (car.YearProduction > 2010) {
                totalmaintenance += car.Maintenance();
                jumlahmobil++;
            }
        }



    }
}
