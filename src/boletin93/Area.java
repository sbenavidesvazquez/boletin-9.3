
package boletin93;

import java.util.Scanner;


public class Area {
    float b, h;
    
    public Area(){
        
    }
            
    
    public void Calculo(){
        
        do{    
            Scanner dato=new Scanner(System.in);
        System.out.println("Introduzca base: ");
        b=dato.nextFloat();
        System.out.println("Introsuzca altura: ");
        h=dato.nextFloat();
           
        }
        while(b<=0 || h<=0);
         System.out.println("area = "+ (b*h));
    }
}
