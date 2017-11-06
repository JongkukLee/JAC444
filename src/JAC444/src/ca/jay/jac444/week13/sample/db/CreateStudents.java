package ca.jay.jac444.week13.sample.db;

import java.sql.*;
/************************************************************************
 *  Compilation:  javac CreateStudents.java
 *  Execution:    java CreateStudents
 *
 *  Example of developing an JDBC program
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2001
 ************************************************************************/
public class CreateStudents {

    public static void main(String args[]) {

        Connection con = null;
        Statement stmt = null;
        String createString = "create table Students " + "(NAME varchar(32), "
                + "ID int, " + "GPA float, " + "YEAR int, " + "SEMESTER int)";

        // 1. Load MYSQL driver (the driver jar file must be on CLASSPATH)
        try {
            Class.forName(V.DRIVER_CLASS_MYSQL);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }

        try {
            // 2. Get connection and statements objects
            con = DriverManager.getConnection(V.URL, V.U, V.P);
            stmt = con.createStatement();

            // 3. Execute JDBC commands
            stmt.execute("DROP TABLE IF EXISTS Students");
            stmt.executeUpdate(createString);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());

        } finally {
            try {
                // 4. Close the connection and statement
                if (stmt != null)
                    stmt.close();

                if (con != null)
                    con.close();
            } catch (Exception ex) {
            }
        }
    }
}
