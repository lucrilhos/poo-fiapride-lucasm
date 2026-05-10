package br.com.fiapride.model;

public class CamisetaOversized extends Jaqueta {
    private String caimento;

    public CamisetaOversized(String modelo, String cor, String tamanho, double preco, String caimento) {
        super(modelo, cor, tamanho, preco);
        this.caimento = caimento;
    }
    
  
    @Override
    public void instrucoesLavagem() {
        System.out.println("Lavar com água fria para não encolher e nem criar bolinha " + this.caimento);
    }

    @Override
    public String verificarCategoria() {
        if (this.getPreco() > 200.0) {
            return "Categoria: Premium Streetwear";
        } else {
            return "Categoria: Streetwear Essencial";
        }
    }

    public String getCaimento() { 
    	return caimento; 
    	}
    public void setCaimento(String caimento) { 
    	this.caimento = caimento;
    	}
} 
