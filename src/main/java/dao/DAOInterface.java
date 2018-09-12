package dao;

import java.util.List;

public interface DAOInterface<T> {
    void save(T t);

    void update(T t);

    void delete(T t);
    
    public List<T> all();
}
