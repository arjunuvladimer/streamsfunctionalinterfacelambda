package com.introduction;

public class Methods implements Company, Tata, Mahindra{
    // Abstract Method
   public void insertCompany(){
       System.out.println("Inserting a Company");
   }

   // Default method is being overidden
   @Override
   public void updateCompany(){
       System.out.println("I am changing the  implementation of Update Company");
   }

   // Abstract Method
   public void display(){

   }

    public static void main(String args[]){
       Methods obj1 = new Methods();
       obj1.insertCompany();
       obj1.updateCompany();

        Methods obj2 = new Methods();
        obj2.insertCompany();

        // Static Method
        Company.deleteCompany();





   }
}


