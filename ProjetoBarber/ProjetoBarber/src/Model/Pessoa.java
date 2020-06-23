
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Pessoa {

protected int id;
protected String nome;
protected char sexo;
protected Date dataNasc;
protected int telefone;
protected String email;
protected int rg;

    public Pessoa(int id, String nome, char sexo, String dataNasc, int telefone, String email, int rg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
    try {
        this.dataNasc = new SimpleDateFormat("dd/mm/yyyy").parse(dataNasc);
    } catch (ParseException ex) {
        Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

}
