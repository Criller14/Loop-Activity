/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asuque.store;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class ASUQUESTORE {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("   !!!WELCOME TO ASUQUE'S REALME STORE  !!!   ");
    System.out.println(" ===================================  ");
    System.out.println("         ASUQUE'S REALME STORE ITEM           ");
    System.out.println("   1. Realme 7                Php. 11000 ");
    System.out.println("   2. Realme 7 pro            Php. 15500 ");
    System.out.println("   3. Realme 8                Php. 14000 ");
    System.out.println("   4. Realme 8 pro            Php  17000 ");
    System.out.println("   5. Realme 9 pro+           Php. 18000 ");
    System.out.println(" ==================================== ");
    System.out.println("         LIMITED PROMO STOCK IN ASUQUE REALME PHONE STORE         ");
    System.out.println(" 6. P1-Realme 7 pro with Free tempered glass and case   Php. 16000 ");
    System.out.println(" 7. P2-Realme 8  with Free tempered glass and case  Php. 14200  ");
    System.out.println(" 8. Cancel                             ");
    System.out.println(" ====================================  ");
    System.out.println("               DISCOUNTS               ");
    System.out.println(" 1. If total cost is Php 36000+ - 10%         ");
    System.out.println(" 2. If total cost is Php 22000+ - 5%         ");
    System.out.println(" ====================================  ");
    }
   public static void order(){
    System.out.println(" Press 1 for Realme 7             ");
    System.out.println(" Press 2 for Realme 7 pro          ");
    System.out.println(" Press 3 for Realme 8              ");
    System.out.println(" Press 4 for Realme 8 pro       ");
    System.out.println(" Press 5 for  Realme 9 pro+  ");
    System.out.println(" Press 6 for promo 1   ");
    System.out.println(" Press 7 for promo 2   ");
    System.out.println(" Press 8 to cancel     ");
    System.out.println(" Enter your order:        ");
    choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println(" You choose Realme 7  ");
                System.out.print(" How many Realme 7  you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*11000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                    }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=36000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");  
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                     do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);                      
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);                        
                        break; } break; }
                    }
                else if (total>=22000 && total<=25000){
                    System.out.println(" You have 5% discount ");
                         double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay <discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);                       
                        break;}
                        }while(true);}
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);        
                        break;}  break; }
                    }
                else if (total<=15000){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();    
                    if(pay < total){
                         do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);         
                        break; }
                        }while(true);  }
                       else if (pay >=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}break; }
                    }
               case 2:
                System.out.println(" You choose Realme 7 pro ");
                System.out.print(" How many Realme 7 pro you want to Buy? : ");
                quantity =input.nextInt();
                total = total +(quantity*15500);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=36000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount "); 
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted ");
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                          do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);    
                        break;}
                        }while(true);}
                       else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break; } break;}
                    }
                else if (total>=22000 && total<=25000){
                    System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your total discounted cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay <discount){
                          do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break; }
                        }while(true); }
                        else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;} break;}
                    }
                 else if (total<=15000){
                        System.out.println(" Enter a payment: ");
                        pay = input.nextDouble();
                         if(pay <total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);   
                        break;}
                        }while(true);}
                       else if (pay >=total){
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;  }break;}
                   }
                
            case 3:
                System.out.println(" You Realme 8  ");
                System.out.print(" How many Realme 8 you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*14000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=36000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;}
                       }while(true); }
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break;} break; }
                    }
                else if (total>=22000 && total<=25000){
                    System.out.println(" You have 5% discount ");  
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break;}
                        }while(true); }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break;   }  break; }
                    }
                else if (total<=15000){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){         
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}
                        }while(true); }
                       else if (pay >=total){    
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);     
                        break; }break;}
                    }
            case 4:
               System.out.println(" You choose Realme 8 pro  ");
                System.out.print(" How many Realme 8 pro you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*17000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? "); 
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=36000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" 5"
                                + "Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                          total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true);   }
                     else if (pay >=discount){     
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }  break; }
                    }
                else if (total>=22000 && total<=25000){
                    System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;  }  break; }
                    }
                else if (total<=15000){ 
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){         
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                          total = pay-total;
                        System.out.println(" Your change is Php " + total);    
                        break;  }
                        }while(true);}
                       else if (pay >=total){      
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);  
                        break;  } break; } 
                    }
            case 5:
               System.out.println(" You choose Realme 9 pro+ ");
                System.out.print(" How many Realme 9 pro+ you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*18000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? "); 
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();}else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=36000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){  
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;}  break;     } }
                else if (total>=22000 && total<=25000){
                    System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){      
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }  break;   }
                    }
                else if (total<=15000){ 
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();  
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){       
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;  }
                        }while(true);  }
                       else if (pay >=total){     
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;    } break; }
                    }
                case 6:
                System.out.println("  Realme 7 pro Free tempered glass and case ");
                System.out.print(" How many  Realme 7 pro Free tempered glass and case you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*16000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=36000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount ");
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }
                        }while(true);}
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;  }  break; }
                   }
                else if (total>=22000 && total<=25000){
                    System.out.println(" You have 5% discount ");  
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){  
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){          
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }
                        }while(true);  }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; } break; }
                    }
                else if (total<=15000){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        
                        break;}
                        }while(true); }
                       else if (pay >=total){    
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        
                        break;   } break; }
                }
                case 7:
                System.out.println(" P2-Realme 8  with Free tempered glass and case ");
                System.out.print(" How many  P2-Realme 8  with Free tempered glass and case to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*90);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=36000){
                        System.out.println("  ");
                        System.out.println(" You have 10% discount "); 
                        double discount=total*.90;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;     }
                        }while(true);   }                      
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break; } break; }
                    }
                else if (total>=22000 && total<=25000){
                    System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }   break;}
                    }
                else if (total<=15000){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();    
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}
                        }while(true); }
                       else if (pay >=total){  
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                         break; }  break; }
                }
                 case 8:
                    System.exit(0);    
                default:      
            break;         }
       System.out.println(" Transaction complete...");
       System.out.println(" Thankyou for buying! ");
       System.out.println(" ");
       System.out.println(" For next customer press 1: ");
       System.out.println(" To exit press 2: ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    total=total-total;
                    order();    }
                else{
                    System.exit(0);}
   }
    public static void main(String[] args) {
        menu();
       order();
    }   
    }