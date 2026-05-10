package main;

import br.com.fiapride.model.Jaqueta;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto através do construtor
        Jaqueta minhaJaqueta = new Jaqueta("Puffer", "Preta", "XL", 480.00);

        System.out.println("=== Teste de Construtores ===");
        System.out.println("Modelo: " + minhaJaqueta.getModelo());
        System.out.println("Tamanho: " + minhaJaqueta.getTamanho());
        System.out.println("Preço: R$ " + minhaJaqueta.getPreco());

        // Testando a sobrecarga (cria uma classe vazia e depois usa os setters)
        Jaqueta jaquetaReserva = new Jaqueta();
        jaquetaReserva.setModelo("Cortavento");
        
        System.out.println("\nJaqueta Reserva: " + jaquetaReserva.getModelo());
    }
}