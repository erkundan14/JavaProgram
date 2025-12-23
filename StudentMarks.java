//Wajp to print student Marks Sheet

import java.util.Scanner;

public class StudentMarks 
{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);

     System.out.println("Enter name");
     String name=sc.nextLine();
     System.out.println("Enter age");
     int age=sc.nextInt();
     System.out.println("Enter mobile no.");
     long mob=sc.nextLong();

     System.out.println("****Enter Subject Marks****");
     System.out.println("Enter maths marks");
     int m=sc.nextInt();
     System.out.println("Enter english marks");
     int e=sc.nextInt();
     System.out.println("Enter Hindi marks");
     int h=sc.nextInt();
     System.out.println("Enter physics marks");
     int p=sc.nextInt();
     System.out.println("Enter chemistry marks");
     int c=sc.nextInt();
     
     int tMarks=500;
     float oMarks=(m+e+h+p+c);
     System.out.println("\n");
     System.out.println("***** MARKS SHEETS *****");
     System.out.println("----------------------");
     System.out.println("Name:-"+name);
     System.out.println("Age :-"+age);
     System.out.println("Mob no:-"+mob);
     
     System.out.println("----------------------");
     System.out.println("Maths Marks :- "+m+"\nEnglis Marks :- "+e+"\nHindi Marks :- "+h+"\nPhysics Marks :- "+p+"\nChemistry Marks :-"+c);
    
     System.out.println("-----------------------");
     System.out.println(("| Total marks   = "+tMarks)+"  |");
     System.out.println(("| Obtaints Marks= "+(m+e+h+p+c))+"  |");
     System.out.println(("| Percentage    = "+(oMarks/tMarks*100))+" |");
    }
}


    /*
        double Highsal=x[0].salary;
        double Minsal=Integer.MAX_VALUE;
        for(int i=0;i<x.length;i++)
        {
            if(x[i].salary>Highsal) {
                Highsal=x[i].salary;
            }
            if(x[i].salary<Minsal) {
                Minsal=x[i].salary;
            }
        }
        System.out.println("Highest salary: "+Highsal+"\nLowest salary : "+ Minsal);
        */
        