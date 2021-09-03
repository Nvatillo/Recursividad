package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 9;
        int resultado = sumaRecursiva(n);
        System.out.println("suma recursiva " + resultado);

        int a = 3;
        int resultadoFactorial = sumaFactorial(a);
        System.out.println("suma factorial " +resultadoFactorial);

        int indice = 0;
        int[] array = {1,2,3,4,5};
        recorrerArray(array,indice);

        int valorABuscar = 3;
        System.out.println("posicion elemento " +posicionElemento(array,valorABuscar,indice));

        int primerNumero = 0;
        int segundoNumero = 1;
        int result = 1;
        int posicionBuscar = 6;
        int contador = 1;
        System.out.println("poscicion figo " +posicionFibonacci(posicionBuscar,primerNumero,segundoNumero,result,contador));

        int numeroInvertir = 1190;
        int numeroInvertdo = -1190;

        System.out.println("numero a invertir " + invertirNumero(numeroInvertir,numeroInvertdo));


        String palabra = "Hola";
        System.out.println("invertir palabra "+ invertirPalabra(palabra,palabra.length()-1));

        int base = 10;
        int exponente = 2;
        System.out.println("exponentes " +calcularPotencia(base,exponente));
    }

    public static int sumaRecursiva(int numero) {
        int res;

        if(numero == 1) return 1;

        res =numero + sumaRecursiva(numero - 1);

        return res;

    }

    public static int sumaFactorial(int numero){

        int res;

        if (numero ==1) return 1;
        res = numero * sumaFactorial(numero - 1);

        return res;
    }

    public static void recorrerArray(int[] array, int indice) {
        if (indice != array.length) {
            System.out.println(array[indice]);
            recorrerArray(array, indice + 1);
        }
    }

    public static int posicionElemento(int[] array,int valorBuscar,int indice){

        int res;
        if (valorBuscar == array[indice]) return indice;
        else res = posicionElemento(array,valorBuscar,indice+1);

        return res;
    }

    public static int posicionFibonacci(int posicionBuscar,int primerNumero,int segundoNumero,int resultado,int contador){



        int resp;
        if (contador == posicionBuscar) return primerNumero+segundoNumero;
        resp = posicionFibonacci(
                posicionBuscar,
                primerNumero + segundoNumero,
                resultado,
                primerNumero +
                        segundoNumero,
                contador+1);
        return resp;
    }

    public static int invertirNumero(int numero,int numeroInvertido){

        int resp;
        if (numero == numeroInvertido) return numero*2;
        return numero - invertirNumero(numero-1,numeroInvertido);

    }

    public static String invertirPalabra(String palabra,int longitud){

        if (longitud==0) return palabra.charAt(longitud)+"";
        return palabra.charAt(longitud) + invertirPalabra(palabra,longitud-1);

    }

    public static int calcularPotencia(int base,int exponente){

        return 0;
    }
}
