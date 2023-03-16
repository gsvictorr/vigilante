
package Conexoes;
import Propriedades.Correspondencias;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConexaoCorrespondencia {
        Connection conexao;
        
        // lista os moradores de um determinado condomínio
           public List<Correspondencias> listarCorrespondencias(int cond){
           conexao = new ConexaoPrincipal().conectarBD();
           String busca = "SELECT * FROM tb_correspondencia WHERE cond = '" + cond + "';";
           List<Correspondencias> lista = new ArrayList<>();
           
           try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Correspondencias c = new Correspondencias();
                c.setApto(result.getInt("apto"));
                c.setObs(result.getString("obs"));
                c.setTitulo(result.getString("titulo"));
                c.setData(result.getString("data"));
                c.setHora(result.getString("hora"));
                lista.add(c);
            }
           } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null, "ConexaoCorrespondencia: listarCorrespondencias " + erro);
           } 
           return lista;
       }
           
         public void registrarCorrespondencia(Correspondencias cartas){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
        String insertUserPass = "INSERT INTO tb_correspondencia (apto, cond, titulo, obs, data, hora) "
        + "VALUES (?, ?, ?, ?, ?, ?)";
            
        PreparedStatement stm = conexao.prepareStatement(insertUserPass);
        
           stm.setInt(1, cartas.getApto());
           stm.setInt(2, cartas.getIdcond());
           stm.setString(3, cartas.getTitulo());
           stm.setString(4, cartas.getObs());
           stm.setString(5, cartas.getData());
           stm.setString(6, cartas.getHora()); 

           stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Correspondência registrada com sucesso.", "VIGILANTE| SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/email.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoCorrespondencia: registrarCorrespondencia " + erro);
        }
        
    }
        
}
