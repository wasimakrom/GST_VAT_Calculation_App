
package com.company;
import java.util.Scanner;
public class Main {
  public static void main(String [] args){
      System.out.println("***** Enter your amount :*****");
      Scanner sc= new Scanner(System.in);

      System.out.print("Enter your item1 price : ");
      double item1=sc.nextDouble();

      System.out.print("Enter your item2 price : ");
      double item2=sc.nextDouble();

      System.out.print("Enter your item3 price : ");
      double item3=sc.nextDouble();

      System.out.print("Enter your item4 price : ");
      double item4=sc.nextDouble();
      double sum5=(item1 + item2  + item3 + item4 );

      System.out.println("Total items price is : " + sum5);


      double sum= sum5 * (0.18);

      System.out.println("Your GST 18% amount is  : "+ sum);
      double sum3= (sum5 * 0.1);
      System.out.println("Your VAT 10% amount  is : "+sum3);
      double sum4=(sum5+sum3);
      System.out.println("With VAT your price is  : "+ sum4);
      double sum2 =(sum5 + sum);
      System.out.println("Total price is with GST IS  : " + sum2);
  }
}