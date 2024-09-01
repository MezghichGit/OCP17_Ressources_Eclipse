package com.sip.ocp17.day16;

import java.sql.*;

public class TestConnect {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OCP17", "root", "");
		System.out.println(conn);
		Statement stmt = conn.createStatement();

		//int result = stmt.executeUpdate("insert into animal (nom,idespece) values ('Oiseau', 2)");
		//System.out.println(result); // 1

		// int result2 = stmt.executeUpdate("update animal set nom='Vache' where
		// id='1'");
		// System.out.println(result2); // 1

		ResultSet rs = stmt.executeQuery("select * from animal");
		while (rs.next()) {
			int id = rs.getInt("id");
			String nom = rs.getString("nom");
			int idEs = rs.getInt("idespece");
			System.out.println(id+" : "+nom+" : "+idEs);
		}
	}

}
