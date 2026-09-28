/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yearlysales;

/**
 *
 * @author Student
 */
public class YearlySales {

    public static void main(String[] args) {
        int[][] sales= {
            {1000, 2000,1500}, //PS5
            {2000, 3000, 1100}, //XBOX
            {3000, 4000, 1200} //SWITCH
            
        };
        String[] City= ("CAPE TOWN", "PORT ELIZABETH", "PRETORIA");
        
        System.out.println("Gaming Console Report");
        System.out.println("------------------------------------------------------------");
        System.out.println("PS5\t PS5\t XBOX\t SWITCH \t");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Console Sales For Each City");
        System.out.println("Cape Town", "Port Elizabeth", "Pretoria");
        System.out.println("-------------------------------------------------------------");
        System.out.println("6000", "9000","3800");
        System.out.println("City With The Most Console Sales: Port Elizabeth");
        for(int i = 0; i<sales.length; i++) {
        int total = 0;
        
        System.out.println(sales[i + "\t"]);
        
        for(int j=0; j<sales[i]. length; j++){
            System.out.println(sales[i][j]);
            total = total + sales[i][j];
        }
        }
        
    }
}
 