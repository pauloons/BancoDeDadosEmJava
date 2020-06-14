package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Usuario;
import view.FormCadastroView;

public class UsuarioDAO {

	private final Connection Connection;

	


public UsuarioDAO(java.sql.Connection connection) {
		super();
		Connection = connection;
	}




public void insert(Usuario usuario) {
	
	try {
        Connection conexao = new Conexao().getConnection();
        String sql = ("insert into usuario(usuario,senha)values('"+usuario.getUsuario()+"','"+usuario.getSenha()+"');"); 
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();
        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(FormCadastroView.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void delete(Usuario usuario) {
	
	try {
        Connection conexao = new Conexao().getConnection();
        String sql = ("insert into usuario(usuario,senha)values('"+usuario.getUsuario()+"','"+usuario.getSenha()+"');"); 
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();
        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(FormCadastroView.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}

