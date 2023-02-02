package models;

import types.Fabricante;
import types.Modelo;
import types.TipoVeiculo;
import types.Categoria;

public class Caminhao extends Veiculo {

    public Caminhao(String placa, Fabricante fabricante, Modelo modelo, Categoria categoria, double valorDiaria) {
        super(TipoVeiculo.CAMINHAO, placa, fabricante, modelo, categoria, valorDiaria);
    }

}