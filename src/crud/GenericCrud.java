package crud;

import java.util.List;
import java.util.ArrayList;
import models.Veiculo;

public abstract class GenericCrud<T> implements ICrud <T>{

    private List<T> lista = new ArrayList<>();

    @Override
    public void save(T t) {
        this.lista.add(t);
        System.out.println("Objeto do tipo " + t.getClass().getSimpleName() + " salvo!");
    }

    @Override
    public List<T> getAll() {
        return this.lista;
    }
    
}
