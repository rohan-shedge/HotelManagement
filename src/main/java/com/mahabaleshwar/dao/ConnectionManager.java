/*package com.mahabaleshwar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class ConnectionManager {

//     private DBConfig dbconfig;

	 public ConnectionManager() {
		// this(new DBConfigManager().getConfigManager().getConfig());
	 }

	 public Connection getConnection() throws Exception {
		 loadDriver();
		 Connection conn;
		 SQLException sqlErr;

		 try {
			 throw new SQLException();
		//	 conn = DriverManager.getConnection(this.dbConfig.getJDBCURL(), getProperties());
		//	 Statement stmt = conn.createStatement();

		//	 stmt.executeUpdate("SET TEMPORARY OPTION CONNECTION_AUTHENTICATION = " + "'company=VERITAS;application=CommonRepository;"
	//				 + "signature=000fa55157edb8e14d818eb4fe3db4144714" + "6f1571g467396871b154e64d6f497e06c8ef5a786fad91f'");

		//	 stmt.executeUpdate("SET TEMPORARY OPTION ALLOW_NULLS_BY_DEFAULT='ON'");
		//	 stmt.executeUpdate("SET OPTION PUBLIC.MAX_STATEMENT_COUNT = 300");
//			 closeStatement(stmt);
			 return;
		 } catch (SQLException e) {
			 sqlErr = e;
			 throw sqlErr;
		 }
	 }

	 public Connection getUnAuthenticatedConnection() throws Exception {
		 loadDriver();
		 Connection conn;
		 SQLException sqlErr;

		 try {
			 conn = DriverManager.getConnection(this.dbConfig.getJDBCURL(), getProperties());
			 Statement stmt = conn.createStatement();
			 stmt.executeUpdate("SET TEMPORARY OPTION ALLOW_NULLS_BY_DEFAULT='ON'");
			 stmt.close();
			 return conn;
		 } catch (SQLException e) {
			 sqlErr = e;
		 }

		 System.out.println("Exception in geting the connection");
		 throw sqlErr;
	 }

	 private void loadDriver() throws Exception {
		 // Load jConnect
		 try {
			 Class.forName(this.dbConfig.getJdbcDriverClassName()).newInstance();
		 } catch (Exception e) {
			 System.out.println("Exception in loading the driver");
			 throw e;
		 }
	 }

	 private Properties getProperties() {
		 Properties props = new Properties();
		 props.put("password", this.dbConfig.getPassword());
		 props.put("DYNAMIC_PREPARE", "true");
		 props.put("user", this.dbConfig.getUserName());
		 props.put("ServiceName", this.dbConfig.getFileName());
		 return props;
	 }

	 public void beginTransaction(final Connection connection) throws SQLException {
		 if (connection != null) {
			 try {
				 connection.clearWarnings();
			 } catch (SQLException e) {
				 e.printStackTrace();
			 }
			 connection.setAutoCommit(false);
		 }
	 }

	 public void commitTransaction(final Connection connection) throws SQLException {
		 if (connection != null) {
			 try {
				 connection.clearWarnings();
			 } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.commit();
    }
}

public void rollBackTransaction(final Connection connection) throws SQLException {
    if (connection != null) {
        try {
            connection.clearWarnings();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.rollback();
    }
}

public void closeConnection(final Connection connection) throws SQLException {
    if ((connection != null) && !connection.isClosed()) {
        try {
            connection.clearWarnings();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
    }
}

public void closeStatement(final Statement stmt) throws SQLException {
    if (stmt != null) {
        try {
            stmt.clearWarnings();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        stmt.close();
    }

}

private String getUnEncryptedPassword(final String password) {
    String unEncryptedpassword = null;
    try {
//    	return EncryptorDecryptor.decryptOps(password, StringEncrypter.DESEDE_ENCRYPTION_SCHEME);
    } catch (Exception e) {
    	e.printStackTrace();
        System.out.println("Failed to decrypt the password");
    }
 //   return unEncryptedpassword;
    return null;
}

public static void main(final String[] args) throws Exception {

    for (int j = 0; j < 100; j++) {
        Connection connection = new ConnectionManager().getConnection();
        // statement.execute("create table test (id int, name varchar(200))");
        Statement statement;
        for (int i = 0; i < 1000; i++) {
            statement = connection.createStatement();
            statement.execute("insert into test (id, name) values (" + j * i + "," + j * i + ")");
            connection.commit();
            statement.close();
        }
        connection.close();
    }

}


     protected void closeResultSet(final ResultSet _resultSet) {
        if (_resultSet != null) {
            try {
                _resultSet.clearWarnings();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
            try {
                _resultSet.close();
             } catch (SQLException e) {
                 e.printStackTrace();
            }
         }
     }
}
*/