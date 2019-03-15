/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atm_system;
import java.util.ArrayList;




public class account {
    private double Balence ;
    private String accountnumber;
     private String accountholder;
      private String opendate;
      

    public account(double Balence, String accountnumber, String accountholder, String opendate) {
        this.Balence = Balence;
        this.accountnumber = accountnumber;
        this.accountholder = accountholder;
        this.opendate = opendate;
    }

   
    
   private ArrayList<Transaction1> history= new ArrayList(5);
      
   public account(){
          
          Balence=0.0;
         
      }

  
      public void deposit(double amount){
          this.Balence= this.Balence + amount;
           check(new Transaction1(amount,Balence,"deposit"));
       }
     
   public void withdraw(double amount){
       
       if (amount<=Balence){
      this.Balence = this.Balence - amount;
         }  else
           
                System.err.println("transaction cancel");
        check(new Transaction1(amount,Balence,"withdraw"));
}
   
    public double getBalence(){
         
        return Balence;
         
    }
    public void setbalence( double amount){
    Balence =amount;
    }
     
      private void check(Transaction1 transaction){
      if (history.size()==5)
      {history.remove(0);
   
              }
              history.add(transaction);
      
      }
              
public  ArrayList<Transaction1> gethistory(){
    
    return history; 
  
}

} 


