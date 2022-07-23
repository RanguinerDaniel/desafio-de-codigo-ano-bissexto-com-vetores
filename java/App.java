package com.cursoemvideo.java;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Locale locale = new Locale("pt", "BR");


        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Que ano gostaria de analizar?");
        int ano = sc.nextInt();
        for (int i = 0; i < mes.length; i++) {
            if (ano % 4 == 0) {
                dias[1] = 29;
                System.out.printf("O mês de %s tem %s dias totais.\n", mes[i], dias[i]);
            } else {
                System.out.printf("O mês de %s tem %s dias totais.\n", mes[i], dias[i]);
            }
        }
    }
}
