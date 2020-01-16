/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.arisulistio.latihanmvcjdbc.databases;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.arisulistio.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.arisulistio.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : 10118030
 */
public class KingBarberShopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException {
        
        if (connection == null){
            
            MysqlDataSource datasource = new MysqlDataSource();
            datasource.setURL("jdbc:mysql://localhost:3306/kingbarbershop");
            datasource.setUser("root");
            datasource.setPassword("");
            connection = datasource.getConnection();
        }
        
        return connection;
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        
        if(pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection()); 
        }
        
        return pelangganDao;
    }
}
