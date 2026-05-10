package br.com.fiapride.model;

public interface Promoção {
    // Todo objeto que se deparar com esse void é aplicado com a promoção
    void aplicarCupom(String cupom);
}