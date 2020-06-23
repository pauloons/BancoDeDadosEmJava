
package Controller.helpers;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    public Usuario ObterModelo(){
    String nome  = view.getTextLogin().getText();
    String senha = view.getTextSenha().getText();
    
    Usuario modelo = new Usuario(senha, 1, nome);
   
    return modelo; 
    }
      public void setarModelo(Usuario modelo){
      
      String nome  = modelo.getNome();
      String senha  =  modelo.getSenha();
      
      view.getTextLogin().setText(nome);
      view.getTextSenha().setText(senha);
      }
      public void limparTela(){
      view.getTextLogin().setText("");
      view.getTextSenha().setText("");
      }
}
