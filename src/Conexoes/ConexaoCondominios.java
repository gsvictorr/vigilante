
package Conexoes;

import Propriedades.Condominio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConexaoCondominios {
          Connection conexao;
          
           
            
            // lista os condomínios 
            public List<Condominio> ListarCondominiosCombo(){
           conexao = new ConexaoPrincipal().conectarBD();
           String busca = "SELECT idcond, nomecond FROM tb_cond;";
           List<Condominio> lista = new ArrayList<>();
           
           try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Condominio cond = new Condominio();
                cond.setIdCond(result.getInt("idcond"));
                cond.setNomeCond(result.getString("nomecond"));
                
                lista.add(cond);
            }
           } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null, "ConexaoCondominios: ListarCondominiosCombo " + erro);
           } 
               return lista;
       }
            
        public ResultSet verificarIdCond(String cond){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
            String buscarCond = "SELECT idcond FROM tb_cond WHERE nomecond = '" + cond + "';";
            PreparedStatement stm = conexao.prepareStatement(buscarCond);
            ResultSet resultado = stm.executeQuery();
            return resultado;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoCondominios: verificarIdCond: " + erro);
            return null;
        } 
     }
        
        // verificando se o condomínio já existe
        public ResultSet verificarCondominio(Condominio cond){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
            String buscarCond = "SELECT nomecond FROM tb_cond WHERE nomecond = ?";
            PreparedStatement stm = conexao.prepareStatement(buscarCond);
            stm.setString(1, cond.getNomeCond());
            ResultSet resultado = stm.executeQuery();
            return resultado;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoCondominios: verificarCondominio: " + erro);
            return null;
        } 
     }
        
        // puxando os dados do condomínio
        public ResultSet mostrarCond(int id) throws SQLException{
        conexao = new ConexaoPrincipal().conectarBD();
        String filtrarCond = "SELECT * FROM tb_cond WHERE idcond ='" + id + "';";
        PreparedStatement stm = conexao.prepareStatement(filtrarCond);
        ResultSet result = stm.executeQuery();
        return result;
    }   
        // método pra cadastrar condomínio
                // método de cadastrar os moradores
        public void criarCond(Condominio cond){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
        String insertMorador = "INSERT INTO tb_cond (nomecond, cep , end, obs, complemento, numero) "
        + "VALUES (?, ?, ?, ?, ?, ?)";
            
        PreparedStatement stm = conexao.prepareStatement(insertMorador);
            stm.setString(1, cond.getNomeCond());
            stm.setString(2, cond.getCep());
            stm.setString(3, cond.getEnd());
            stm.setString(4, cond.getObs());
            stm.setString(5, cond.getComplemento());
            stm.setString(6, cond.getNumero());
         stm.executeUpdate();
         stm.close();
         JOptionPane.showMessageDialog(null, "Condomínio cadastrado com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/Icon.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoCondominios: criarCond: " + erro);
        }
        
    }
        
        public void editarCond(Condominio cond){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
        String updateMorador = "UPDATE tb_cond SET nomecond  = ?, cep  = ?, end  = ?, obs  = ?, complemento  = ?, numero  = ? WHERE idcond = ?";
        PreparedStatement stm = conexao.prepareStatement(updateMorador);
            stm.setString(1, cond.getNomeCond());
            stm.setString(2, cond.getCep());
            stm.setString(3, cond.getEnd());
            stm.setString(4, cond.getObs());
            stm.setString(5, cond.getComplemento());
            stm.setString(6, cond.getNumero());
            stm.setInt(7, cond.getIdCond());
            stm.executeUpdate();
            stm.close();
            JOptionPane.showMessageDialog(null, "Condomínio alterado com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/Icon.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoCondominios: editarCond: " + erro);
        }
     }
        
        public void excluirCond(Condominio cond){
        String deleteMorador = "DELETE FROM tb_cond WHERE idcond = ?;";
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {     
        PreparedStatement stm = conexao.prepareStatement(deleteMorador);
            stm.setInt(1, cond.getIdCond());
            stm.execute();
            stm.close();
      JOptionPane.showMessageDialog(null, "Condomínio excluido com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/Icon.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoCondominios: excluirCond: " + erro);
        }
        }
        
        
        
        
        public ResultSet verificarObs(int id){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
            String buscarCond = "SELECT * FROM tb_cond WHERE idcond = '" + id + "';";
            PreparedStatement stm = conexao.prepareStatement(buscarCond);
            ResultSet result = stm.executeQuery();
            return result;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoCondominios: verificarIdCond: " + erro);
            return null;
        }   
        }
            
}
