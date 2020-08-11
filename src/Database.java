import java.io.BufferedReader;
import java.io.FileReader;

public class Database {

    //Instance variables
    String filePathToCSV;
    int numberOfXL;
    int numberOfX;
    Driver[] drivers;

    Database() {}

    public int countLinesInCSV(String filename) {
        int i = 0;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(filename));
            String row = null;
            while ((row = csvReader.readLine()) != null) {
                i++;
            }
            csvReader.close();
        }
        //catch is handling he IOexception error from BufferedReader
        catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }

        // System.out.println("Number of lines in the file: " + (i+1));
        return i;
    }

    //Creates an Array of drivers by looping through Driver array
    public void printArray(Driver[] drivers) {
        System.out.print("[ ");
        for(Driver d: drivers) {
            System.out.print(d);
            System.out.print(",");
            System.out.println("");
        }
        System.out.print(" ]");
    }

    public void getDriversArray() {

        try {
            //csvReader reads the CSV file and check for drivers
            BufferedReader csvReader = new BufferedReader(new FileReader("drivers.csv"));
            String row = null;
            int i = 0;
            this.drivers = new Driver[countLinesInCSV("../bin/drivers.csv")-1];
            while ((row = csvReader.readLine()) != null) {
                // System.out.println(row);
                if(i > 0) {
                    String[] data = row.split(",");

                    //Creating new Car object
                    Car car = new Car(data[5].trim(), data[6].trim(), data[7].trim(), data[8].trim());
                    // System.out.println(car);

                    //Creating new Driver object
                    Driver driver = new Driver(car, data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim(), Integer.parseInt(data[4].trim()));
                    // System.out.println(driver);

                    if(data[8].trim().equals("X")) {
                        this.numberOfX++;
                    }
                    if(data[8].trim().equals("XL")) {
                        this.numberOfXL++;
                    }

                    this.drivers[i-1] = driver;
                }
                i++;

            }
            csvReader.close();
        }
        //catch is handling he IOexception error from BufferedReader
        catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public Driver[] getArrayByVehicleType(String vehicleType) {

        Driver[] Xdrivers = new Driver[this.numberOfX];
        Driver[] XLdrivers = new Driver[this.numberOfXL];

        int xindex = 0;
        int xlindex = 0;
        for(int i=0; i<this.drivers.length; i++) {
            if(this.drivers[i].getCar().getVehicleType().equals("X")) {
                Xdrivers[xindex] = this.drivers[i];
                xindex++;
            }
            if(this.drivers[i].getCar().getVehicleType().equals("XL")) {
                XLdrivers[xlindex] = this.drivers[i];
                xlindex++;
            }
        }

        if(vehicleType.equals("X")) {
            return Xdrivers;
        }

        return XLdrivers;
    }
}