package models;

import java.time.LocalDate;
import utils.Utils;

public class Contrato {
    Funcionario funcionario;
    Cliente cliente;
    Veiculo veiculo;
    LocalDate dataInicio;
    LocalDate dataFim;
    boolean foiPago;
    double valorTotal;
    Pagamento pagamento;
    public Contrato(Funcionario funcionario, Cliente cliente, Veiculo veiculo, LocalDate dataInicio,
            LocalDate dataFim) {
            
        this.setFuncionario(funcionario);
        this.setCliente(cliente);
        this.setVeiculo(veiculo);
        this.setDataInicio(dataInicio);
        this.setDataFim(dataFim);
        this.setFoiPago(false); // inicia como falso
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public boolean isFoiPago() {
        return foiPago;
    }
    public void setFoiPago(boolean foiPago) {
        this.foiPago = foiPago;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void calculaValor() throws Exception{
        // verifica período válido
        int periodo = Utils.periodoEmDias(this.dataInicio, this.dataFim);
        if (periodo < 1) {
            throw new Exception("Período de locação inválido");
        }
        this.setValorTotal(this.getVeiculo().getValorDiaria() * Utils.periodoEmDias(this.dataInicio, this.dataFim));
    }

    @Override
    public String toString() {
        return "Contrato [funcionario=" + funcionario + ", cliente=" + cliente + ", veiculo=" + veiculo
                + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", foiPago=" + foiPago + ", valorTotal="
                + valorTotal + ", pagamento=" + pagamento + "]";
    }

    
    
}