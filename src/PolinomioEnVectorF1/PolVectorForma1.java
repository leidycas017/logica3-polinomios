/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolinomioEnVectorF1;

import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author YAR
 */
public class PolVectorForma1 {

    private int[] arregloA;

    /**
     * Constructor que crea un arreglo sin coeficientes de grado n
     *
     * @param n es el grado
     */
    public PolVectorForma1(int n) {
        arregloA = new int[n + 2];
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = 0;
        }
        arregloA[0] = n;
    }

    /**
     * Constructor de un polinomio conociendo el arreglo de enteros
     *
     * @param arreglo
     */
    public PolVectorForma1(int[] arreglo) {
        this.arregloA = arreglo;
    }

    /**
     * Constructor que cree un arreglo sin coeficiente
     */
    PolVectorForma1() {
        arregloA = new int[1];
        arregloA[0] = -1;
    }

    /**
     * Obtener el grado
     *
     * @return
     * @throws Exception
     */
    public int getGrado() throws Exception {
        if (arregloA != null) {
            return arregloA[0];
        } else {
            throw new NullPointerException("El arreglo esta nulo");
        }
    }

    /**
     * Obtiene el coeficiente dado un exponente
     *
     * @param exp
     * @return coeficiente
     * @throws java.lang.Exception
     */
    public int getCoeficiente(int exp) throws Exception {
        int pos = getGrado() - exp + 1;
        if (pos >= arregloA.length) {
            throw new ArrayIndexOutOfBoundsException("El arreglo es de menor tamaño que la posición calculada");
        }
        return arregloA[pos];
    }

    /**
     * Obtiene el exponente dado una posición
     *
     * @param pos
     * @return exponente
     * @throws java.lang.Exception
     */
    public int getExponente(int pos) throws Exception {
        if (pos >= arregloA.length) {
            throw new ArrayIndexOutOfBoundsException("El arreglo es de menor tamaño que la posición calculada");
        }
        int exp = getGrado() - pos + 1;
        return exp;
    }

    @Override
    public String toString() {
        StringBuilder polinomio = new StringBuilder();
        try {
            if (arregloA[0] == -1) {
                polinomio.append("0");
            }
            
            for (int i = 1; i < arregloA.length; i++) {
                int j = arregloA[i];
                // Para adicionar el simbolo del coeficiente para numeros positivos, excluyendo el simbolo + del primer termino si es positivo.
                if (j >= 0 && i != 1) {
                    polinomio.append("+");
                }
                polinomio.append(j).append("X^").append(getExponente(i)).append(" ");
            }
        } catch (Exception e) {
            polinomio.append("El arreglo estaba NULO");
        }
        return polinomio.toString();
    }

    public void setCoeficiente(int c, int e) throws Exception {
        if (e > getGrado()) {
            throw new ArrayIndexOutOfBoundsException("El exponente es superior al grdo del polinomio");
        }
        int pos = getGrado() - e + 1;
        arregloA[pos] = c;
    }

    /**
     * Función para Sumar dos polinomios, entrega un nuevo polinomio resultado
     * de la operación suma. No modifica el polinomio que representa el objeto
     *
     * @param polinomioB
     * @return
     * @throws java.lang.Exception
     */
    public PolVectorForma1 sumar(PolVectorForma1 polinomioB) throws Exception {

        PolVectorForma1 polinomioC;
        if (polinomioB == null) {
            throw new Exception("El polinomio b es null");
        }

        // Bloque para validar si los arreglos son nulos o no
        int[] arregloB = polinomioB.getArreglo();
        if (arregloB == null) {
            if (arregloA == null) {
                polinomioC = new PolVectorForma1();
            } else {
                int[] arregloNuevo = new int[arregloA.length];
                System.arraycopy(arregloA, 0, arregloNuevo, 0, arregloA.length);
                polinomioC = new PolVectorForma1(arregloNuevo);
                return polinomioC;
            }
        } else {
            if (arregloA == null) {
                int[] arregloNuevo = new int[arregloB.length];
                System.arraycopy(arregloB, 0, arregloNuevo, 0, arregloB.length);
                polinomioC = new PolVectorForma1(arregloNuevo);
                return polinomioC;
            }
        }

        // Este es el caso en que ambos arreglos no son nulos
        int gradoA = getGrado();
        int gradoB = polinomioB.getGrado();
        int nGrado = (gradoA > gradoB) ? gradoA : gradoB;
        polinomioC = new PolVectorForma1(nGrado);

        int e = 0;
        while (e <= gradoA && e <= gradoB) {
            int nC = getCoeficiente(e) + polinomioB.getCoeficiente(e);
            polinomioC.setCoeficiente(nC, e);
            e++;
        }

        while (e <= gradoA) {
            polinomioC.setCoeficiente(getCoeficiente(e), e);
            e++;
        }

        while (e <= gradoB) {
            polinomioC.setCoeficiente(polinomioB.getCoeficiente(e), e);
            e++;
        }

        polinomioC.normalizar();
        return polinomioC;
    }

    public int getDiferentesCero() {
        return 0;
    }

    public int[] getArreglo() {
        return arregloA;
    }

    public void ingresar(double coeficiente, int exponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Permite validar el arreglo y garantizar que no tenga terminos iniciales
     * en 0
     */
    private void normalizar() {

        // Si la primera posición es 0
        if (arregloA[1] == 0) {
            int i = 1;
            while (i < arregloA.length && arregloA[i] == 0) {
                i++;
            }
            if (i < arregloA.length) {
                int nuevoGrado = i - 1;
                int nuevoArreglo[] = new int[nuevoGrado + 2];
                nuevoArreglo[0] = nuevoGrado;
                System.arraycopy(arregloA, i, nuevoArreglo, 1, arregloA.length - i);
                arregloA = nuevoArreglo;
            } else {
                arregloA = new int[1];
                arregloA[0] = -1;
            }
        }
    }

    /**
     * Sumar al polinomio a (this) un termino, la estrategia es crear un
     * polinomio b de un solo termino y luego sumar a y b
     *
     * @param coeficiente
     * @param exponente
     * @return
     * @throws Exception
     */
    public PolVectorForma1 sumar(int coeficiente, int exponente) throws Exception {
        PolVectorForma1 polB;
        if (coeficiente != 0) {
            /**
             * El tamaño del arreglo es de grado n + 2, como el polinomio
             * resultante va a ser de un solo termino, el grado es el mismo
             * exponente
             */
            int[] arregloPol = new int[exponente + 2];
            for (int i = 0; i < arregloPol.length; i++) {
                arregloPol[i] = 0;
            }
            arregloPol[0] = exponente;
            arregloPol[1] = coeficiente;
            polB = new PolVectorForma1(arregloPol);
        } else {
            polB = new PolVectorForma1();
        }
        return this.sumar(polB);
    }

    public PolVectorForma1 Multiplicar(PolVectorForma1 p2) throws Exception {

        //int[] Arreglo1 = getArreglo();
        int[] Arreglo = getArreglo();
        int[] Arreglo2 = p2.getArreglo();

        PolVectorForma1 polNuevo = new PolVectorForma1();

        for (int i = 1; i < Arreglo.length; i++) {

            for (int j = 1; j < Arreglo2.length; j++) {

                int mExp = getExponente(i) + p2.getExponente(j);
                int mCoef = getCoeficiente(getExponente(i)) * p2.getCoeficiente(p2.getExponente(j));

                polNuevo = polNuevo.sumar(mCoef, mExp);

            }
        }
        return polNuevo;
    }

    public PolVectorForma1 dividir(PolVectorForma1 dividendo, PolVectorForma1 divisor) throws Exception {
        PolVectorForma1 cociente = new PolVectorForma1();
        
        PolVectorForma1 aux = new PolVectorForma1(1);
            aux = aux.sumar(-1, 0);

        while (dividendo.getGrado() >= divisor.getGrado() ) {
            
            int a = dividendo.getCoeficiente(dividendo.getGrado());
            int b = divisor.getCoeficiente(divisor.getGrado());

            int coeficiente = a / b;
            int exponente = dividendo.getExponente(1) - divisor.getExponente(1);

            cociente.sumar(coeficiente, exponente);

            PolVectorForma1 nuevo = new PolVectorForma1();
            nuevo= nuevo.sumar(coeficiente, exponente);

            PolVectorForma1 producto = new PolVectorForma1();
            
            producto = divisor.Multiplicar(nuevo);
            producto = producto.Multiplicar(aux);
            dividendo = dividendo.sumar(producto);
        }

        return cociente;
    }

    public PolVectorForma1 Derivar() throws Exception {

        //int[] Arreglo1 = getArreglo();
        int[] Arreglo = getArreglo();
        int gradoNue = Arreglo[0] - 1;

        PolVectorForma1 polNuevo = new PolVectorForma1(gradoNue);

        for (int i = 1; i < Arreglo.length - 1; i++) {

            polNuevo.setCoeficiente(Arreglo[i] * getExponente(i), getExponente(i) - 1);
        }
        return polNuevo;

    }

    public int Evaluar(int dato) throws Exception {

        int resultado = 0;

        //int[] Arreglo1 = getArreglo();
        int[] Arreglo = getArreglo();

        for (int i = 1; i < Arreglo.length; i++) {

            resultado = resultado + Arreglo[i] * (int) Math.pow(dato, getExponente(i));
        }
        return resultado;
    }
}
