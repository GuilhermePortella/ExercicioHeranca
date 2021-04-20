/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

/**
 *
 * @author Guilherme
 */
public class Pessoa {

    String nome, email;
    int idade, cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, int idade, int cpf) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "nome: " + nome
                + " email: " + email
                + " idade: " + idade
                + " cpf: " + cpf;
    }

}
