/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolinomioEnVectorF1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Permite el ingreso de varios polinomios (solicitando cada uno de sus términos), sobre los cuales se puede realizar operaciones como:
 * - Sumar o restar (según el caso sobre el mismo polinomio), es decir; ir simplificando.
 * - Permite mostrar en la pantalla los polinomios ingresados en cualquier momento (todos a la vez ó el que el usuario quiera buscar mediante el orden de ingreso previo).
 * - Multiplicar dos polinomios de los ingresados y guardados previamente en memoria, y se crea un nuevo polinomio que es mostrado al usuario.
 * - Dividir dos polinomios de los ingresados y guardados previamente en memoria, y se crea un nuevo polinomio que es mostrado al usuario.
 * - Derivar cualquiera de los polinomios que están en memoria.
 * - Evaluar el polinomio, es decir, se entrega el valor de la variable y se retorna el resultado.
 * @author: Yuly Alvear
 * @author: Brian Vanegas
 * @author: Leidy Castaño
 * @author: Emiro
 * @version: 03/03/2020/A
 * @see <a href = "https://github.com/YulyAR/logica3-polinomios.git" /> Url de Repositorio en Github - Polinomio representado en Vector Forma1 </a>
 */
public class Punto1Vector1 {

    public static void main(String[] args) throws Exception {

        char opcion = 0;
        int Ex = 0;
        int Co = 0;
        Scanner teclado = new Scanner(System.in);
        List<PolVectorForma1> misPolinomios = new ArrayList<>();
        
        do {
            System.out.println("\nIngreso de terminos del polinomio numero " + (misPolinomios.size() + 1) + ", para finalizar digite -999");

            PolVectorForma1 polinomio = new PolVectorForma1();

            do {
                while (Co != 999) {
                    System.out.println("Ingrese el coeficiente");
                    Co = teclado.nextInt();

                    if (Co != 999) {
                        System.out.println("Ingrese el exponente");
                        Ex = teclado.nextInt();
                        polinomio = polinomio.sumar(Co, Ex);
                    }
                }
            } while (Co != 999);
            System.out.println(polinomio);
            misPolinomios.add(polinomio);
            Co = 0;

        } while(misPolinomios.size() < 2);

        do {
            opcion = menu();

            switch (opcion) {

                case '1':
                    System.out.println("Ingrese el numero del polinomio que desea ver, si quiere verlos todos ingrese 0");
                    int pol = teclado.nextInt();

                    if (pol > 0) {
                        if(pol-1 >= misPolinomios.size()) {
                            System.out.println("no existe el polinomio");
                        } else {
                            System.out.println(misPolinomios.get(pol-1));
                        }
                    } else {
                        for(int i=0; i < misPolinomios.size(); i++ ) {
                            System.out.println(misPolinomios.get(i)+"\n");
                        }
                    }
                    break;

                case '2':

                    System.out.println("Eliga el primer polinomio que desea multiplicar");
                    int pol1 = teclado.nextInt();
                    System.out.println(misPolinomios.get(pol1-1));

                    System.out.println("Eliga el segundo polinomio que desea multiplicar");
                    int pol2 = teclado.nextInt();
                    System.out.println(misPolinomios.get(pol2-1));

                    int gradoC = misPolinomios.get(pol1-1).getGrado() + misPolinomios.get(pol2-1).getGrado();
                    PolVectorForma1 polC = new PolVectorForma1(gradoC);
                    polC = misPolinomios.get(pol1-1).Multiplicar(misPolinomios.get(pol2-1));
                    System.out.println("El resultado de a multiplicacion es: "+polC);

                    break;

                case '3':

                    break;

                case '4':
                    System.out.println("Eliga el polinomio que desea derivar");
                    int polD = teclado.nextInt();
                    System.out.println("El resultado al derivar es: "+misPolinomios.get(polD-1).Derivar());

                    break;

                case '5':

                    System.out.println("Eliga el polinomio que desea Evaluar");
                    int polE = teclado.nextInt();

                    System.out.println("Ingrese el valor a evaluar");
                    int valor = teclado.nextInt();

                    System.out.println("El resultado es: " + misPolinomios.get(polE-1).Evaluar(valor));

                    break;

                case '6':
                    System.out.println("Eligio salir");
                    break;
            }

        } while (opcion != '6');

    }

    public static char menu() {
        char opc;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mostrar polinomios");
            System.out.println("2. Multiplicar polinomios");
            System.out.println("3. Dividir polinomios");
            System.out.println("4. Derivar polinomios");
            System.out.println("5. Evaluar polinolinomio");
            System.out.println("6. Salir");

            Scanner teclado = new Scanner(System.in);
            opc = teclado.next().charAt(0);

        } while (opc < '1' || opc > '6');
        return opc;
    }

}
