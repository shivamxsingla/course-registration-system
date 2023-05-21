/**
 * 
 */
package com.flipkart.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.flipkart.dao.NotificationDaoOperation;

/**
 * @author rohanagarwal
 *
 */
public class DBUtil {
	
	  static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	  static final String DB_URL = "jdbc:mysql://localhost/CRSDatabase";

	  //  Database credentials
	  static final String USER = "root";
	  static final String PASS = "Fk!_191241";
	
	private static Logger logger = Logger.getLogger(NotificationDaoOperation.class);

    /**
     * Get connection of SQL Database
     * @return -> Connection
     */
	@SuppressWarnings("unused")
	public static Connection getConnection() {
		
		Connection connection = null;
		
        if (connection != null) {
			return connection;
		} 
        else 
        {
            try 
            {
            	
//            	Properties prop = new Properties();
//                InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("./config.properties");
//                prop.load(inputStream);
//                String driver = prop.getProperty("driver");
//                String url = prop.getProperty("url");
//                String user = prop.getProperty("user");
//                String password = prop.getProperty("password");
            	
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
                
            }
            catch (ClassNotFoundException e){
                logger.error(e.getMessage());
            }
            catch (SQLException e) {
                logger.error(e.getMessage());
            }
            return connection;
        }

    }
}
