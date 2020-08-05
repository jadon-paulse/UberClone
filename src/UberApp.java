import java.util.Scanner;

public class UberApp {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Uber App");

        Passenger steve = new Passenger("steve@gmail.com", "Steve", "Stevenson", "0731281283", 12000);
        // System.out.println(steve);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your starting location");
        String startPoint = sc.nextLine();

        System.out.println("Please enter your final destination");
        String endPoint = sc.nextLine();

        System.out.println("Please enter vehicle of your, choice, XL or X");
        String vehicleType = sc.nextLine();

        System.out.println("Starting Point: ");
        System.out.println(startPoint);
        System.out.println("\nEnd Point: ");
        System.out.println(endPoint);
        System.out.println("\nVehicle Type: ");
        System.out.println(vehicleType);
        System.out.println("");


        UberRide uberRide = new UberRide(startPoint, endPoint, steve);

        Driver assignedDriver = uberRide.assignDriver();

        System.out.println("\nCalculating cost...");
        uberRide.calculateCost(startPoint, endPoint);
        
        System.out.println("\nFinding you a driver...");
        System.out.println("Assigned driver: " + assignedDriver.getName() + " " + assignedDriver.getSurname());
        System.out.println("Assigned car: " + assignedDriver.getCar());
        
        System.out.println("\nYour ride is complete. Processing payment...");
        uberRide.completePayment(assignedDriver, steve);

    //     Car bmw = new Car("KA1234", "black", "BMW X5", "XL");
    //     System.out.println(bmw);

    //     Person akhil = new Person("Akhil", "Boddu", "07838282", 123.12);
    //     System.out.println(akhil);

    //     Driver sam = new Driver(bmw, "LICENSE12345", "Sam", "Person", "0731281283", 1000);
    //     System.out.println(sam);

    //     Passenger steve = new Passenger("steve@gmail.com", "Steve", "Stevenson", "0731281283", 12000);
    //     System.out.println(steve);
    } 

} 