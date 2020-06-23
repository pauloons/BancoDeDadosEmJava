
package Model;


public class Usuario extends Pessoa {

private String senha;
private String nivelAcesso;

    public Usuario(String senha, int id, String nome) {
        super(id, nome);
        this.senha = senha;
    }
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }


}
