package dias.matheus;

import dias.matheus.db.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo");

        db connection = db.getInstance();
        Statement st;
        PreparedStatement pst;
        ResultSet rs;
        try {
            st = connection.getCon().createStatement();

        } catch (SQLException $e)
        {
            Logger.getLogger(db.class.getName()).log(Level.INFO, null, $e);
        }

    }
}