package crud;

import models.Carro;
import models.Funcionario;
import models.Cliente;
import models.Moto;
import models.Veiculo;
import types.Fabricante;
import types.Modelo;
import types.Categoria;
import types.TipoVeiculo;

public class Mock {

    private CrudVeiculo crudVeiculo;
    private CrudFuncionario crudFuncionario;
    private CrudCliente crudCliente;

    public Mock(CrudVeiculo crudVeiculo, CrudFuncionario crudFuncionario, CrudCliente crudCliente) {
        this.crudVeiculo = crudVeiculo;
        this.crudFuncionario = crudFuncionario;
        this.crudCliente = crudCliente;
    }
    
    public void carregar() {
        // veículos
        Carro carro = new Carro("AB-1234", Fabricante.HONDA, Modelo.CIVIC, Categoria.LUXO, 120.0);
        Moto  moto  = new Moto("CD-4321", Fabricante.HONDA, Modelo.CB500, Categoria.ESPORTIVO, 60.0);

        this.crudVeiculo.save(carro);
        this.crudVeiculo.save(moto);

        // pessoas
        Funcionario funcionario = new Funcionario("Steve", "Locaum");
        Cliente cliente = new Cliente("João", "Travolta");

        this.crudFuncionario.save(funcionario);
        this.crudCliente.save(cliente);

    }
    
}
