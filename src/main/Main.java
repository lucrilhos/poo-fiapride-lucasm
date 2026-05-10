package main;

import br.com.fiapride.model.Jaqueta;

public class Main {
    public static void main(String[] args) {
        Jaqueta minhaJaqueta = new Jaqueta();
        
        minhaJaqueta.setModelo("Puffer");
        minhaJaqueta.setCor("Magenta");
        minhaJaqueta.setTamanho("XL");
        minhaJaqueta.setPreco(550.00);

        System.out.println("=== FiapRide: Cadastro Encapsulado ===");
        
        System.out.println("Modelo: " + minhaJaqueta.getModelo());
        System.out.println("Preço Inicial: R$ " + minhaJaqueta.getPreco());
        System.out.println("Status: " + minhaJaqueta.verificarCategoria());

        // Testando o desconto
        minhaJaqueta.aplicarDesconto(10);
        System.out.println("Preço após 10% de desconto: R$ " + minhaJaqueta.getPreco());
    }
}