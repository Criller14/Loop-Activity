/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christian.cal;

import java.util.Scanner;

/**
 *
 * @author Asuque_CPE112
 */
public class ChristianCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Christian Caculator");
        System.out.println("Enter a Number");
        
        int a =input.nextInt();
        String operation = input.next();
        int b = input.nextInt();
        
        while (a+b !=0){
            
        if (operation.equals("+")){
        System.out.println("answer=" + (a+b));}
            
        else if (operation.equals("-")){
        System.out.println("answer=" + (a-b));}
            
        else if (operation.equals("*")){
        System.out.println("answer=" + (a*b));}
            
        else if (operation.equals("/")){
        System.out.println("answer=" + (a/b));}
            
        else {
        System.out.println("Math Error");
                
                
            }
            break;
        }
    }
    
}
