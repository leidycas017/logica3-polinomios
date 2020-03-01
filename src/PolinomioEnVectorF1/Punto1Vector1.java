/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolinomioEnVectorF1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author YAR
 */
public class Punto1Vector1 {
   
    public static void main(String[] args) throws Exception {
            
        String listaPoli = "DatosPol.txt";
        Scanner s = new Scanner(new File(listaPoli));
        
        PolVectorForma1 polinomio1 = crearPolinomioDesdeArchivo(listaPoli);
        System.out.println(polinomio1);
        
       
        
         int Ex = 0;
        int Co = 0; 
        char opcion=0;
        System.out.println("Ingreso de terminos del polinomio, para finalizar digite -999");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el coeficiente");
        Co = teclado.nextInt();
        System.out.println("Ingrese el exponente");
        Ex = teclado.nextInt();
        
        PolVectorForma1 A = new PolVectorForma1();
        System.out.println(A);
        A= A.sumar(Co, Ex);            
        System.out.println(A);
        
        while(Co != -999){        
        
        System.out.println("Ingrese el coeficiente");
        Co = teclado.nextInt();
        
        if(Co != -999){
        System.out.println("Ingrese el exponente");
        Ex = teclado.nextInt();
        A= A.sumar(Co, Ex);
        System.out.println(A);           
        }
        }
        do{
           opcion = menu();
           
           switch (opcion){
               
               case '1':
                           System.out.println("Ingreso de terminos del polinomio, para finalizar digite -999");
        
        System.out.println("Ingrese el coeficiente");
        Co = teclado.nextInt();
        System.out.println("Ingrese el exponente");
        Ex = teclado.nextInt();
        
        PolVectorForma1 B = new PolVectorForma1();
        System.out.println(B);
        B= B.sumar(Co, Ex);            
        System.out.println(B);
        
        while(Co != -999){        
        System.out.println("Ingrese el coeficiente");
        Co = teclado.nextInt();
        
        if(Co != -999){
        System.out.println("Ingrese el exponente");
        Ex = teclado.nextInt();
        B= B.sumar(Co, Ex);
        System.out.println(B);           
        }
        }
                   break;
                   
               case '2':
                   System.out.println(A);
                   break;
                   
               case '3':
                           // 8x6  + 4x3 – 5
        int arrPolA[] = { 6, 8, 0, 0, 4, 0, 0, -5};
        // -8x6 + 10x + 20
        int arrPolB[] = { 6, -8, 0, 0, 0, 0, 10, 20};
        
        PolVectorForma1 polA = new PolVectorForma1(arrPolA);
        PolVectorForma1 polB = new PolVectorForma1(arrPolB);
        
        System.out.println( polA );
        System.out.println( polB );
        
        PolVectorForma1 polC;
        
                                 
             int gradoC = arrPolA[0] + arrPolB[0];
            /*
             int [] Arreglo3 = new int [gradoC + 2];
             
             Arreglo3[0]= gradoC;
             
             for(int i = 1 ; i < Arreglo3.length; i ++){
                 Arreglo3[i] = 0;    
             }
             
             polC = new PolVectorForma1(Arreglo3);
        
        */
                polC = new PolVectorForma1(gradoC);

                 polC = polA.Multiplicar(polB);     
                
                   System.out.println(polC);
        
        
        
            
                   
                   break;
                   
               case '4':
                   
                   break;
                   
               case '5':
                  
                   A= A.Derivar();
                  
                   System.out.println(A);
                   
                   break;
                   
               case '6':
                   
                   System.out.println(A.Evaluar(3));
                   
                   break;
                   
               case '7':
                   System.out.println("Eligio salir");
                   break;
           }
           
        }while(opcion != '7');        
        
    }
    
    public static char menu(){
    char opc;
    
    do    {
    System.out.println("Menu");
        System.out.println("1. Ingresar un polinomio");
        System.out.println("2. Mostrar polinomios");
        System.out.println("3. Multiplicar polinomios");
        System.out.println("4. Dividir polinomios");
        System.out.println("5. Derivar polinomios");
        System.out.println("6. Evaluar polinolinomio");
        System.out.println("7. Salir");
        
        Scanner teclado = new Scanner(System.in);
        opc = teclado.next().charAt(0);
        
    }while(opc < '1' || opc > '7' );
    return opc;
    }


        
    

    public static PolVectorForma1 crearPolinomioDesdeArchivo(String fname) throws FileNotFoundException, Exception {
        Scanner s = new Scanner(new File(fname));
        String Configuracion = s.nextLine();
        String[] configuracion = Configuracion.split(" ");
        int gradoArc = Integer.parseInt(configuracion[0]);
        //int coefPolArc = Integer.parseInt(configuracion[1]);
       PolVectorForma1 polArch = new PolVectorForma1 (gradoArc);
       
       for(int i=1; i < gradoArc +2; i++){
           
        int j = polArch.getExponente(i);
               
       int CoeA = Integer.parseInt(configuracion[i]);      
       polArch.setCoeficiente(CoeA, j);
         
       }
              System.out.println(polArch);

      
      
 while(s.hasNext("       ")){
        
            int i = 2;
            String nombre = "polinomio"+i;
            

        
        i++;
        }
 
            
       System.out.println(polArch);
        
       

       
        
        return polArch;

    }


        
}
        
        
        
       