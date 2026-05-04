package Bank.Management.System;

import java.sql.*;

public class conn {
    Connection connection;
    Statement statement;
    public conn(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_System","root","root");
            statement=connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();

        }

    }
}
