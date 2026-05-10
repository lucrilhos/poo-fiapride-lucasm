package main; // código proprio só para implementação

import br.com.fiapride.model.Jaqueta;

public class Main {
    public static void main(String[] args) {
        Jaqueta j1 = new Jaqueta("Jaqueta Jeans", "Azul", "M", 200.00);

        System.out.println("=== Teste de Interface ===");
        System.out.println("Preço original: R$ " + j1.getPreco());

        // Usando o método que veio da Interface (void aplicarCupom)
        j1.aplicarCupom("BEN10");
    }
}