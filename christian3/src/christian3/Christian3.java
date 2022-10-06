/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christian3;

import java.util.Scanner;

/**
 *
 * @author Asuque_CPE112
 */
public class Christian3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int x= input.nextInt();
        System.out.println ("to continue... loop enter 1");
        int loop_control=input.nextInt();
      
        
       while (loop_control==1) {
           
          System.out.println("Switch input...:");
          x=input.nextInt();
          switch(x){
              
              case 1:
              System.out.println("Welcome to christian Calculator!");   
              System.out.println ("Enter a number:   ");
     
     
        int a1 = input.nextInt();
        String operation= input.next();
        int b2= input.nextInt();

            while(a1+b2 != 0){

        if(operation.equals("+")){ 
            System.out.println("Answer = " + (a1+b2));
        }
        else if(operation.equals("-")){ 
            System.out.println("Answer = " + (a1-b2));
        }
        else if(operation.equals("*")){ 
            System.out.println("Answer = " + (a1*b2));
        }   
        else if(operation.equals("/")){ 
            System.out.println("Answer = " + (a1/b2));
        }
        else {
            System.out.println("Math Error");
        }
            
            break;
        }
            case 2:
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if ((num ^ 1) == num + 1) 
            { 
             System.out.println("The entered number "+ num +" is Even"); 
            } 
            else 
            { 
            System.out.println("The entered number "+ num +" is Odd"); 
    } 
          }
       }
      
       System.out.println("Continue..looo?");
       loop_control=input.nextInt();
        
    }
    
}
