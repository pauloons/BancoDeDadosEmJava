
package Model;

public class Cliente extends Pessoa {
    
private String endereco;
private int cep;

    public Cliente(String endereco, int cep, int id, String nome) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

@Override
 public String toString(){
    return getNome();

}
}