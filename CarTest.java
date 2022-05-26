/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author james
 */
public class CarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a Car object with any initial gas amount and efficiency.
        Car car=new Car(40,25.31);
        //display gas, mileage and efficiency using three “get” methods, respectively.
        display_car_data(car);
        //call method drive to drive car for 40 miles
        boolean driving=true;
        while (driving)
        {
            if (!car.drive(40))
            {
                System.out.println("Adding 10 gallons of gas so that there might be enough.");
            }
            else
            {
                System.out.println("Topping off the tank with 10 gallons of gas after the drive.");
                driving=false;
            }
            //add 10 gallons gas to the card by calling addGas method
            car.add_gas(10);
            
        }
        /*display gas, mileage and efficiency again and make sure all values are make 
        sense after you drove the car and added gas.*/
        display_car_data(car);
    }
    
    /**
     * Displays the data for a Car.
     * @param car 
     */
    public static void display_car_data(Car car)
    {
        System.out.println("Gas:"+car.get_gas());
        System.out.println("Mileage:"+car.get_mileage());
        System.out.println("Efficiency:"+car.get_efficiency());
        System.out.println("--------------------------------");
    }
    
}
