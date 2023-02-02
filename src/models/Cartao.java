package models;

import types.TipoCartao;

public abstract class Cartao extends Pagamento{

    private TipoCartao tipoCartao;

    

    public Cartao(double valor, TipoCartao tipoCartao) {
        super(valor);
        this.setTipoCartao(tipoCartao);
    }

    public TipoCartao getTipoCartao() {
        return this.tipoCartao;
    }

    public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    @Override
    public String toString() {
        return "Cartao [tipoCartao=" + tipoCartao + "]";
    }
    
}
