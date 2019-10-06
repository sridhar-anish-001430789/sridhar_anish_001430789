/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anish
 */
public class CarInformationList {
    private static CarInformationList carLists;
    public ArrayList<CarDetails> carList;
    private CarInformationList(){
        
        carList = new ArrayList<>();
        
        CarDetails car1 = new CarDetails(1000,"BMW","100",7,"Hawai",2019,"Yes","No");
        CarDetails car2 = new CarDetails(1001,"Ford","101",8,"NYC",2018,"Yes","No");
        CarDetails car3 = new CarDetails(1002,"GM","102",9,"Hawai",2017,"Yes","Yes");
        CarDetails car4 = new CarDetails(1003,"Fiat","103",10,"Dallas",2016,"Yes","Yes");
        CarDetails car5 = new CarDetails(1004,"Fiat","104",11,"Dallas",2013,"Yes","Yes");
        CarDetails car6 = new CarDetails(1005,"Ford","105",15,"Maine",2011,"Yes","Yes");
        CarDetails car7 = new CarDetails(1006,"BMW","106",106,"Maine",2012,"No","Yes");
        CarDetails car8 = new CarDetails(1007,"GM","109",1088,"NYC",2016,"No","No");
        CarDetails car9 = new CarDetails(1008,"BMW","1083",180,"Hawai",2013,"No","Yes");
        CarDetails car10 = new CarDetails(1009,"Fiat","1203",120,"NYC",2010,"No","Yes");
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        
    }
     public static CarInformationList  getCarList() {
        carLists = new CarInformationList();
        return carLists;
    }
}
