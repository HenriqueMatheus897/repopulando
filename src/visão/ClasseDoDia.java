/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique matheus
 */
public class ClasseDoDia {
     private String valorDia;

    public String getValorDia() {
        return valorDia;
    }

    public void setValorDia(String valorDia) {
        this.valorDia = valorDia;
    }
     public String sauvado() throws IOException{
        try {
          FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/DadosObitidosDia.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.valorDia+";");
            
           
           // pw.print(this.valores);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
    }
}
