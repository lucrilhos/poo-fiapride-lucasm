package main;

import br.com.fiapride.model.Jaqueta;
import br.com.fiapride.model.CamisetaOversized;

public class Main {
    public static void main(String[] args) {
        // Objeto da classe Pai
        Jaqueta j1 = new Jaqueta("Jaqueta de Couro", "Preta", "XL", 600.00);
        
        // Objeto da classe Filha 
        CamisetaOversized c1 = new CamisetaOversized("Camiseta Heavy", "Bege", "M", 250.00, "Boxy");

        System.out.println("=== Teste de Polimorfismo (Aula 6) ===");
        
        // Comportamento original 
        System.out.println(j1.getModelo() + " -> " + j1.verificarCategoria());
        
        // Comportamento sobrescrito (da camiseta)
        System.out.println(c1.getModelo() + " -> " + c1.verificarCategoria());
    }
}