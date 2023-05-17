package util;

import model.User;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getJDBCConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        StringBuilder url = new StringBuilder();
        url.
                append("jdbc:mysql://").        //db type
                append("localhost:").           //host name
                append("3306/").                //port
                append("usersdb?").             //db name
                append("user=root&").           //login
                append("password=root");        //password
        return DriverManager.getConnection(url.toString());
    }

    public static Configuration getHibernateConfiguration() {
        String hibernateShowSql = "false";
        String hibernateHbm2ddlAuto = "update";

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(User.class);

        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/usersdb");
        configuration.setProperty("hibernate.connection.username", "root");
        configuration.setProperty("hibernate.connection.password", "root");
        configuration.setProperty("hibernate.show_sql", hibernateShowSql);
        configuration.setProperty("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
        return configuration;
    }
}
