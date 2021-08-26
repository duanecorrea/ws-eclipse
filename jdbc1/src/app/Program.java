package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try{
			conn = DB.getConnection();
			
			
			//busca
			/*st = conn.createStatement();
			
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + "," + rs.getString("Name"));
			}*/
			
			//insere
			/*pst = conn.prepareStatement(
					"insert into seller " +
					"(name, email, birthdate, basesalary, departmentid) " + 
					" VALUES " + 
					" (?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS
					);
			
			pst.setString(1, "Duane");
			pst.setString(2, "vinicius.correa18@gmail.com");
			pst.setDate(3, new java.sql.Date(sdf.parse("24/01/1990").getTime()));
			pst.setDouble(4, 3000);
			pst.setInt(5, 4);
			
			int rowsAffected = pst.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet prs = pst.getGeneratedKeys();
				while (prs.next()) {
					int id = prs.getInt(1);
					System.out.println("ID: " + id);
				}
			}
			else {
				System.out.println("deu ruim");
			}*/		
			
			//atualiza
			/*pst = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");

			pst.setDouble(1, 200.0);
			pst.setInt(2, 2);
			
			int rowsAffected = pst.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);*/
			
			pst = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");

			pst.setInt(1, 2);
			
			int rowsAffected = pst.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage());			
		}
		/*catch(ParseException e) {
			throw new DbException(e.getMessage());			
		}*/
		finally {
			DB.closeStatement(st);
			DB.closeStatement(pst);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}		

	}

}
