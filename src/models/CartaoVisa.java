package models;

import types.TipoCartao;

public class CartaoVisa extends Cartao {

    public CartaoVisa(double valor) {
        super(valor, TipoCartao.VISA);
    }
    
}
