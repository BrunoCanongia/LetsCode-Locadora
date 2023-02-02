package crud;

import java.util.List;

public interface ICrud <T> {
    public void save(T t);
    public List<T> getAll();
}