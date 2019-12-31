/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ice;

import java.util.Scanner;
/**
 *
 * @author Sujikanna
 */
class Ice {

    /**
     * @param args the command line arguments
     */
    public static void main(String arg[]) {
        // TODO code application logic here
        String withsalad="";
        Scanner s = new Scanner(System.in);
        IceCream ic = new IceCream();
        System.out.println("Enter the Customer name:");
        String name = s.next();
        System.out.println("******************************");
        System.out.println("        WELCOME "+name);
        System.out.println("******************************");
        System.out.println();
        System.out.println("what do you want to add(fruitsalad/blackcurrant):");
        withsalad = s.next();
        if(withsalad.equals("fruitsalad")||withsalad.equals("fruit salad")){
            FruitSaladWithIceCream fs = new FruitSaladWithIceCream();
            System.out.println("Enter the flavour:");
            fs.flavor = s.next();
            System.out.println("Enter the number of scoops:");
            fs.numberOfScoops = s.nextInt();
            System.out.println("Enter the grams of fruitsalad:");
            fs.gramsOfFruitSalad = s.nextInt();
            
            System.out.println("*************************");
            System.out.println("Billing details for "+name+" ordered Ice cream with Fruit salad");
            System.out.println("*************************");
            
            System.out.println("Flavour Ordered:"+fs.flavor);
            System.out.println("Number of Scoops Ordered:"+fs.numberOfScoops);
            System.out.println("Grams of fruit salad ordered:"+fs.gramsOfFruitSalad);
            System.out.println("Total price:"+"Rs."+fs.getFruitSaladWithIceCreamPrice());
        
            //System.out.print(fs.gramsOfFruitSalad + " grams of fruit salad and ");
            //System.out.println(fs.numberOfScoops + " scoops of " + fs.flavor + " flavor price is : " + fs.getFruitSaladWithIceCreamPrice());
        }else if(withsalad.equals("blackcurrant")|| withsalad.equals("black currant")){
             blackcurrantWithIceCream kkm = new blackcurrantWithIceCream();
             System.out.println("Enter the flavour:");
            kkm.flavor = s.next();
            System.out.println("Enter the number of scoops:");
            kkm.numberOfScoops = s.nextInt();
            System.out.println("Enter the grams of blackcurrant:");
            kkm.gramsOfblackcurrant = s.nextInt();
            
            System.out.println("*************************");
            System.out.println("Billing details for "+name+" ordered Ice cream with BlackCurrant");
            System.out.println("*************************");
            
            System.out.println("Flavour Ordered:"+kkm.flavor);
            System.out.println("Number of Scoops Ordered:"+kkm.numberOfScoops);
            System.out.println("Grams of fruit salad ordered:"+kkm.gramsOfblackcurrant);
            System.out.println("Total price:"+"Rs."+kkm.getblackcurrantWithIceCreamPrice());
        
            //System.out.print(kkm.gramsOfblackcurrant+ " grams of blackcurrant and ");
            //System.out.println(kkm.numberOfScoops + " scoops of " + kkm.flavor + " flavor price is : " + kkm.getblackcurrantWithIceCreamPrice());
        }else{
            System.out.println("*************************");
            System.out.println("Billing details for "+name+" ordered Normal Ice cream");
            System.out.println("*************************");
            
            System.out.println("Enter the flavour:");
            ic.flavor = s.next();
            System.out.println("Enter the number of scoops:");
            ic.numberOfScoops = s.nextInt();
            
            System.out.println("Flavour Ordered:"+ic.flavor);
            System.out.println("Number of Scoops Ordered:"+ic.numberOfScoops);
            //System.out.println("Grams of fruit salad ordered:"+kkm.gramsOfblackcurrant);
            System.out.println("Total price:"+"Rs."+ic.getIceCreamPrice());
            //System.out.println(ic.numberOfScoops + " scoops of " + ic.flavor + " flavor price is : " + ic.getIceCreamPrice());
        }
        
        
        //System.out.println(ic.numberOfScoops + " scoops of " + ic.flavor + " flavor price is : " + ic.getIceCreamPrice());
    }
    static class IceCream
{
    String flavor;
    int numberOfScoops;
    
    double getIceCreamPrice()
    {
        double pricePerScoop = 35;
        return numberOfScoops * pricePerScoop;
    }
}

static class FruitSaladWithIceCream extends IceCream
{
    int gramsOfFruitSalad;

    double getFruitSaladWithIceCreamPrice()
    {
        double iceCreamPrice = getIceCreamPrice();
        double pricePerGram = 3;

        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
    }
}

static class blackcurrantWithIceCream extends IceCream
{
    int gramsOfblackcurrant;

    double getblackcurrantWithIceCreamPrice()
    {
        double iceCreamPrice = getIceCreamPrice();
        double pricePerGram = 1.25;

        return gramsOfblackcurrant * pricePerGram + iceCreamPrice;
    }
}
}
