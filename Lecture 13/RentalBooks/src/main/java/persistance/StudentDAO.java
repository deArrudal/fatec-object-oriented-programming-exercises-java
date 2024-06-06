package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDAO implements ICRUD<Student> {
	private GenericDAOMySQL genericDAOMySQL;

	public StudentDAO(GenericDAOMySQL genericDAOMySQL) {
		super();
		this.genericDAOMySQL = genericDAOMySQL;
	}

	@Override
	public void register(Student student) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "INSERT INTO student VALUES (?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, student.getStudentId());
		preparedStatement.setString(2, student.getStudentName());
		preparedStatement.setString(3, student.getStudentEmail());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public void update(Student student) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "UPDATE student SET name = ?, email = ? WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, student.getStudentName());
		preparedStatement.setString(2, student.getStudentEmail());
		preparedStatement.setInt(3, student.getStudentId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public void remove(Student student) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "DELETE FROM student WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, student.getStudentId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public Student search(Student student) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "SELECT student.id, student.name, student.email FROM student WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, student.getStudentId());
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			student.setStudentId(resultSet.getInt("id"));
			student.setStudentName(resultSet.getString("name"));
			student.setStudentEmail(resultSet.getString("email"));
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return student;
	}

	@Override
	public List<Student> list() throws SQLException, ClassNotFoundException {
		List<Student> students = new ArrayList<>();

		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "SELECT student.id, student.name, student.email FROM student";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Student student = new Student(resultSet.getInt("id"), resultSet.getString("name"),
					resultSet.getString("email"));

			students.add(student);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return students;
	}
}
