package com.amit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Indica la altura, en filas, del triángulo: ");
        n  = entrada.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("1");
            }
            System.out.println("");

        }
    }
}

