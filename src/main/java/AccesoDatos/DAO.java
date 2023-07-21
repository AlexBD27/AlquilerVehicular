
package AccesoDatos;

import java.sql.Connection;

public abstract class DAO<T> {
    
    public Connection connect = ConnectionSql.getInstancia();
    
    public abstract T create(T obj);
    public abstract T read(int id);
    public abstract T update(T obj);
    public abstract void delete(T obj);
}
