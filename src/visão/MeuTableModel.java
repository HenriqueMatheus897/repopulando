/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import visão.pessoas;

/**
 *
 * @author henrique matheus
 */
public class MeuTableModel extends AbstractTableModel{

    private final String[] mNomesColunas = {
        "Nome", //indice 0 vetor 
        "Tamanho",//indice 1 vetor 
        "Tipo",//indice 2 vetor
        "Descrição",//indice 3 vetor
        "Valor"//indice 4 vetor
    };
     
    private final List<pessoas> mLista;
    
    /**
     *
     * @param pListaPessoas
     */
    // sempre que cria uma tabela recebi  a lista de pessoas
    public MeuTableModel(List<pessoas> pListaPessoas){
    mLista = pListaPessoas;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getRowCount() {
       if(null == mLista){
           return 0;
       }
       
       return mLista.size(); // Retorna o tamanho da lista
    }

    @Override
    public int getColumnCount() {
        return mNomesColunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return mLista.get(linha).getNome();
                
            case 1:
                return mLista.get(linha).getIdade();
                
            default:
                return 0;
        }
    }
    
    //Opisionais, porem inportantes 
    public String getColumnName(int indice){
        return mNomesColunas[indice];
    }
    public Class getColClass(int coluna){
        switch(coluna){
        case 0:
                return String.class;
                
            case 1:
                return Integer.class;
                
            default:
                return null;
        }
    }
    
    public pessoas getpessoas(int linha){//retorna a linha toda
        pessoas pessoaDaLinha = new pessoas();
        pessoaDaLinha.setNome(mLista.get(linha).getNome());
        pessoaDaLinha.setIdade(mLista.get(linha).getIdade());
        
        return pessoaDaLinha;
    }
}
