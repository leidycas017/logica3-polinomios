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

        int polinomios = 1;
        char opcion = 0;

        int Ex = 0;
        int Co = 0;
        Scanner teclado = new Scanner(System.in);

        PolVectorForma1 A = new PolVectorForma1();
        PolVectorForma1 B = new PolVectorForma1();
        PolVectorForma1 C = new PolVectorForma1();
        PolVectorForma1 D = new PolVectorForma1();
        PolVectorForma1 E = new PolVectorForma1();
        PolVectorForma1 F = new PolVectorForma1();
        PolVectorForma1 G = new PolVectorForma1();
        PolVectorForma1 H = new PolVectorForma1();
        PolVectorForma1 I = new PolVectorForma1();
        PolVectorForma1 J = new PolVectorForma1();

        do {
            System.out.println("\nIngreso de terminos del polinomio numero " + polinomios + ", para finalizar digite -999");

            switch (polinomios) {

                case 1:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                A = A.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(A);
                    break;

                case 2:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                B = B.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(B);
                    break;

                case 3:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                C = C.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(C);
                    break;

                case 4:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                D = D.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(D);
                    break;

                case 5:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                E = E.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(E);
                    break;

                case 6:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                F = F.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(F);
                    break;

                case 7:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                G = G.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(G);
                    break;

                case 8:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                H = H.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(H);
                    break;

                case 9:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                I = I.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(I);
                    break;

                case 10:
                    do {
                        while (Co != -999) {
                            System.out.println("Ingrese el coeficiente");
                            Co = teclado.nextInt();

                            if (Co != -999) {
                                System.out.println("Ingrese el exponente");
                                Ex = teclado.nextInt();
                                J = J.sumar(Co, Ex);
                            }
                        }
                    } while (Co != -999);
                    System.out.println(J);
                    break;

                default:
                    break;
            }

            Co = 0;
            polinomios++;

        } while (polinomios < 10);

        do {
            opcion = menu();

            switch (opcion) {

                case '1':

                    System.out.println("Ingrese el numero del polinomio que desea ver, si quiere verlos todos ingrese 0");
                    int pol = teclado.nextInt();

                    switch (pol) {
                        case 1:
                            System.out.println("1. "+A);
                            break;
                        case 2:
                            System.out.println("2. "+B);
                            break;
                        case 3:
                            System.out.println("3. "+C);
                            break;
                        case 4:
                            System.out.println("4. "+D);
                            break;
                        case 5:
                            System.out.println("5. "+E);
                            break;
                        case 6:
                            System.out.println("6. "+F);
                            break;
                        case 7:
                            System.out.println("7. "+G);
                            break;
                        case 8:
                            System.out.println("8. "+H);
                            break;
                        case 9:
                            System.out.println("9. "+I);
                            break;
                        case 10:
                            System.out.println("10. "+J);
                            break;
                        case 0:
                            System.out.println("Lista de polinomios");
                            System.out.println("1. "+A);
                            System.out.println("2. "+B);
                            System.out.println("3. "+C);
                            System.out.println("4. "+D);
                            System.out.println("5. "+E);
                            System.out.println("6. "+F);
                            System.out.println("7. "+G);
                            System.out.println("8. "+H);
                            System.out.println("9. "+I);
                            System.out.println("10. "+J);

                            break;

                        default:
                            System.out.println("El polinomio no existe");
                            break;

                    }
                    break;

                case '2':

                    System.out.println("Eliga el primer polinomio que desea multiplicar");
                    int pol1 = teclado.nextInt();

                    PolVectorForma1 polA = A;

                    if (pol1 == 2) {
                        polA = B;
                    }
                    if (pol1 == 3) {
                        polA = C;
                    }
                    if (pol1 == 4) {
                        polA = D;
                    }
                    if (pol1 == 5) {
                        polA = E;
                    }
                    if (pol1 == 6) {
                        polA = F;
                    }
                    if (pol1 == 7) {
                        polA = G;
                    }
                    if (pol1 == 8) {
                        polA = H;
                    }
                    if (pol1 == 9) {
                        polA = I;
                    }
                    if (pol1 == 10) {
                        polA = J;
                    }

                    System.out.println("Eliga el segundo polinomio que desea multiplicar");
                    int pol2 = teclado.nextInt();

                    PolVectorForma1 polB = A;

                    if (pol2 == 2) {
                        polB = B;
                    }
                    if (pol2 == 3) {
                        polB = C;
                    }
                    if (pol2 == 4) {
                        polB = D;
                    }
                    if (pol2 == 5) {
                        polB = E;
                    }
                    if (pol2 == 6) {
                        polB = F;
                    }
                    if (pol2 == 7) {
                        polB = G;
                    }
                    if (pol2 == 8) {
                        polB = H;
                    }
                    if (pol2 == 9) {
                        polB = I;
                    }
                    if (pol2 == 10) {
                        polB = J;
                    }

                    System.out.println(polA);
                    System.out.println(polB);

                    PolVectorForma1 polC;

                    int gradoC = polA.getGrado() + polB.getGrado();

                    polC = new PolVectorForma1(gradoC);

                    polC = polA.Multiplicar(polB);

                    System.out.println("El resultado de a multiplicacion es: "+polC);

                    break;

                case '3':

                    break;

                case '4':
                    System.out.println("Eliga el polinomio que desea derivar");
                    int polD = teclado.nextInt();

                    if (polD == 1) {
                         System.out.println("El resultado al derivar es: "+A.Derivar());
                    }
                    if (polD == 2) {
                        System.out.println("El resultado al derivar es: "+B.Derivar());
                    }
                    if (polD == 3) {
                        System.out.println("El resultado al derivar es: "+C.Derivar());
                    }
                    if (polD == 4) {
                        System.out.println("El resultado al derivar es: "+D.Derivar());
                    }
                    if (polD == 5) {
                        System.out.println("El resultado al derivar es: "+E.Derivar());
                    }
                    if (polD == 6) {
                        System.out.println("El resultado al derivar es: "+F.Derivar());
                    }
                    if (polD == 7) {
                        System.out.println("El resultado al derivar es: "+G.Derivar());
                    }
                    if (polD == 8) {
                        System.out.println("El resultado al derivar es: "+H.Derivar());
                    }
                    if (polD == 9) {
                        System.out.println("El resultado al derivar es: "+I.Derivar());
                    }
                    if (polD == 10) {
                        System.out.println("El resultado al derivar es: "+J.Derivar());
                    }

                    break;

                case '5':

                    System.out.println("Eliga el polinomio que desea Evaluar");
                    int polE = teclado.nextInt();

                    System.out.println("Ingrese el valor a evaluar");
                    int valor = teclado.nextInt();

                    if (polE == 1) {
                        System.out.println("El resultado es: " + A.Evaluar(valor));
                    }
                    if (polE == 2) {
                        System.out.println("El resultado es: " + B.Evaluar(valor));
                    }
                    if (polE == 3) {
                        System.out.println("El resultado es: " + C.Evaluar(valor));
                    }
                    if (polE == 4) {
                        System.out.println("El resultado es: " + D.Evaluar(valor));
                    }
                    if (polE == 5) {
                        System.out.println("El resultado es: " + E.Evaluar(valor));
                    }
                    if (polE == 6) {
                        System.out.println("El resultado es: " + F.Evaluar(valor));
                    }
                    if (polE == 7) {
                        System.out.println("El resultado es: " + G.Evaluar(valor));
                    }
                    if (polE == 8) {
                        System.out.println("El resultado es: " + H.Evaluar(valor));
                    }
                    if (polE == 9) {
                        System.out.println("El resultado es: " + I.Evaluar(valor));
                    }
                    if (polE == 10) {
                        System.out.println("El resultado es: " + J.Evaluar(valor));
                    }

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
