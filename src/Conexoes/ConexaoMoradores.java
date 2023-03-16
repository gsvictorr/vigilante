
package Conexoes;

import Propriedades.Morador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ConexaoMoradores {
    Connection conexao;
    
    
          // lista os moradores de um determinado condomínio
           public List<Morador> listarMoradores(int pertence){
           conexao = new ConexaoPrincipal().conectarBD();
           String busca = "SELECT aptomorador, nomemorador, idpertence FROM tb_moradores WHERE idpertence = '" + pertence + "';";
           List<Morador> lista = new ArrayList<>();
           
           try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Morador mr = new Morador();
                mr.setApto(result.getInt("aptomorador"));
                mr.setNome(result.getString("nomemorador"));
                mr.setPertence(result.getInt("idpertence"));
                lista.add(mr);
            }
           } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null, "ConexaoMoradores: listarMoradores " + erro);
           } 
           return lista;
       }
           
           
         // exibindo dados dos moradores  
        public ResultSet mostrarMorador(String nome, int id) throws SQLException{
        conexao = new ConexaoPrincipal().conectarBD();
        String filtrarMorador = "SELECT aptomorador, rg, cpf, telefone1, telefone2, veiculo1, veiculo2, placa1, placa2, nivel, idpertence, face FROM tb_moradores WHERE nomemorador = '" + nome + "' and idpertence = " + id + ";";
        PreparedStatement stm = conexao.prepareStatement(filtrarMorador);
        ResultSet result = stm.executeQuery();
        return result;
    }
        // buscando moradores 
        public ResultSet buscarMoradores(int apto, int cond) throws SQLException{
        conexao = new ConexaoPrincipal().conectarBD();
        String filtrar = "SELECT * FROM tb_moradores WHERE aptomorador = '" + apto + "' and idpertence = '" + cond + "';";
        PreparedStatement stm = conexao.prepareStatement(filtrar);
        ResultSet result = stm.executeQuery();
        return result;
        
    }        
        // verifica se o morador já é cadastrado
        public ResultSet verificarMorador(Morador morador){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
            String buscarmorador = "SELECT nomemorador FROM tb_moradores WHERE nomemorador = ? and aptomorador = ?" + " and idpertence = ?";
            PreparedStatement stm = conexao.prepareStatement(buscarmorador);
            stm.setString(1, morador.getNome());
            stm.setInt(2, morador.getApto());
            stm.setInt(3, morador.getPertence());
            ResultSet resultado = stm.executeQuery();
            return resultado;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoMoradores: verificarMorador: " + erro);
            return null;
        } 
     }
        
        // método de cadastrar os moradores
        public void criarMorador(Morador morador){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
        String insertMorador = "INSERT INTO tb_moradores (aptomorador, nomemorador , rg, cpf, telefone1, telefone2, veiculo1, veiculo2, placa1, placa2, nivel, idpertence, face) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
        PreparedStatement stm = conexao.prepareStatement(insertMorador);
            stm.setInt(1, morador.getApto());
            stm.setString(2, morador.getNome());
            stm.setString(3, morador.getRg());
            stm.setString(4, morador.getCpf());
            stm.setString(5, morador.getTel1());
            stm.setString(6, morador.getTel2());
            stm.setString(7, morador.getVeiculo1());
            stm.setString(8, morador.getVeiculo2());
            stm.setString(9, morador.getPlaca1());
            stm.setString(10, morador.getPlaca2());
            stm.setInt(11, morador.getNivel());
            stm.setInt(12, morador.getPertence());
            stm.setBytes(13, morador.getFace());

         stm.executeUpdate();
         stm.close();
         JOptionPane.showMessageDialog(null, "Morador cadastrado com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/iconeAdmin64x64.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoMoradores: criarMorador: " + erro);
        }
        
    }
        
        public void editarMorador(Morador morador){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
        String updateMorador = "UPDATE tb_moradores SET rg  = ?, cpf  = ?, telefone1  = ?, telefone2  = ?, nivel  = ?, veiculo1  = ?,  veiculo2  = ?, placa1  = ?, placa2 = ? WHERE nomemorador = ? AND idpertence = ? AND aptomorador = ? ";
            
        PreparedStatement stm = conexao.prepareStatement(updateMorador);
            stm.setString(1, morador.getRg());
            stm.setString(2, morador.getCpf());
            stm.setString(3, morador.getTel1());
            stm.setString(4, morador.getTel2());
            stm.setInt(5, morador.getNivel());
            stm.setString(6, morador.getVeiculo1());
            stm.setString(7, morador.getVeiculo2());
            stm.setString(8, morador.getPlaca1());
            stm.setString(9, morador.getPlaca2());
            stm.setString(10, morador.getNome());
            stm.setInt(11, morador.getPertence());
            stm.setInt(12, morador.getApto());
            stm.executeUpdate();
            stm.close();
            JOptionPane.showMessageDialog(null, "Morador alterado com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/iconeAdmin64x64.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoMoradores: editarMorador: " + erro);
        }
     }
        
    public void excluirMoradores(Morador morador){
        String deleteMorador = "DELETE FROM tb_moradores WHERE nomemorador = ? AND idpertence = ? AND aptomorador = ?;";
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {     
        PreparedStatement stm = conexao.prepareStatement(deleteMorador);
            stm.setString(1, morador.getNome());
            stm.setInt(2, morador.getPertence());
            stm.setInt(3, morador.getApto());
            stm.execute();
            stm.close();
      JOptionPane.showMessageDialog(null, "Morador excluido com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/iconeAdmin64x64.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoMoradores: excluirMoradores: " + erro);
        }
        }  
        
        
        public void editarMoradorComFoto(Morador morador){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
        String updateMorador = "UPDATE tb_moradores SET rg  = ?, cpf  = ?, telefone1  = ?, telefone2  = ?, nivel  = ?, veiculo1  = ?,  veiculo2  = ?, placa1  = ?, placa2 = ?, face = ? WHERE nomemorador = ? AND idpertence = ? AND aptomorador = ? ";
            
        PreparedStatement stm = conexao.prepareStatement(updateMorador);
            stm.setString(1, morador.getRg());
            stm.setString(2, morador.getCpf());
            stm.setString(3, morador.getTel1());
            stm.setString(4, morador.getTel2());
            stm.setInt(5, morador.getNivel());
            stm.setString(6, morador.getVeiculo1());
            stm.setString(7, morador.getVeiculo2());
            stm.setString(8, morador.getPlaca1());
            stm.setString(9, morador.getPlaca2());
            stm.setBytes(10, morador.getFace());
            stm.setString(11, morador.getNome());
            stm.setInt(12, morador.getPertence());
            stm.setInt(13, morador.getApto());
            stm.executeUpdate();
            stm.close();
            JOptionPane.showMessageDialog(null, "Foto do morador alterada com sucesso.", "VIGILANTE | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/iconeAdmin64x64.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoMoradores: editarMorador: " + erro);
        }
     }   
        
           public List<Morador> ListarAptosCombo(int id){
           conexao = new ConexaoPrincipal().conectarBD();
           String busca = "SELECT aptomorador FROM tb_moradores WHERE idpertence = '" + id + "';";
           List<Morador> lista = new ArrayList<>();
           
           try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Morador morador = new Morador();
                morador.setApto(result.getInt("aptomorador"));                 
                lista.add(morador);
            }
           } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null, "ConexaoMoradores: ListarAptosCombo " + erro);
           } 
               return lista;
       }   
        public ResultSet buscarAptos(int ap, int cond) throws SQLException{
        conexao = new ConexaoPrincipal().conectarBD();
        String filtrar = "SELECT aptomorador FROM tb_moradores WHERE aptomorador = " + ap  + " AND idpertence = " + cond + ";";
        PreparedStatement stm = conexao.prepareStatement(filtrar);
        ResultSet result = stm.executeQuery();
        return result;                   
        }     
}
