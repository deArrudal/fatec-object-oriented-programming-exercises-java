package persistance;

import java.sql.SQLException;
import java.util.List;

public interface ICRUD<T> {

	public void register(T t) throws SQLException, ClassNotFoundException;

	public void update(T t) throws SQLException, ClassNotFoundException;

	public void remove(T t) throws SQLException, ClassNotFoundException;

	public T search(T t) throws SQLException, ClassNotFoundException;

	public List<T> list() throws SQLException, ClassNotFoundException;

}
