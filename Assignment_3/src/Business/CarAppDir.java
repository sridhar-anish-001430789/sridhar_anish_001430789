/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;
import java.util.ArrayList;

/**
 *
 * @author anish
 */
public class CarAppDir {
    private ArrayList<CarDetails>Car;
     public CarAppDir()
    {
        this.Car=new ArrayList<CarDetails>();
    }
      public ArrayList<CarDetails> getCar() {
        return Car;
    }
       public void setCar(ArrayList<CarDetails> Car) {
        this.Car =Car;
    }
       public CarDetails addCar(){
       CarDetails Carr=new CarDetails();
       Car.add(Carr);
       return Carr;  
   }  
       public void deleteCar(CarDetails c)
   {
       Car.remove(c);
   }
       public CarDetails searchcar(String ser_no)
       {
           for(CarDetails Carr : Car)
           {
               if(Carr.getSerial_Number().equals(ser_no))
               return Carr;
           }
           return null;
       }
}
