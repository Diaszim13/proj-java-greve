package dias.matheus.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db {
    Connection con;
    private static db instancia = null;

    public db(){
        String url =
                "jdbc:postgresql://localhost:5432/projSom";
        String usuario = "postgres";
        String senha = "132465";
        try {
            con = DriverManager.getConnection(
                    url,usuario,senha);
            System.out.println("Conexao ok");
        } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getCon(){
        return this.con;
    }

    public static db getInstance(){
        if(instancia == null){
            instancia = new db();
        }
        return instancia;
    }

    public void fecharCon(){
        if (con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
