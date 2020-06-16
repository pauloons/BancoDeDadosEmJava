package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import model.Usuario;
import view.FormCadastroView;

public class UsuarioDAO {

	private final Connection Connection;


public UsuarioDAO(java.sql.Connection connection) {
		Connection = connection;
	}

public void insert(Usuario usuario) throws SQLException {
	
        String sql = ("insert into usuario(usuario,senha)values('"+usuario.getUsuario()+"','"+usuario.getSenha()+"');"); 
        PreparedStatement statement = Connection.prepareStatement(sql);
        statement.execute();    
}

public boolean select(Usuario usuario) throws SQLException {
	
    String sql = ("select * from usuario where usuario = '"+usuario.getUsuario()+"'and senha ='"+usuario.getSenha()+"'"); 
    PreparedStatement statement = Connection.prepareStatement(sql);
    statement.execute();
    
    ResultSet resultSet = statement.getResultSet();
    return resultSet.next();
}

}

