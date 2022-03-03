package TestesExerciciosDio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Hugo Rodrigues
 * @version 1.0
 * @since Mar-03-2022
 */

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;
        //Regra xadrez
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while (true) {
            System.out.print("x1: ");
            x1 = sc.nextInt();
            System.out.print("y1: ");
            y1 = sc.nextInt();
            System.out.print("x2: ");
            x2 = sc.nextInt();
            System.out.print("y1: ");
            y2 = sc.nextInt();


            List listaX = new ArrayList();
            List listaY = new ArrayList();
            int count = 0, tempX = x1 - 10, tempY = y1 -10;

            while (count < 20) {
                listaX.add(tempX);
                listaY.add(tempY);
                tempX++;
                tempY++;
                count++;
            }

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            if (x1 == x2 && y1 == y2)
                System.out.println("0");
            else if ((x1 == x2 || y1 == y2) || (x1 + y1 == x2 + y2) || (listaX.indexOf(x2) == listaY.indexOf(y2)))
                System.out.println("1");
            else
                System.out.println("2");
        }
        sc.close();
    }
}