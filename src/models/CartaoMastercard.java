package models;

import types.TipoCartao;

public class CartaoMastercard extends Cartao {

    public CartaoMastercard(double valor) {
        super(valor, TipoCartao.MASTERCARD);
    }
    
    
}
