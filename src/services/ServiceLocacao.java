package services;

import java.util.ArrayList;
import java.util.List;

import models.Contrato;
import models.Pagamento;

public class ServiceLocacao implements ILocacao {

    List<Contrato> contratosVigentes = new ArrayList<>();



    @Override
    public void assinar(Contrato contrato) throws Exception{

        // caso já exista contrato, lança exceção
        for(Contrato ct : contratosVigentes){
            //System.out.println("Placa: " + ct.getVeiculo().getPlaca());
            if (ct.getVeiculo().getPlaca() == contrato.getVeiculo().getPlaca()) {
                throw new Exception("Veículo já alugado.");
            }
        }
        // assina contrato e coloca na lista
        contrato.setFoiPago(true);
        contratosVigentes.add(contrato);
        System.out.println("Veículo alugado com sucesso! Bom passeio.");
    }
    
}
