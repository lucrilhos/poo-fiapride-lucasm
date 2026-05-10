package main;

// importando bilbiotecas para criação da lista de arrays
import java.util.ArrayList;
import java.util.List;
import br.com.fiapride.model.Jaqueta;
import br.com.fiapride.model.CamisetaOversized;

public class Main {
    public static void main(String[] args) {
        // Lista de Produtos (usei o tipo da classe jaqueta)
        List<Jaqueta> estoque = new ArrayList<>();

        // Adicionando itens à lista
        estoque.add(new CamisetaOversized("Streetwear", "Preta", "XXL", 150.00, "Modelo Boxy"));
        estoque.add(new CamisetaOversized("Básica", "Branca", "M", 120.00, "Modelo Slim"));
        estoque.add(new CamisetaOversized("Old School", "Azul", "PP", 220.00, "Modelo Extra Pequeno"));

        System.out.println("=== Gestão de Estoque ===");
        System.out.println("Total de itens no estoque: " + estoque.size());
        System.out.println("##################################");

        // Percorrendo a lista por iterações para mostrar os dados e aplicar o polimorfismo
        for (Jaqueta item : estoque) {
            System.out.println("Modelo: " + item.getModelo());
            System.out.println("Preço: R$ " + item.getPreco());
            
            // Chamando métodos anteriores por causa da individualidade de cada item
            System.out.println("Status - " + item.verificarCategoria());
            item.instrucoesLavagem();
            System.out.println("##################################");
        }
    }
}