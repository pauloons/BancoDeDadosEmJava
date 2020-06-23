
package Controller.helpers;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper {
    
 private final Agenda View;

    public AgendaHelper(Agenda View) {
        this.View = View;
    }    

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) View.getTabela().getModel();
    tableModel.setNumRows(0);
    
        for (Agendamento agendamento : agendamentos) {
        tableModel.addRow(new Object[]{
        agendamento.getId(),
        agendamento.getCliente().getNome(),
        agendamento.getServico().getDescricao(),
        agendamento.getValor(),
        agendamento.GetDataFormatada(),
        agendamento.GetHoraFormatada(),
        agendamento.getObservacao(),
        
            });
        }
    }
    public void preencherClientes(ArrayList<Cliente> clientes) {
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) View.getjComboBoxCliente().getModel();
 
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) View.getjComboBoxServico().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Servico obterServico() {
       return (Servico) View.getjComboBoxServico().getSelectedItem();
        
    }
    public Cliente obterCliente() {
        return (Cliente) View.getjComboBoxCliente().getSelectedItem();   
    }
    public void setarValor(float valor) {
         View.getTxtValor().setText(valor+"");
    }
    public Agendamento obterModelo() {
        String idString = View.getTxtID().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = View.getTxtValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = View.getTxtFormatedData().getText();
        String hora = View.getTxtFormatedHora().getText();
        String dataHora = data+" "+hora;
        String observacao = View.getTxtObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id,cliente,servico,valor,dataHora,observacao);
        return agendamento;
    }
    public void limparTela() {
        View.getTxtID().setText("0");
        View.getTxtObservacao().setText("");
        View.getTxtFormatedData().setText("");
        View.getTxtFormatedHora().setText("");
    }
}
    