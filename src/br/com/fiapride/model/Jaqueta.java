package br.com.fiapride.model;

// Pra ficar mais próximo do comercial, implementar classe 'Promoção' em uma jaqueta a venda
public abstract class Jaqueta implements Promoção { // adição do abstract
	// Fazendo encapsulamento
    private String modelo;
    private String cor;
    private String tamanho;
    private double preco;

    // Construtor sem argumento
    public Jaqueta() {
    }

    // Construtor com argumentos (ou parâmetros)
    public Jaqueta(String modelo, String cor, String tamanho, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        setPreco(preco); // Para aproveitar a validação que já criamos
    }
    
    public abstract void instrucoesLavagem(); // toda peça de roupa deve dizer como é lavada
    
    @Override
    public void aplicarCupom(String cupom) {
        if (cupom.equals("BEN10")) {
            this.preco -= this.preco * 0.10;
            System.out.println("Cupom aplicado Novo preço: R$ " + this.preco);
        } else {
            System.out.println("Cupom inválido ou não existe");
        }
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço inválido!");
        }
    }

    // Métodos de negócio
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            this.preco -= this.preco * (porcentagem / 100);
        }
    }

    public String verificarCategoria() {
        return (this.preco > 500.0) ? "Premium" : "Padrão";
    }
}