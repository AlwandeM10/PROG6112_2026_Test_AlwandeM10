/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicfranchise;

/**
 *
 * @author sineg
 */
public class ElectronicFranchise {

    public static void main(String[] args) {
        //@D Array that captures the sales number for rthe 3 different cities
      int [][] salesData = {
          {1000,2000,3000},
          {2000,3000,4000},
          {1500,1100,1200}
      };
      
      //!D Array that captures the 3 different cities  given
      String [] cities = {"Cape Town","Port Elizabeth","Pretoria"};
      int highestSales = 0;
      int [] totals = new int[salesData.length];
     
      
        System.out.println("    PS5 XBOX  SWITCH");
        //Gaming Console Report section which contains the full data given
        System.out.println("-------------------------------------------------------");
        System.out.println("             GAMING CONSOLE REPORT                     ");
        System.out.println("-------------------------------------------------------");
        
           System.out.println(cities[i] +" : "+Arrays.toString(salesData[i]))
        for (int i=0;i<salesData.length;i++){ //For loop that ensures that all that is ran through and compared accordingly
        int salesTotal = salesData[i][0] +  salesData[i][1] + salesData[i][2];
        
        if (highestSales > salesTotal){
            
        }
//        int Total = 0;
        
           
    }
    }
}
