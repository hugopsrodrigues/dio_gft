package CalculadoraEEmprestimo;

public class Calculadora implements OperacaoMatematica{

    @Override
    public Double Soma(double a, double b){
        return a + b;
    }
    @Override
    public Double Sub (double a, double b){
        return a - b;
    }
    @Override
    public Double Multi (double a, double b){
        return a * b;
    }
    @Override
    public Double Div (double a, double b){
        return a / b;
    }
}
