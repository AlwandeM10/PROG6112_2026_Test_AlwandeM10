/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author sineg
 */
public class ConsoleSales extends Consoles{
//Constructor
    public ConsoleSales(String deviceType, String storeName, int totalSales){
      super(deviceType,storeName,totalSales);  
    }
    @Override
    public String getConsoleType() {
        
        return getDeviceType();
        
    }

    public void printReport(){
        System.out.println("LOCATION: "+super.getDeviceType());
        System.out.println("STAFF NUMBER: "+super.getStoreName());
        System.out.println("HIRING STAFF: "+ getTotalSales());
     
    }

    @Override
    public String getStore() {
        
        return getStoreName();
        
    }

}

