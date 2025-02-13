package Level1;

public class CarRental {
    private int perday = 100;
    private String CustomerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    CarRental(String CustomerName, String carModel, int rentalDays) {
        this.CustomerName = CustomerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalRents(){
        this.totalCost = perday * rentalDays;
        return  this.totalCost;
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental("ritick", "BMW", 15);
        System.out.println(c1.calculateTotalRents());
    }

}
