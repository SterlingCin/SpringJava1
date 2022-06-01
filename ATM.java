# SpringJava1
import java.util.Scanner;

//ATM
class Main {
  public static void main(String[] args) {
    //create scanner
    Scanner input = new Scanner(System.in);
    
    double balance = 0;
     System.out.println("Your balance is:" + balance);
    System.out.println("Please input your deposit/withdrawal amount (negative values count as withdrawal):");
    try{
    while(!input.equals("done")|| !input.equals("Done")){
      double amount = input.nextDouble();
      if(balance + amount < 0){
        System.out.println("Your account can't have negative values");
      }else{
      balance += amount;
      System.out.println("Your balance is:" + balance);
    System.out.println("Please input your deposit/withdrawal amount (negative values count as withdrawal):");
      }
      }
    }catch(Exception e){
      
    }
    }
}
  
