package br.com.fiapride.model;

public class CamisetaOversized extends Jaqueta {
    private String caimento;

    public CamisetaOversized(String modelo, String cor, String tamanho, double preco, String caimento) {
        super(modelo, cor, tamanho, preco);
        this.caimento = caimento;
    }
    
  
    @Override
    public void instrucoesLavagem() {
        System.out.println("Dica de Lavagem: Lavar com água fria. Preserva o caimento e não dá bolinha: " + this.caimento);
    }

    @Override
    public String verificarCategoria() {
        if (this.getPreco() > 200.0) {
            return "Categoria: Streetwear High Fashion";
        } else {
            return "Categoria: Streetwear de pobre";
        }
    }

    public String getCaimento() { 
    	return caimento; 
    	}
    public void setCaimento(String caimento) { 
    	this.caimento = caimento;
    	}
} 
