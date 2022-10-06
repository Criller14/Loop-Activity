/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christian2;

import java.util.Scanner;

/**
 *
 * @author Asuque_CPE112
 */
public class Christian2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input=new Scanner (System.in);
    System.out.println("to continue... loop enter 1");
    int loop_control=input.nextInt();
    int x=0;
  
    
    while (loop_control==1){
          System.out.println("Switch input...: ");
          x=input.nextInt();
          switch(x){
    case 1:
           System.out.println("Christian is good");
           System.out.println("Christian is good");
           break;
    case 3:
           for (int i = 0; i < 10; i+=2) {// increment by 2 pareha ra sa i=i+2
           System.out.print(i);}
           break;
    case 9:
           for (int i = 0; i < 100; i++) {
           System.out.println(i);}
           break;
                  
          }
          
          System.out.println("Continue.. loop? ");
          loop_control=input.nextInt();
    }
    }
}
