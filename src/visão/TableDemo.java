/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique matheus
 */
class TableDemo {
    private String analise;

    TableDemo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAnalise() {
        return analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }

    public TableDemo(String analise) {
        this.analise = analise;
    }
    public String sauvado() throws IOException{
        try {
          java.io.FileWriter fw = new java.io.FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/textando.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.print(this.analise+" ");//Valor
           
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
         return null;
    }
}
