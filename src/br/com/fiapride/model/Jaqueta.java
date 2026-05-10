package br.com.fiapride.model;

public class Jaqueta {
    // Fazendo o encapsulamento
    private String modelo;
    private String cor;
    private String tamanho;
    private double preco;

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    // Setters com validação 
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo!");
        }
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            this.preco -= this.preco * (porcentagem / 100);
        }
    }

    public String verificarCategoria() {
        return (this.preco > 500.0) ? "Categoria: Luxo" : "Categoria: Padrão";
    }
}