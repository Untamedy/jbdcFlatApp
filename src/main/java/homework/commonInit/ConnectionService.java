/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.commonInit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class ConnectionService {

    private static final Logger LOGGER = Logger.getLogger(ConnectionService.class.getName());

    private PropertyReader propReader;

    public ConnectionService(PropertyReader propReader) {
        this.propReader = propReader;

    }

    public Connection getConnection() {
        Properties property = propReader.getProperties();
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(property.getProperty("url"), property.getProperty("login"), property.getProperty("password"));
        } catch (ClassNotFoundException | SQLException ex) {
            LOGGER.severe(ex.getMessage());
        }
        return connection;

    }

}
