
package programmingwarehouse.project;

import java.util.Scanner;


public class ProgrammingWarehouseProject {

   public long fabonicciNumer(long n){
       //int result;
       if(n<=1)
           return n;
     //  System.out.println(n);
      //result=fabonicciNumer(n-1)+fabonicciNumer(n+1);
       
     // return result;
      return fabonicciNumer(n-1)+fabonicciNumer(n-2); //recursive part
      
   }
   public void print(long n){
       
       System.out.println(fabonicciNumer(n));
       
   }
   
   
 public static void main(String[] args) {
 
 Scanner scan= new Scanner(System.in);
 System.out.println("Enter the value for fabonicci no.:->");
 long n=scan.nextInt();
 ProgrammingWarehouseProject sol = new ProgrammingWarehouseProject();
 sol.print(n);

    }    
}
