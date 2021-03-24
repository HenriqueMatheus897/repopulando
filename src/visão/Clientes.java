package visão;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henrique matheus
 */
public class Clientes {
    private String codigo;
    private String Nome;
    private String Cpf;
    private String Email;
    private String RG;
    private String Endereço;
    private String Bairro;
    private String Cep;
    private String Telefone;
    private String Celular;
    private String Obiservaçoes;
    private String Hora;
    private String foto;
    private String inportacao;
    private String pedidos;
    private String cidade;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }
    
    
    public String getInportacao(){
        return inportacao;
    }
    
    public void setInportacao(String inportacao){
        this.inportacao = inportacao;
    }
    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    public String getHora(){
        return Hora;
    }
    public void setHora(String Hora) {
        this.Hora = Hora;
    }  
    
    
    public String getObiservaçoes(){
        return Obiservaçoes;
    }
    
    public void setObiservaçoes(String Obiservaçoes){
        this.Obiservaçoes = Obiservaçoes;
    }
    
    public String getCelular(){
       return Celular;
    }
    
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    public String getTelefone(){
       return Telefone;
    }
    
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public String getCep(){
        return Cep;
    }
    
    public void setCep(String Cep) {
        this.Cep = Cep;
    }
    
    public String getBairro() {
        return Bairro;
    }
    
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }
    
    public String getEndereço() {
        return Endereço;
    }
    
    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }
    
    public String getRG() {
        return RG;
    }
    
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String sauvar(){
        try{
            FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/Texto.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(this.codigo);
            pw.print("/"+this.Nome);
            pw.print("/"+this.Hora +"/0/0");
            pw.print("/"+this.Endereço);
            pw.print("/"+this.Cpf);
            pw.print("/"+this.Bairro);
            pw.print("/"+this.RG);
            pw.print("/"+this.Email);
            pw.print("/"+this.Telefone);
            pw.print("/"+this.Celular);
            pw.print("/"+this.Obiservaçoes);
            pw.println("/"+this.cidade);
            
           // pw.println("/"+this.foto);
            //pw.print("/"+this.inportacao);
            
           // pw.print(this.RG+",");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
        try {   
            FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/Bloco.txt",true); //o true seve para as infomações não apague ao adicionar outras 
            PrintWriter pw = new PrintWriter(fw);
            pw.print(this.Nome +","); //Nome
            pw.print(this.Email+","); //email
            pw.print(this.Cpf+","); //Numero
            pw.print(this.RG+","); //data
            pw.print(this.Endereço+",");  //Rua ou endereço
            pw.print(this.Bairro+","); // bairro
            pw.print(this.Cep+",");  // cep
            pw.print(this.Telefone+","); //whatzapp
            pw.print(this.Celular+",");  //celular
            pw.println(this.Obiservaçoes+","); //Obiservaçoes
            pw.flush();
            pw.close(); 
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "cadastrado com sucesso";
    }

    void setNasc(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setValor(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setInportacao(String[] valoresEntreVirgulas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
