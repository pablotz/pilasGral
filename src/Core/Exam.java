/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Pilas.Pila;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenaEx = sc.next();
        int contador = 0;
        char[] cad = new char[cadenaEx.length()];
        Pila pd = new Pila();

        for (int i = 0; i < cadenaEx.length(); i++) {
            cad[i] = cadenaEx.charAt(i);
            if (cad[i] == '(' || cad[i] == '{' || cad[i] == '[') {
                pd.push(cad[i]);
                contador++;
            }

        }
        for (int j = 0; j < cadenaEx.length(); j++) {
            cad[j] = cadenaEx.charAt(j);
            if (cad[j] == ')' || cad[j] == ']' || cad[j] == '}') {
                pd.pop();
                contador--;
            }
        }
        if (contador == 0) {
            System.out.println("Esta balanceado");
            System.out.println(Arrays.toString(cad));
        } else if (contador > 0 || contador < 0) {
            System.out.println("Esta desbalanceado");
            System.out.println(Arrays.toString(cad));
        }
    }

}
