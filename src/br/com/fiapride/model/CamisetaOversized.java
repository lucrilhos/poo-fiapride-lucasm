package br.com.fiapride.model;

public class CamisetaOversized extends Jaqueta {
    private String caimento;

    public CamisetaOversized(String modelo, String cor, String tamanho, double preco, String caimento) {
        super(modelo, cor, tamanho, preco);
        this.caimento = caimento;
    }

    // Sobrescrevendo o comportamento da classe pai
    @Override
    public String verificarCategoria() {
        if (this.getPreco() > 200.0) {
            return "Categoria: Streetwear de rico";
        } else {
            return "Categoria: Streetwear básico";
        }
    }

    public String getCaimento() { 
    	return caimento; 
    	}
    public void setCaimento(String caimento) { 
    	this.caimento = caimento; 
    	}
}