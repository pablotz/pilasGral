package Core;

import Data.Archivo;
import Pilas.Pila;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class MainExcel {

    public static void main(String[] args) throws IOException {
        Pila pl = new Pila();
        Stack st = new Stack();
        
        System.out.println(pl.push(12));
        System.out.println(pl.push(15));
        System.out.println(pl.push(20));
        System.out.println(pl.size());
        System.out.println(pl.peek());
        System.out.println(pl.pop());
        System.out.println(pl.peek());
        System.out.println(pl.push("string"));
        System.out.println(pl.peek());
        System.out.println(pl.toString());
        System.out.println(pl.pop());
        System.out.println(pl.pop());
        System.out.println(pl.pop());
        System.out.println(pl.peek());
        
    }

}


