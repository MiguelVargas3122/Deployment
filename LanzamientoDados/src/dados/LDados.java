package dados;

import java.util.Scanner;


public class LDados {
    //Construimos nuestro metodo
   public void dados() {
       //Declaramos las Variables
       int dado1=0, dado2=0, dado3=0;
       //Permite ingresar valores por teclado
       Scanner obj = new Scanner(System.in);
       //Valores de entrada 
       System.out.println("Ingrese el numero del primer dado: ");
       dado1 = obj.nextInt();
       System.out.println("Ingrese el numero del segundo dado: ");
       dado2 = obj.nextInt();
       System.out.println("Ingrese el numero del tercer dado: ");
       dado3 = obj.nextInt();
       //Creamos las condiciones 
       if(dado1==6 && dado2==6 && dado3==6)
     {
         System.out.println("Exelente");
     }
       else if((dado1==6 && dado2==6) || (dado1==6 && dado3==6) || (dado2==6 &&
       dado3==6))
       {
           System.out.println("Muy Bien");
   }
       else if((dado1==6) || (dado2==6) || (dado3==6) )
       {
           System.out.println("Regular");
   }
       else
       {
           System.out.println("Pesimo");
      }  
   }
}
   

