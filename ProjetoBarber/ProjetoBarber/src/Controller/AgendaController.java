
package Controller;

import Controller.helpers.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {

 private final Agenda View;
 private final AgendaHelper helper;
        
    public AgendaController(Agenda View) {
        this.View = View;
        this.helper = new AgendaHelper(View);
    }
    
    
 public void atualizaTabela(){
 //buscar uma lista de dados
 //exibir uma lista na view agenda
 //
     AgendamentoDAO agendamentoDao  = new AgendamentoDAO();
     ArrayList<Agendamento> agendamentos = agendamentoDao.selectAll();
      helper.preencherTabela(agendamentos);
 }   
 public void atualizaCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        helper.preencherClientes(clientes);
    }
    public void atualizaServico(){
        ServicoDAO servicoDao=  new ServicoDAO();
        ArrayList<Servico> servicos = servicoDao.selectAll();
        
        helper.preencherServicos(servicos);
    }
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    public void agendar(){
        Agendamento agendamento = helper.obterModelo();
        new AgendamentoDAO().insert(agendamento);
        atualizaTabela();
        helper.limparTela();
    }

    
}
