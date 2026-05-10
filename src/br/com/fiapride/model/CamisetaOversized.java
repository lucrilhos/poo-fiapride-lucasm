package br.com.fiapride.model;

// Herda de Jaqueta
public class CamisetaOversized extends Jaqueta {
    private String caimento; // Atributo específico da camiseta oversized

    // Construtor que usa o super para preencher a base da Jaqueta
    public CamisetaOversized(String modelo, String cor, String tamanho, double preco, String caimento) {
        super(modelo, cor, tamanho, preco);
        this.caimento = caimento;
    }

    // Getter e Setter para o caimento
    public String getCaimento() {
        return caimento;
    }

    public void setCaimento(String caimento) {
        this.caimento = caimento;
    }
}