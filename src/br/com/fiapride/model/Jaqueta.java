package br.com.fiapride.model;

public class Jaqueta {
    public String modelo;
    public String cor;
    public String tamanho;
    public double preco;

    // Método da Aula 2: Aplica desconto
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            this.preco -= this.preco * (porcentagem / 100);
        }
    }

    // Método da Aula 2: Retorna a categoria
    public String verificarCategoria() {
        if (this.preco > 500.0) {
            return "Categoria: Premium";
        } else {
            return "Categoria: Padrão";
        }
    }
}