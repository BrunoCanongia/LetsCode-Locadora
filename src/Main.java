import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

import models.Veiculo;
import services.ServiceLocacao;
import models.Cliente;
import models.Contrato;
import models.Funcionario;
import models.CartaoMarisa;
import crud.CrudVeiculo;
import crud.CrudFuncionario;
import crud.CrudCliente;
import crud.Mock;

public class Main {

    public static void main(String[] args) {

        // header
        printHeader();

        // cruds, contêm a lista dos respectivos objetos
        CrudVeiculo crudVeiculo = new CrudVeiculo();
        CrudFuncionario crudFuncionario = new CrudFuncionario();
        CrudCliente crudCliente = new CrudCliente();

        // carrega dados inicias
        System.out.println("(Carrega dados iniciais)");
        Mock mock = new Mock(crudVeiculo, crudFuncionario, crudCliente);
        mock.carregar();

        // recupera os objetos pelo crud
        List<Veiculo> veiculos = crudVeiculo.getAll();
        List<Cliente> clientes = crudCliente.getAll();
        List<Funcionario> funcionarios = crudFuncionario.getAll();


        // cria novo contrato de locação
        Contrato contrato = new Contrato(funcionarios.get(0), clientes.get(0), veiculos.get(0), LocalDate.of(2022, 2, 1), LocalDate.of(2023, 2, 8));
        try {
            // pra calcular o valor o périodo deve ser válido
            contrato.calculaValor();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        // cria método de pagamento e seta no contrato
        CartaoMarisa cartao = new CartaoMarisa(contrato.getValorTotal());
        contrato.setPagamento(cartao);

        // com o contrato e método de pagamento, faz a locação
        ServiceLocacao locacao = new ServiceLocacao();
        try {
            System.out.println();
            System.out.println("(Assina o contrato)");
            locacao.assinar(contrato);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: " + e.getMessage());
        }

        // exibe as informações do contrato
        System.out.println(contrato.toString());


        // repetindo vai cair na exception de veículo já alugado.
        System.out.println();
        System.out.println("(Dessa vez tem que  falhar)");
        try {
            
            locacao.assinar(contrato);
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        

    }

    // imprime cabeçalho
    public static void printHeader() {
        System.out.println("Brunoid Veículos - A lei é o limite");
        System.out.println("  ___\n    _-_-  _/\\______\\\\__\n _-_-__  / ,-. -|-  ,-.`-.");
        System.out.println("    _-_- `( o )----( o )-'\n           `-'      `-'");
    }
}