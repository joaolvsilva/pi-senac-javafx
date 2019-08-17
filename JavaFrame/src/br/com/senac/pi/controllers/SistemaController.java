package br.com.senac.pi.controllers;

import static br.com.senac.pi.repositorio.ProdutoRepositorio.listaProdutos;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import br.com.senac.pi.entidades.Produtos;
import br.com.senac.pi.ui.EditarProduto;

public class SistemaController {

    private DefaultTableModel model;
    private JTable tabelaProdutos;

    public DefaultTableModel getTableModell(JTable table) {
        model = (DefaultTableModel) table.getModel();
        return model;
    }

    public List tableIsEmpety() {
        if (listaProdutos.isEmpty()) {
            Produtos testeProduto = new Produtos();
            testeProduto.setCodigo("123123");
            testeProduto.setNome("teste");
            testeProduto.setPreco(120);
            testeProduto.setQuantidade(1);
            testeProduto.setQuantidadeMin(0);
            testeProduto.setDisponivel("sim");
            listaProdutos.add(testeProduto);

        }
        return listaProdutos;
    }

    public void listarEntidades(DefaultTableModel model) {
        model.setNumRows(0);
        for (Produtos p : listaProdutos) {
            model.addRow(
                    new Object[]{
                        p.getCodigo(),
                        p.getNome(),
                        p.getPreco(),
                        p.getQuantidade(),
                        p.getQuantidadeMin(),
                        p.getDisponivel()
                    });
        }

    }

    public void attTable(DefaultTableModel model) {
        listarEntidades(model);
    }

    public void EditarProdutoTabela() {

    }
}
