/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.*;

/**
 *
 * @author h36grewa
 */
public class Circuit {
     public ArrayList<Resistor> resistors = new ArrayList<Resistor>();
     public ArrayList<VoltageSource> voltagesource = new ArrayList<VoltageSource>();
     
    
    public void addr(Resistor r)
    {
       resistors.add(r); 
    }
    
    public void addv(VoltageSource v)
    {
        voltagesource.add(v);
    }
    
        private static Circuit instance = null;
    
    public static Circuit getInstance()
    {
        if(instance  == null)
        {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit() {} //Yes, the constructor is PRIVATE!   

    
   public String toString()
   {
       String result1= "";
       String result= "";
       int i=0;
       
       //Checks in the array list to see if there are values to be outputted
       while(i<voltagesource.size() || i<resistors.size()) 
       {
           // If there are values in the voltage source arraylist, they are outputted at index i
           if(i<voltagesource.size())
           {
               result += voltagesource.get(i);
           }
           
           // If there are values in the resistor arraylist, they are outputted at index i
           if(i<resistors.size())
           {
               result1 += resistors.get(i);
           }
           i++;
       }   
       return result+result1;
   }
    

}