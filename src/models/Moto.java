package models;

import types.Fabricante;
import types.Modelo;
import types.TipoVeiculo;
import types.Categoria;

public class Moto extends Veiculo {

    public Moto(String placa, Fabricante fabricante, Modelo modelo, Categoria categoria, double valorDiaria) {
        super(TipoVeiculo.MOTO, placa, fabricante, modelo, categoria, valorDiaria);
    }

}