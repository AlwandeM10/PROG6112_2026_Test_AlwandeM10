/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

import java.util.Arrays;

/**
 *
 * @author sineg
 */
public class Question1 {

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
     
      
        
        //Gaming Console Report section which contains the full data given
        System.out.println("-------------------------------------------------------");
        System.out.println("             GAMING CONSOLE REPORT                     ");
        System.out.println("-------------------------------------------------------");
        System.out.println("            PS5 XBOX  SWITCH");
        for (int i=0;i<salesData.length;i++){
           System.out.println(cities[i] +" : "+Arrays.toString(salesData[i]));
           int ps5 = salesData[i][0];
           int xbox = salesData[i][1];
           int Switch = salesData[i][2];
           
           int total = ps5 + xbox + Switch;
        totals[i] = total; 
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("         CONSOLE SALES TOTALS FOR EACH CITY                ");
        System.out.println("-----------------------------------------------------------");
        for (int i=0;i<salesData.length;i++){ //For loop that ensures that all that is ran through and compared accordingly
            System.out.println(cities[i] +" : "+totals[i]);  
        
            
            
            
//        if (highestSales > salesTotal[i]){
            
       // }
//        int Total = 0;
        
           
    }
    }
}
