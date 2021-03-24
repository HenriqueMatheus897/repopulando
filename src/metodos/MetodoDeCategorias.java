/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import visão.RegistroDeCompra;

/**
 *
 * @author henrique matheus
 */
public class MetodoDeCategorias {
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
     public String sauvado() throws IOException{
        try {
          FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.categoria+";");

           
           // pw.print(this.valores);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }


        
      
        
     return null;
    }

    void setValores(int Bloclo1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
