package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Book;

public class BookDAO implements ICRUD<Book> {
	private GenericDAOMySQL genericDAOMySQL;

	public BookDAO(persistance.GenericDAOMySQL genericDAOMySQL) {
		super();
		this.genericDAOMySQL = genericDAOMySQL;
	}

	@Override
	public void register(Book book) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "INSERT INTO exemplar VALUES (?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, book.getExemplarId());
		preparedStatement.setString(2, book.getExemplarName());
		preparedStatement.setInt(3, book.getExemplarPages());
		preparedStatement.execute();

		cmdSQL = "INSERT INTO book VALUES (?, ?, ?)";
		preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, book.getBookISBN());
		preparedStatement.setInt(2, book.getBookEdition());
		preparedStatement.setInt(3, book.getExemplarId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public void update(Book book) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "UPDATE exemplar SET name = ?, pages = ? WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, book.getExemplarName());
		preparedStatement.setInt(2, book.getExemplarPages());
		preparedStatement.setInt(3, book.getExemplarId());
		preparedStatement.execute();

		cmdSQL = "UPDATE book SET isbn = ?, edition = ? WHERE exemplarId = ?";
		preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, book.getBookISBN());
		preparedStatement.setInt(2, book.getBookEdition());
		preparedStatement.setInt(3, book.getExemplarId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public void remove(Book book) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "DELETE FROM exemplar WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, book.getExemplarId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public Book search(Book book) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT exemplar.id AS id, exemplar.name AS name, exemplar.pages AS pages, ");
		cmdSQL.append("book.isbn AS isbn, book.edition AS edition ");
		cmdSQL.append("FROM exemplar, book ");
		cmdSQL.append("WHERE exemplar.id = book.exemplarId ");
		cmdSQL.append("AND exemplar.id = ?");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		preparedStatement.setInt(1, book.getExemplarId());
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			book.setExemplarId(resultSet.getInt("id"));
			book.setExemplarName(resultSet.getString("name"));
			book.setExemplarPages(resultSet.getInt("pages"));
			book.setBookISBN(resultSet.getString("isbn"));
			book.setBookEdition(resultSet.getInt("edition"));
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return book;
	}

	@Override
	public List<Book> list() throws SQLException, ClassNotFoundException {
		List<Book> books = new ArrayList<>();

		Connection conn = genericDAOMySQL.getConnection();

		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT exemplar.id AS id, exemplar.name AS name, exemplar.pages AS pages, ");
		cmdSQL.append("book.isbn AS isbn, book.edition AS edition ");
		cmdSQL.append("FROM exemplar, book ");
		cmdSQL.append("WHERE exemplar.id = book.exemplarId ");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Book book = new Book(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("pages"),
					resultSet.getString("isbn"), resultSet.getInt("edition"));

			books.add(book);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return books;
	}
}
