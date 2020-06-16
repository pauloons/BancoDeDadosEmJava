package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DAO.Conexao;
import DAO.UsuarioDAO;
import model.Usuario;
import view.FormCadastroView;

public class FormCadastroController {
	
private FormCadastroView view;

public FormCadastroController(FormCadastroView view) {
	this.view = view;
}	

	public void cadastraUsuario() {
		  String nome = view.getjTextField2().getText();
		    String senha = view.getjTextField3().getText();
		    Usuario usuario = new Usuario(nome,senha);
		    try {
				Connection conexao = new Conexao().getConnection();
				 UsuarioDAO usuariodao = new UsuarioDAO(conexao); 
				   usuariodao.insert(usuario);
				   
				   JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!!!");
				  // setVisible(false);
				   
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
	}

}
