package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DAO.Conexao;
import DAO.UsuarioDAO;
import model.Usuario;
import view.LoginView;
import view.MenuView;

public class LoginController {
	
			private LoginView view;

			public LoginController(LoginView view) {
				this.view = view;
			}
			
			public void autenticar() throws SQLException {
			        String usuario = view.getjTextField1().getText();
				    String senha = view.getjPasswordField1().getText();
				    Usuario usuarioAutenticar = new Usuario(usuario,senha);
			        
				    Connection conexao = new Conexao().getConnection();
				    
				    UsuarioDAO usuariodao = new UsuarioDAO(conexao);
					
			boolean existe = usuariodao.select(usuarioAutenticar);
			if(existe) {
				
				
				MenuView telamenu = new MenuView();
				telamenu.setVisible(true);
			}else {
			
			JOptionPane.showMessageDialog(view, "Usuario ou Senha Invalidos");
			
			}
			}

			public void teste() {
				MenuView telamenu = new MenuView();
				telamenu.setVisible(true);
			}
			        
			
			}

