package SamplePackage;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connector {

	public static void connect(Car c) throws ClassNotFoundException {
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;

		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:C:\\SQlite\\Cars.sqlite");
			java.sql.Statement statement = connection.createStatement();

			statement.executeUpdate("drop table if exists Cars");
			statement.executeUpdate(
					"create table Cars (id integer, carName String, carColour String , personName string)");
			statement.executeUpdate("insert into Cars values('" + c.getIds() + "','" + c.getCarInfo().keySet() + "','"
					+ c.getCarInfo().values() + "','" + c.getPersonNameList() + "')");

			ResultSet rs = statement.executeQuery("select * from Cars");
			while (rs.next()) {
				// read the result set
				System.out.println("carName = " + rs.getString("carName"));
				System.out.println("carName = " + rs.getString("carName"));
				System.out.println("carColour = " + rs.getString("carColour"));
				System.out.println("personName = " + rs.getString("personName"));

			}
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}
	}

}
