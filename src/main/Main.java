package main;

import br.com.fiapride.model.CamisetaOversized;

public class Main {
    public static void main(String[] args) {
        // Objeto da classe Pai
    	// Comentar a linha abaixo por causa do abstract na classe jaqueta
        // Jaqueta j1 = new Jaqueta("Jaqueta de Couro", "Preta", "XL", 600.00);
        
        // Objeto da classe Filha
    	CamisetaOversized c1 = new CamisetaOversized("Streetwear Pro", "Cinza", "G", 180.00, "Oversized");

        System.out.println("=== FiapRide: Teste de Classe Abstrata (Aula 8) ===");
        System.out.println("Produto: " + c1.getModelo());
        
        // Testando o método obrigatório que a classe abstrata exigiu
        c1.instrucoesLavagem();
        
        // Testando o cupom da interface
        c1.aplicarCupom("BEN10");
}
}