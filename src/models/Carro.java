package models;

import types.Fabricante;
import types.Modelo;
import types.TipoVeiculo;
import types.Categoria;

public class Carro extends Veiculo {

    public Carro(String placa, Fabricante fabricante, Modelo modelo, Categoria categoria, double valorDiaria) {
        super(TipoVeiculo.CARRO, placa, fabricante, modelo, categoria, valorDiaria);
    }

}