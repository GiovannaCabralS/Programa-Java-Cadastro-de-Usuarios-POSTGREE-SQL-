package UsuarioBanco;
import Banco.ConfigBD;
import UsuarioClass.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
public class UsuarioConBanco 
{ 
    private final Connection conBD;
    java.util.Date d_nasc;
    Long id;
    String nome,
           email,
           telefone,
           endereco;
    
    public UsuarioConBanco()
    { 
        this.conBD = new ConfigBD().getConnection();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(nome,email,telefone,endereco,data_nascimento) VALUES(?,?,?,?,?)";
        try { 
            try (PreparedStatement stmt = conBD.prepareStatement(sql)) 
            {
                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getEmail());
                stmt.setString(3, usuario.getTelefone());
                stmt.setString(4, usuario.getEndereco());
                stmt.setString(5, usuario.getD_Nasc());    
                stmt.execute();
            }
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}