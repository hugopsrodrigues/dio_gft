package CalculadoraEEmprestimo;

public class Emprestimo {
    private Double valorSolicitado, valorFinal, taxa;
    private Integer quantidadeParcelas;

    public Double CalculoEmprestimo(Double valorSolicitado, Integer quantidadeParcelas){
        this.valorSolicitado = valorSolicitado;
        this.quantidadeParcelas = quantidadeParcelas;
        if(quantidadeParcelas > 5){
            this.taxa = 1.8;
        } else {
            this.taxa = 1.3;
        }

        valorFinal = (this.taxa * valorSolicitado);
        return valorFinal;
    }

}
