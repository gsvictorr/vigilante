
package Conexoes;

import Propriedades.Terceiros;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ConexaoTerceiros {
        Connection conexao;
        
        
           public List<Terceiros> listarTerceiros(int condID){
           conexao = new ConexaoPrincipal().conectarBD();
           String busca = "SELECT aptopertence, nome, nivel, data, hora FROM tb_terceiros WHERE condid = '" + condID + "' AND status = 1;";
           List<Terceiros> lista = new ArrayList<>();
           
           try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Terceiros terceiros = new Terceiros();
                terceiros.setApto(result.getInt("aptopertence"));
                terceiros.setNome(result.getString("nome"));
                terceiros.setNivel(result.getInt("nivel"));
                terceiros.setData(result.getString("data"));
                terceiros.setHora(result.getString("hora"));
                lista.add(terceiros);
            }
           } catch (SQLException erro) {
               JOptionPane.showMessageDialog(null, "ConexaoTerceiros: listarTerceiros " + erro);
           } 
           return lista;
       }
           
           
        public void registrarEntrada(Terceiros terceiros){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
        String insertUserPass = "INSERT INTO tb_terceiros (aptopertence, condid, nome, rg, cpf, veiculo, placa, nivel, obs, data, hora, status) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
        PreparedStatement stm = conexao.prepareStatement(insertUserPass);
        
           stm.setInt(1, terceiros.getApto());
           stm.setInt(2, terceiros.getCondID());
           stm.setString(3, terceiros.getNome());
           stm.setString(4, terceiros.getRg());
           stm.setString(5, terceiros.getCpf());
           stm.setString(6, terceiros.getVeiculo());
           stm.setString(7, terceiros.getPlaca());
           stm.setInt(8, terceiros.getNivel());
           stm.setString(9, terceiros.getObs());
           stm.setString(10, terceiros.getData());
           stm.setString(11, terceiros.getHora());
           stm.setInt(12, terceiros.getStatus());
           stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entrada registrada com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/accept.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoTerceiros: registrarEntrada " + erro);
        }
        
    }
        
        
        public void deletarAcessos(int condid){
            conexao = new ConexaoPrincipal().conectarBD();
            
            try {  
                String delete = "UPDATE tb_terceiros set status = 0 WHERE status = 1 AND condid = " + condid + ";";
                PreparedStatement stm = conexao.prepareStatement(delete);
                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Sáidas registradas com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/accept.png")));
                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ConexaoTerceiros: deletarAcessos " + erro);
            }
        }
        
         public List<Terceiros> listarEntradasSaidas(int condID){
           conexao = new ConexaoPrincipal().conectarBD();
           String busca = "SELECT aptopertence, nome, nivel, data, hora, status FROM tb_terceiros WHERE condid = '" + condID + "';";
           List<Terceiros> lista = new ArrayList<>();
           
           try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Terceiros terceiros = new Terceiros();
                terceiros.setApto(result.getInt("aptopertence"));
                terceiros.setNome(result.getString("nome"));
                terceiros.setNivel(result.getInt("nivel"));
                terceiros.setData(result.getString("data"));
                terceiros.setHora(result.getString("hora"));
                terceiros.setStatus(result.getInt("status"));
                lista.add(terceiros);
            }
           } catch (SQLException erro) {
               JOptionPane.showMessageDialog(null, "ConexaoTerceiros: listarEntradasSaidas " + erro);
           } 
           return lista;
       }
}
