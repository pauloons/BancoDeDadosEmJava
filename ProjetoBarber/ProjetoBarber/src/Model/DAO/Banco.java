/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario("paulo",1, "paulo");
        Usuario usuario2 = new Usuario("1fd4",2, "tata");
        Usuario usuario3 = new Usuario("4444",3, "Victor");
        Usuario usuario4 = new Usuario("oiids",4, "Leda");
         
        Cliente cliente1 = new Cliente("Recanto", 72640200,1, "PAULO");
        Cliente cliente2 = new Cliente("Taguatinga",20015474,2,"SANDRA");
        Cliente cliente3 = new Cliente("Ceilandia",2014474,3, "SILAS");
        
        Servico servico1 = new Servico(1, "Corte Simples", 18);
        Servico servico2 = new Servico(2, "Corte Degrade", 30);
        Servico servico3 = new Servico(3, "Barba Simples", 15);
        Servico servico4 = new Servico(4, "Barba Desenhada", 25);
        Servico servico5 = new Servico(5, "Sombrancelhas", 10);
        Servico servico6 = new Servico(6, "Penteados", 3);

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 30, "23/07/2018 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 40, "03/04/2020 22:04");
        Agendamento agendamento3 = new Agendamento(3, cliente2, servico1, 18, "14/07/2019 1:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        usuario.add(usuario4);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
}
