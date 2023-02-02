package models;

import types.TipoVeiculo;
import types.Fabricante;
import types.Modelo;
import types.Categoria;

public abstract class Veiculo {
    
    private TipoVeiculo tipoVeiculo;
    private String placa;
    private Fabricante fabricante;
    private Modelo modelo;
    private Categoria categoria;
    private double valorDiaria;


    // construtor
    public Veiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Veiculo(TipoVeiculo tipoVeiculo, String placa, Fabricante fabricante, Modelo modelo, Categoria categoria, double valorDiaria) {
        this.setTipoVeiculo(tipoVeiculo);
        this.setPlaca(placa);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setCategoria(categoria);
        this.setValorDiaria(valorDiaria);
    }



    // getters and setters
    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }    

    

    @Override
    public String toString() {
        return "(" + tipoVeiculo + ") " + fabricante + " " + modelo + " " + categoria + " - " + placa + " - diária: R$" + valorDiaria;
    }


} 