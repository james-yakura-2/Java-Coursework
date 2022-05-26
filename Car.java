/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 * A car created for the Week 2 homework.
 * @author james
 */
public class Car {
    double mileage;
    double gas;
    double efficiency;
    
    /**
     * Create a new Car.
     * @param init_gas The amount of gas originally in the car in gallons.
     * @param e The car's efficiency in miles per gallon.
     */
    public Car(double init_gas, double e)
    {
        mileage=0;
        gas=init_gas;
        efficiency=e;
    }
    
    /**
     * Check the car's mileage.
     * @return The car's mileage.
     */
    public double get_mileage()
    {
        return mileage;
    }
    
    /**
     * Check the car's efficiency in miles per gallon.
     * @return The car's efficiency.
     */
    public double get_efficiency()
    {
        return efficiency;
    }
    
    /**
     * Check the amount of gas in the car.
     * @return The amount of gas.
     */
    public double get_gas()
    {
        return gas;
    }
    
    /**
     * Add gas to the car.
     * @param amount The amount of gas added in gallons.
     */
    public void add_gas(double amount)
    {
        gas += amount;
    }
    
    /**
     * Drive the car a certain distance.
     * @param miles The distance driven in miles.
     * @return Whether there was enough gas to drive.
     */
    public boolean drive(double miles)
    {
        if(gas*efficiency>=miles)
        {
            mileage += miles;
            double gas_spent=miles/efficiency;
            gas -= gas_spent;
            return true;
        }
        else
        {
            System.out.println("Not enough gas!");
            return false;
        }
    }
    
}
