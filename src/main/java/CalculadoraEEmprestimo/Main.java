package CalculadoraEEmprestimo;

import java.time.LocalTime;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        if (LocalTime.now().isAfter(LocalTime.parse("00:00:00.0")) && LocalTime.now().isBefore(LocalTime.parse("12:00:00.0"))) {
            System.out.println("Bom dia");
        } else if (LocalTime.now().isAfter(LocalTime.parse("12:00:00.0")) && LocalTime.now().isBefore(LocalTime.parse("18:00:00.0"))){
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
        Scanner ler = new Scanner(System.in);
        double a, b;
        System.out.print("Digite o primeiro número: ");
        a = ler.nextDouble();
        System.out.print("Digite o segundo número: ");
        b = ler.nextDouble();
        

        Calculadora calc = new Calculadora();

        Double resultSoma = calc.Soma(a, b);
        Double resultSub = calc.Sub(a, b);
        Double resultMulti = calc.Multi(a, b);
        Double resultDiv = calc.Div(a, b);
        System.out.println(" (+) " + resultSoma + " (-) " + resultSub + " (x) " + resultMulti + " (/) " + resultDiv);

        Emprestimo emprestimo = new Emprestimo();
        Double valorFinalEmprestimo = emprestimo.CalculoEmprestimo(1000.0, 6);
        System.out.println(valorFinalEmprestimo);
    }
}
