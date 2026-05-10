package main;

import br.com.fiapride.model.CamisetaOversized;

public class Main {
    public static void main(String[] args) {
        // Classe filha
        CamisetaOversized co = new CamisetaOversized("Básica", "Off-White", "XL", 120.00, "Grandona");

        System.out.println("=== FiapRide: Teste de Herança (Camiseta) ===");
        // Atributos que vieram da classe Jaqueta
        System.out.println("Modelo: " + co.getModelo());
        System.out.println("Preço: R$ " + co.getPreco());
        
        // Atributo só da CamisetaOversized
        System.out.println("Caimento: " + co.getCaimento());

        // Testando a herança
        co.aplicarDesconto(5);
        System.out.println("Preço com Desconto de 5%: R$ " + co.getPreco());
    }
}