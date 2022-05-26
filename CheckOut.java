/*
 *
 */
package week02;

/**
 * Adds prices for various items.
 * @author james
 */
public class CheckOut {
    public static void main(String[] args)
    {
        String milk_name="Milk";
        double milk=3.99;
        double milk_savings=.2;
        int milk_quantity=1;
        
        String eggs_name="Eggs";
        double eggs=2.99;
        double eggs_savings=0;
        int eggs_quantity=1;
        
        String bread_name="Bread";
        double bread=.99;
        double bread_savings=.3;
        int bread_quantity=3;
        
        String chips_name="Chips";
        double chips=1.99;
        double chips_savings=0;
        int chips_quantity=2;
        
        String deli_name="Deli";
        double deli=6.99;
        double deli_savings=0;
        int deli_quantity=1;
        
        double tax_rate=.0625;
        
        String[] names=
        {
            milk_name,
            eggs_name,
            bread_name,
            chips_name,
            deli_name
        };
        double[] base_prices=
        {
            milk, 
            eggs, 
            bread, 
            chips, 
            deli
        };
        double[] savings_rates=
        {
            milk_savings, 
            eggs_savings, 
            bread_savings,
            chips_savings,
            deli_savings
        };
        int[] quantities=
        {
            milk_quantity,
            eggs_quantity,
            bread_quantity,
            chips_quantity,
            deli_quantity
        };
        
        double running_total=0;
        double running_savings=0;
        
        System.out.println("Check out");
        System.out.println("----------");
        
        for(int i=0; i<5; i++)
        {
            System.out.print(names[i]);
            if(quantities[i]>1)
            {
                System.out.print(" x"+quantities[i]+"        ");
            }
            else
            {
                System.out.print("           ");
            }
            double full_price=base_prices[i]*quantities[i];
            double savings=full_price*savings_rates[i];
            double this_price=full_price-savings;
            System.out.printf("%.2f",this_price);
            System.out.println();
            running_total += this_price;
            running_savings += savings;
            if(savings_rates[i]>0)
            {
                System.out.printf(" Save %d",(int)(savings_rates[i]*100));
                System.out.print("%        ");
                System.out.printf("%.2f",savings);
                System.out.println();
            }
        }
        System.out.printf("Subtotal:        %.2f",running_total);
        System.out.println();
        System.out.printf("Your savings:     %.2f",running_savings);
        System.out.println();
        double taxes=tax_rate*running_total;
        System.out.printf("Tax:              %.2f",taxes);
        System.out.println();
        System.out.printf("Total:            %.2f",running_total+taxes);
        System.out.println();
        
        
    }
}
