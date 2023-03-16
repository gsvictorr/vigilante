
package Conexoes;

import Propriedades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ConexaoUsuarios {
    Connection conexao;
    
    public ResultSet autenticarUsuario(Usuario user){
        conexao = new ConexaoPrincipal().conectarBD();
          //conectado ao Banco de Dados
        
        try {
            String buscarUserPass = "SELECT usuario, senha FROM tb_usuarios WHERE usuario = ? AND senha = ?";
            PreparedStatement stm = conexao.prepareStatement(buscarUserPass);
            stm.setString(1, user.getUsuario());
            stm.setString(2, user.getSenha());    
            ResultSet resultado = stm.executeQuery();
            return resultado;
            // realizando a busca de usuário/senha e retornando o resultado
          
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoUsuário: autenticarUsuario " + erro);
            // caso der erro, retorna a mensagem e não faz nada
            return null;
        } 
        
    }
    
    
    // método de criar usuário e salvar no banco de dados
        public void criarUsuario(Usuario user){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
        String insertUserPass = "INSERT INTO tb_usuarios (nivel, usuario, senha) "
        + "VALUES (?, ?, ?)";
            
        PreparedStatement stm = conexao.prepareStatement(insertUserPass);
            stm.setInt(1, user.getNivel());
            stm.setString(2, user.getUsuario());
            stm.setString(3, user.getSenha());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.", "VIGILANTE (ADMIN) | SUCESSO!", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/iconeAdmin.png")));
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ConexaoUsuários: criarUsuario " + erro);
        }
        
    }
        
        // método de verificar se o usuário já existe no banco de dados
        public ResultSet verificarUsuario(Usuario user){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
            String buscarUser = "SELECT usuario FROM tb_usuarios WHERE usuario = ?";
            PreparedStatement stm = conexao.prepareStatement(buscarUser);
            stm.setString(1, user.getUsuario());
            ResultSet resultado = stm.executeQuery();
            return resultado;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoUsuários: verificarUsuario" + erro);
            return null;
        } 
     }
        public ResultSet verificarNivelUsuario(Usuario user){
        conexao = new ConexaoPrincipal().conectarBD();
        
        try {
            String buscarUser = "SELECT nivel FROM tb_usuarios WHERE usuario = ?";
            PreparedStatement stm = conexao.prepareStatement(buscarUser);
            stm.setString(1, user.getUsuario());
            ResultSet resultado = stm.executeQuery();
            return resultado;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoUsuários: verificarNivelUsuario" + erro);
            return null;
        } 
     }
        
            
           public List<Usuario> listarUsuarios(){
           conexao = new ConexaoPrincipal().conectarBD();
           String busca = "SELECT * FROM tb_usuarios;";
           List<Usuario> lista = new ArrayList<>();
           
           try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Usuario user = new Usuario();
                user.setNivel(result.getInt("nivel"));
                user.setUsuario(result.getString("usuario"));
                lista.add(user);
            }
           } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null, "ConexaoUsuários: listarUsuarios " + erro);
           } 
           return lista;
       }
        
}
