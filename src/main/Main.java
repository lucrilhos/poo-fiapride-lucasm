package main;

import br.com.fiapride.model.Jaqueta;

public class Main {
    public static void main(String[] args) {
        Jaqueta minhaJaqueta = new Jaqueta();
        
        minhaJaqueta.modelo = "Corta-vento";
        minhaJaqueta.cor = "Preta";
        minhaJaqueta.tamanho = "G";
        minhaJaqueta.preco = 600.00;

        // Validação exigida na Aula 2
        if (minhaJaqueta.preco < 0) {
            System.out.println("Erro: Preço inválido.");
        } else {
            System.out.println("=== Detalhes da Jaqueta ===");
            System.out.println("Modelo: " + minhaJaqueta.modelo);
            System.out.println("Preço Original: R$ " + minhaJaqueta.preco);
            
            // Testando os métodos
            minhaJaqueta.aplicarDesconto(10);
            System.out.println("Preço com Desconto (10%): R$ " + minhaJaqueta.preco);
            System.out.println("Status: " + minhaJaqueta.verificarCategoria());
        }
    }
}