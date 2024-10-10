
package it2c.bohol;

import java.util.Scanner;

public class IT2CBOHOL {

    
      public void addclient(){
        Scanner sc = new Scanner(System.in);
        Config conf = new Config();
        System.out.print("First Name: ");
        String fname = sc.next();
        System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("Age:");
        String  age = sc.next();
        System.out.print("Address: ");
        String address = sc.next();
        System.out.print("Contact Number: ");
        String contact = sc.next();

        String sql = "INSERT INTO tbl_birthingcenter (b_clientNumber,b_fname, b_lname, b_age, b_address, b_contactnumber) VALUES (?, ?, ?, ?, ?)";
        conf.addRecord(sql, fname, lname,age, address, contact);
      }
      
      private void viewclient(){
       String cqry = "SELECT * FROM tbl_birthingcenter";
       String[] hrds = {"ClientNumber","First Name","Last Name","Age","Address","Contact Number"};
       String[]clmns = {"b_clientNumber","b_fname","b_lname","b_age","b_address","b_contactnumber"};
       Config conf = new Config();
       conf.viewRecords(cqry, hrds, clmns );
      }
      
      private void updateclient(){
      Scanner sc = new Scanner(System.in);
         System.out.print("Enter client number:");
         int clientNumber = sc.nextInt();
         System.out.println("Enter the new First Name:");
         String ufname = sc.next();
         System.out.println("Enter the new Last Name:");
         String ulname = sc.next();
         System.out.println("Enter the new Age:");
         String uage = sc.next();
         System.out.println("Enter the new Address:");
         String uaddress = sc.next();
         System.out.println("Enter the new Contact Number:");
         String ucontact = sc.next();
      
      String qry = "UPDATE tbl_birthingcenter SET b_fname = ?,b_lname = ?,b_age = ?, b_address = ?, b_contactnumber = ? WHERE b_clientNumber = ?";
      Config conf =  new Config();
      conf.updateRecord(qry, ufname, ulname, uage, uaddress, ucontact ,clientNumber );
      }
      
      private void deleteclient(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter client number to delete:");
            int clientNumber = sc.nextInt();
            
           String sqlDelete = "DELETE FROM tbl_birthingcenter WHERE b_clientNumber = ?";
           Config conf = new Config();
           conf.deleteRecord(sqlDelete, clientNumber);
      
      }
      

    public static void main(String[] args) {
      
      Scanner sc = new Scanner (System.in);
      String response;
      
      do{
          System.out.println("1. ADD");
          System.out.println("2. VIEW");
          System.out.println("3. UPDATE");
          System.out.println("4. DELETE");
          System.out.println("5. EXIT");
      
          System.out.println("Enter Action:");
          int action = sc.nextInt();
          IT2CBOHOL client = new IT2CBOHOL();
          
      switch(action){
          
          case 1:
             
              client.addclient();
              
              
              break;
              
              
              
          case 2:
              
              client.viewclient();
              
              break;
              
              
          case 3:
              
               client.viewclient();
               client. updateclient();
              
              break;
              
              
              
          case 4:
              
              client.viewclient();
              client.deleteclient();
              client.viewclient();

              break;
              
              
          case 5:
              
              System.out.println("Existing......");
              
              break; 
          default:
              System.out.println("Invalid action, Please try again.");
      }
      
          System.out.println("Do you want to continue? (yes/no):");
          response = sc.next();
     
      }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thank You, See you soon!");
          
        
        
        
      }    
        
        
    
  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
