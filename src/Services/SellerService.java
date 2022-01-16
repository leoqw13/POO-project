
package Services;

import Entities.Seller;
import java.util.Date;
import java.util.Scanner;


public class SellerService {
     Scanner sc = new Scanner(System.in);
    public Seller register(){
        
        Seller s1 = new Seller();
        
       
        System.out.println("Enter the seller's name");
        s1.setName(sc.next());
        System.out.println("Enter the seller's ID");
        s1.setId(sc.nextInt());
        System.out.println("Enter the seller's basic salary");
        s1.setBasicSalary(sc.nextDouble());
    
        System.out.println("Enter the day when the seller started working");
     int day = sc.nextInt();
        System.out.println("Enter the month when the seller started working");
     int month = sc.nextInt();
        System.out.println("Enter the year when the seller started working");
     int year = sc.nextInt();
  Date date= new Date(year-1900,month-1,day);
  s1.setStartDate(date);
  return s1;
    }
    
    public void monthlySalary(Seller s1){
        System.out.println("Enter what the seller's total sales were");
        Double sales = sc.nextDouble();
        s1.setCommissions(sales*0.15);
        s1.setMonthlySalary(s1.getBasicSalary()+s1.getCommissions());
        System.out.println("The monthly salary of the seller: " +s1.getName()+ " is $" +s1.getMonthlySalary());
    }
    public void holidays(Seller s1){
        Date today = new Date();
        int seniority = today.getYear()- s1.getStartDate().getYear();
        if (seniority<5) {
            System.out.println("You get 14 days of vacation ");
        } else if (seniority<10) {
                   System.out.println("You get 21 days of vacation ");
        }else if (seniority<20) {
                   System.out.println("You get 28 days of vacation ");
        }else if (seniority>20) {
                   System.out.println("You get 35 days of vacation ");
    }else{
            System.out.println("the employee has proportional vacation");
        }
}}
