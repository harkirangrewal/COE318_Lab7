/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author h36grewa
 */
public class UserMain implements UserInterface{
    String input = "";
    ArrayList<Object> cirElement = new ArrayList<>();
    Scanner userIn = new Scanner(System.in);
    
    public void start()
    {
        display();
        run();
    }
    
    public void run()
    {
        while(true){
            input = userIn.nextLine().trim();
            if(input.equalsIgnoreCase("end")) 
            {
                end();
                break;
            }
            else if(input.equalsIgnoreCase("spice"))
            {
                spice();
            }
            else
            {
                String[] value = input.split(" ");
                if(value.length != 4)
                {
                    System.out.println("Please review the format of your inputs");
                }
                else
                {
                    if(input.toLowerCase().startsWith("v"))
                    {
                        double temp;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.id = Integer.parseInt(value[1]);
                        n2.id = Integer.parseInt(value[2]);
                        temp = Double.parseDouble(value[3]);
                        VoltageSource v = new VoltageSource(temp, n1, n2);
                        cirElement.add(v);
                    }
                    else if (input.toLowerCase().startsWith("r"))
                    {
                       double temp;
                       Node n1 = new Node();
                       Node n2 = new Node();
                       n1.id = Integer.parseInt(value[1]);
                       n2.id = Integer.parseInt(value[2]);
                       temp = Double.parseDouble(value[3]);
                        Resistor r = new Resistor(temp, n1, n2);
                        cirElement.add(r);                              
                    }
                }
            }
            
        }
    }
    
    public void display()
    {
        System.out.println("Enter your input:");
    }
    
   public void spice()
   {
       for(Object o : cirElement)
       {
           System.out.println(o);
       }
    }
   
   public void end()
   {
       System.out.println("All done");
   }
   
   public static void main(String[] args)
   {
       UserMain m = new UserMain();
       m.start();
   }
}

 /*   private int n1,n2;
    
    public static void main (String[] args)
    {
        
         Circuit cir = Circuit.getInstance();
         
         while (input.next()!= "end")
         {
             if(input.next() == "r" || input.next() == "R" )
             {
               // If the user wishes to input a resistor 
                 double resistance = input.nextDouble();
                
                 n1 = input.nextInt();
                 
                 
                 
                 Resistor r1 = new Resistor();
                 
             }
             else if(input.next()== "v" || input.next()== "V")
             {
                 // If the user wishes to input a voltage source
             }
             else if(input.next() == "spice")
             {
                 // If the usr wishes to print the entire circuit
             }
             else
             {
                 System.out.println("Error, inavlid input");
             }
         }
         
         
    }
    
}
*/