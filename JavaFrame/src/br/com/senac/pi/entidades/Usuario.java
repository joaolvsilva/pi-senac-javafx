/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.entidades;

/**
 *
 * @author netos
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String setor;

    public Usuario(int id, String nome, String email, String senha, String setor) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.setor = setor;
    }
    
    
    public int getId() {
        return id;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
    
}
