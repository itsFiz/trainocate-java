package module10;

import java.sql.*;

public class DBDemo {

    public static void main(String[] args) {
        new DBDemo().doConnect();
    }

    public void doConnect(){
        String url = "jdbc:mysql://localhost/javatot";
        try{
            Connection conn = DriverManager.getConnection(url,"root","Lokilurve178" );
            System.out.println("Connection Ok");
            Statement stmt = conn.createStatement();

            //insert
            String insert = "INSERT INTO person(name,age,salary)"+"VALUES('Kim', 23, 3000)";
            stmt.execute(insert);

            String sql = "SELECT * FROM person";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("name"));
            };
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        {

        }
    }
}
