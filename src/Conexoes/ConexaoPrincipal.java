package Conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoPrincipal {

    private static final String HOSTNAME = "localhost";
    private static final String DB_NAME = "vigilante";
    private static final int PORT = 3306;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "victor2089";
    private Connection conexao;
    
    
    public Connection conectarBD(){
        try{
           conexao  = DriverManager.getConnection("jdbc:mysql://"+HOSTNAME+":"+PORT+"/"+DB_NAME, USERNAME, PASSWORD);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados.");
        }
        return conexao;
    }
    
    
    public void desconectarBD(){
     try {
         if(!conexao.isClosed())
            conexao.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco de dados.");
    }
  }
    }
