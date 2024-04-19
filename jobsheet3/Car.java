public class Car {
    String name;
    int cc, BuyPrice, YearProduction;

    public Car (String na, int c, int bp, int yp) {
        name = na;
        cc = c;
        BuyPrice = bp;
        YearProduction = yp;
    }
    void printData() {
        System.out.println("Name Car : " + name);
        System.out.println("CC : " + cc);
        System.out.println("Buy Price : " + BuyPrice);
        System.out.println("Year Production : " + YearProduction);
    }
    double TotalTax() {
        if (cc > 1500) {
            return 0.1*BuyPrice;
        }
        else {
            return 0.075*BuyPrice;
        }
    }
    double Maintenance() {
        if (YearProduction < 2010) {
            return 0.08*BuyPrice;
        }
        else {
            return 0.05*BuyPrice;
        }
    }
    double TOTAL() {
        return TotalTax()+Maintenance();
    }
}
