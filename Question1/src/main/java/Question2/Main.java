/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author sineg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Device type(ps5/xbox/switch) : ");
        String device = input.nextLine();
        System.out.println("Enter Store Name: ");
        String store = input.nextLine();
        System.out.println("Enter total sales: ");
        int sales = input.nextInt();
        
        ConsoleSales salesC = new ConsoleSales(device,store,sales);
        salesC.printReport();
    }
    
}
