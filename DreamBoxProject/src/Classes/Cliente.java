/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Senai
 */
public class Cliente {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    private String nome;
    private String Codigo;
    
    public String cadastrar(){ 
        String NOME = nome;
        String CODIGO = Codigo;
        String cadastro = NOME + " " + String.valueOf(Codigo) + " - Cadastrado com sucesso!"; 
        
        return cadastro;
    }
}
