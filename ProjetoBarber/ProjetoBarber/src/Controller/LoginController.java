
package Controller;

import Controller.helpers.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private final LoginHelper helper;
    
    public LoginController(Login  view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    public void fizTarefa(){
        System.out.println("Busquei algo do banco ");

    }
    public void entrarNoSistema(){
      Usuario usuario = helper.ObterModelo();
      
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      
      Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
      
      if(usuarioAutenticado != null){
         MenuPrincipal menu = new MenuPrincipal();
         menu.setVisible(true);
         this.view.dispose();
        
      }else{
      this.view.exibeMensagem("Usuario ou Senha invalidos");
          
      }
}

}