
package metodos;

import visão.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MetodoRegistroDeCompra {
    private String nome;
    private String endereço;
    private String numero;
    private String bairro;
    private String dataNacimento;
    private String aniversario;
    private String email;
    private String whatsApp;
    private String celular;
    private String obiservaçoes;
    private String resutado;
    private String pedido;
    private String hora ;
    private String data;
    private String valores;
    private String analise;

    public String getAnalise() {
        return analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }
    

    
    public String getValores(){
        return valores;
    }
    
    public void setValores(){
        this.valores = valores;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(String whatsApp) {
        this.whatsApp = whatsApp;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObiservaçoes() {
        return obiservaçoes;
    }

    public void setObiservaçoes(String obiservaçoes) {
        this.obiservaçoes = obiservaçoes;
    }

    
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    public String getResutado() {
        return resutado;
    }

    public void setResutado(String resutado) {
        this.resutado = resutado;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
   
    public String sauvado() throws IOException{
        try {
          FileWriter fw = new FileWriter("C:\\Arquivos do programa/textando.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.print(this.resutado+" ");//Valor
            pw.print(this.hora);//Data
            pw.print(";"+this.data+";");//Hora
            pw.print(this.hora+";");//Data
            pw.println(this.nome+";");//Nome
            
           
            
            
            
        //    pw.print(";"+this.valores);
        //   pw.println(";"+this.pedido);
           
           // pw.print(this.valores);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(MetodoRegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }


      
        
     return null;
    }

    void setValores(int Bloclo1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
                        
        
                
       
    
  
   

    
    
    
    
    

