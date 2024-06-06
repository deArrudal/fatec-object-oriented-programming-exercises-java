package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Magazine;
import model.Rental;
import model.Student;

public class RentalDAO implements ICRUD<Rental> {
	private GenericDAOMySQL genericDAOMySQL;

	public RentalDAO(GenericDAOMySQL genericDAOMySQL) {
		super();
		this.genericDAOMySQL = genericDAOMySQL;
	}

	@Override
	public void register(Rental rental) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "INSERT INTO rental VALUES (?, ?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, rental.getRentalDateWithdraw().toString());
		preparedStatement.setString(2, rental.getRentalDateReturn().toString());
		preparedStatement.setInt(3, rental.getRentalStudent().getStudentId());
		preparedStatement.setInt(4, rental.getRentalExemplar().getExemplarId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public void update(Rental rental) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "UPDATE rental SET dateReturn = ? WHERE dateWithdraw = ? AND studentId = ? AND exemplarId = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, rental.getRentalDateReturn().toString());
		preparedStatement.setString(2, rental.getRentalDateWithdraw().toString());
		preparedStatement.setInt(3, rental.getRentalStudent().getStudentId());
		preparedStatement.setInt(4, rental.getRentalExemplar().getExemplarId());
		preparedStatement.execute();
	}

	@Override
	public void remove(Rental rental) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "DELETE FROM rental WHERE dateWithdraw = ? AND studentId = ? AND exemplarId = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, rental.getRentalDateWithdraw().toString());
		preparedStatement.setInt(2, rental.getRentalStudent().getStudentId());
		preparedStatement.setInt(3, rental.getRentalExemplar().getExemplarId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public Rental search(Rental rental) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT ");
		cmdSQL.append("rental.dateWithdraw AS rDateWithdraw, rental.dateReturn AS rDateReturn, ");
		cmdSQL.append("student.id AS sId, student.name AS sName, student.email AS sEmail, ");
		cmdSQL.append("exemplar.id AS eId, exemplar.name AS eName, exemplar.pages AS ePages, ");
		cmdSQL.append("book.isbn AS bIsbn, book.edition AS bEdition, ");
		cmdSQL.append("magazine.issn AS mIssn ");
		cmdSQL.append("FROM rental ");
		cmdSQL.append("INNER JOIN student ON rental.studentId = student.id ");
		cmdSQL.append("INNER JOIN exemplar ON rental.exemplarId = exemplar.id ");
		cmdSQL.append("LEFT JOIN magazine ON exemplar.id = magazine.exemplarId ");
		cmdSQL.append("LEFT JOIN book ON exemplar.id = book.exemplarId ");
		cmdSQL.append("WHERE rental.dateWithdraw = ? ");
		cmdSQL.append("AND rental.studentId = ? ");
		cmdSQL.append("AND rental.exemplarId = ?");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		preparedStatement.setString(1, rental.getRentalDateWithdraw().toString());
		preparedStatement.setInt(2, rental.getRentalStudent().getStudentId());
		preparedStatement.setInt(3, rental.getRentalExemplar().getExemplarId());
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Student student = new Student(resultSet.getInt("sId"), resultSet.getString("sName"),
					resultSet.getString("sEmail"));
			rental.setRentalStudent(student);

			if (resultSet.getString("bIsbn") != null) {
				Book book = new Book(resultSet.getInt("eId"), resultSet.getString("eName"), resultSet.getInt("ePages"),
						resultSet.getString("bIsbn"), resultSet.getInt("bEdition"));
				rental.setRentalExemplar(book);

			} else {
				Magazine magazine = new Magazine(resultSet.getInt("eId"), resultSet.getString("eName"),
						resultSet.getInt("ePages"), resultSet.getString("mIssn"));
				rental.setRentalExemplar(magazine);
			}

			rental.setRentalDateWithdraw(LocalDate.parse(resultSet.getString("rDateWithdraw")));
			rental.setRentalDateReturn(LocalDate.parse(resultSet.getString("rDateReturn")));
		}

		return rental;
	}

	@Override
	public List<Rental> list() throws SQLException, ClassNotFoundException {
		List<Rental> rentals = new ArrayList<>();

		Connection conn = genericDAOMySQL.getConnection();

		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT ");
		cmdSQL.append("rental.dateWithdraw AS rDateWithdraw, rental.dateReturn AS rDateReturn, ");
		cmdSQL.append("student.id AS sId, student.name AS sName, student.email AS sEmail, ");
		cmdSQL.append("exemplar.id AS eId, exemplar.name AS eName, exemplar.pages AS ePages, ");
		cmdSQL.append("book.isbn AS bIsbn, book.edition AS bEdition, ");
		cmdSQL.append("magazine.issn AS mIssn ");
		cmdSQL.append("FROM rental ");
		cmdSQL.append("INNER JOIN student ON rental.studentId = student.id ");
		cmdSQL.append("INNER JOIN exemplar ON rental.exemplarId = exemplar.id ");
		cmdSQL.append("LEFT JOIN magazine ON exemplar.id = magazine.exemplarId ");
		cmdSQL.append("LEFT JOIN book ON exemplar.id = book.exemplarId ");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Rental rental = new Rental();

			Student student = new Student(resultSet.getInt("sId"), resultSet.getString("sName"),
					resultSet.getString("sEmail"));
			rental.setRentalStudent(student);

			if (resultSet.getString("bIsbn") != null) {
				Book book = new Book(resultSet.getInt("eId"), resultSet.getString("eName"), resultSet.getInt("ePages"),
						resultSet.getString("bIsbn"), resultSet.getInt("bEdition"));
				rental.setRentalExemplar(book);

			} else {
				Magazine magazine = new Magazine(resultSet.getInt("eId"), resultSet.getString("eName"),
						resultSet.getInt("ePages"), resultSet.getString("mIssn"));
				rental.setRentalExemplar(magazine);
			}

			rental.setRentalDateWithdraw(LocalDate.parse(resultSet.getString("rDateWithdraw")));
			rental.setRentalDateReturn(LocalDate.parse(resultSet.getString("rDateReturn")));

			rentals.add(rental);
		}

		return rentals;
	}
}
