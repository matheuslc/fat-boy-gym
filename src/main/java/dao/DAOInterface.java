package dao;

public interface DAOInterface<T> {
    void save(T t);

    void update(T t);

    void delete(T t);
}
