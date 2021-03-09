/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

/**
 *
 * @author henrique matheus
 */
public class pessoas {
    
    private String nome;
    private int idade;
    private String tamanho;
    private String tipo;
    private String descricao;
    private String valor;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public pessoas(String nome, int idade, String tamanho, String tipo, String descricao, String valor) {
        this.nome = nome;
        this.idade = idade;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public pessoas(){}

    public pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
