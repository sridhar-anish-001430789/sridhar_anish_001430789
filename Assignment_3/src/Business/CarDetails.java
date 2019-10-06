/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;
import java.util.Date;

/**
 *
 * @author anish
 */
public class CarDetails {
    private int Model_Number;
    private String Car_Manufacturers;
    private String Serial_Number;
    private int Seating_capacity;
    private String Car_City;
    private int Year_Manufacture;
    private String Avail_car;
    private int Car_Count;
    private int Min_Max_Seats;
    private String Car_Uber;
    private String Fleet_Updated;
    private String Car_Expired;     
    private int Plate_Number;
    private Date created_On;

    public Date getCreated_On() {
        return created_On;
    }

    public void setCreated_On(Date created_On) {
        this.created_On = created_On;
    }
  
   
    public CarDetails (){
        
    }

    public CarDetails(int Model_Number,String Car_Manufacturers,String Serial_Number,
            int Seating_capacity,String Car_City,int Year_Manufacture,
            String Avail_car,String Car_Expired) {
        this.Model_Number=Model_Number;
        this.Car_Manufacturers=Car_Manufacturers;
        this.Serial_Number=Serial_Number;
        this.Seating_capacity=Seating_capacity;
        this.Car_City=Car_City;
        this.Year_Manufacture=Year_Manufacture;
        this.Avail_car=Avail_car;
        this.Car_Expired=Car_Expired;
        this.created_On=new Date();
        
    }
    public int getSeating_capacity() {
        return Seating_capacity;
    }

    public void setSeating_capacity(int Seating_capacity) {
        this.Seating_capacity = Seating_capacity;
    }

    public int getPlate_Number() {
        return Plate_Number;
    }

    public void setPlate_Number(int Plate_Number) {
        this.Plate_Number = Plate_Number;
    }

    public String getAvail_car() {
        return Avail_car;
    }

    public void setAvail_car(String Avail_car) {
        this.Avail_car = Avail_car;
    }

    public int getCar_Count() {
        return Car_Count;
    }

    public void setCar_Count(int Car_Count) {
        this.Car_Count = Car_Count;
    }

    public String getCar_Manufacturers() {
        return Car_Manufacturers;
    }

    public void setCar_Manufacturers(String Car_Manufacturers) {
        this.Car_Manufacturers = Car_Manufacturers;
    }

    public int getYear_Manufacture() {
        return Year_Manufacture;
    }

    public void setYear_Manufacture(int Year_Manufacture) {
        this.Year_Manufacture = Year_Manufacture;
    }

    public int getMin_Max_Seats() {
        return Min_Max_Seats;
    }

    public void setMin_Max_Seats(int Min_Max_Seats) {
        this.Min_Max_Seats = Min_Max_Seats;
    }

    public String getSerial_Number() {
        return Serial_Number;
    }

    public void setSerial_Number(String Serial_Number) {
        this.Serial_Number = Serial_Number;
    }

    public int getModel_Number() {
        return Model_Number;
    }

    public void setModel_Number(int Model_Number) {
        this.Model_Number = Model_Number;
    }

    public String getCar_Uber() {
        return Car_Uber;
    }

    public void setCar_Uber(String Car_Uber) {
        this.Car_Uber = Car_Uber;
    }

    public String getFleet_Updated() {
        return Fleet_Updated;
    }

    public void setFleet_Updated(String Fleet_Updated) {
        this.Fleet_Updated = Fleet_Updated;
    }

    public String getCar_City() {
        return Car_City;
    }

    public void setCar_City(String Car_City) {
        this.Car_City = Car_City;
    }

    public String getCar_Expired() {
        return Car_Expired;
    }

    public void setCar_Expired(String Car_Expired) {
        this.Car_Expired = Car_Expired;
    }
    @Override
    public String toString()
    {
        return Integer.toString(this.getModel_Number()); 
    }
}
