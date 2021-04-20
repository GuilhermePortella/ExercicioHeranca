/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Trabalhador extends Pessoa {

    double salario, númeroDeRegistro;

    public Trabalhador() {
    }

    public Trabalhador(double salario, double númeroDeRegistro) {
        this.salario = salario;
        this.númeroDeRegistro = númeroDeRegistro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getNúmeroDeRegistro() {
        return númeroDeRegistro;
    }

    public void setNúmeroDeRegistro(double númeroDeRegistro) {
        this.númeroDeRegistro = númeroDeRegistro;
    }

    @Override
    public String toString() {
        return "salario: " + salario
                + " NumeroDeRegistro: " + númeroDeRegistro;
    }

    public static void main(String[] args) {
        calculo13Salario();

    }

    public static void calculo13Salario() {

        double salario;
        double resultadoFinal;
        double resultadoPrimeiraParcela;
        double resultadoSegundaParcela;

        Scanner leitor = new Scanner(System.in);
        //Trabalhador[] trabalhadores = new Trabalhador[2];
        ArrayList<Trabalhador> trabalhadores = new ArrayList<>();

        //Pessoa usuario;
        for (int i = 0; i < 12; i++) {
            Trabalhador colaborador = new Trabalhador();

            System.out.println("Digite o Nome do colaborador: ");
            colaborador.setNome(leitor.next());

            System.out.println("Digite a Idade do colaborador: ");
            colaborador.setIdade(leitor.nextInt());

            System.out.println("Digite o Email do colaborador: ");
            colaborador.setEmail(leitor.next());

            System.out.println("Digite o CPF do colaborador: ");
            colaborador.setCpf(leitor.nextInt());

            System.out.println("Digite o Salario do colaborador: ");
            colaborador.setSalario(leitor.nextDouble());

            System.out.println("Digite o Numero de registro do colaborador: ");
            colaborador.setNúmeroDeRegistro(leitor.nextDouble());

            trabalhadores.add(colaborador);
        }

        System.out.println("Lista de colaboradores: ");
        for (int i = 0; i < trabalhadores.size(); i++) {

            System.out.println("\nNome: " + trabalhadores.get(i).getNome());
            System.out.println("Salario: " + trabalhadores.get(i).getSalario());
            System.out.println("Email para contato: " + trabalhadores.get(i).getEmail());
            System.out.println("Registro do colaborador: " + trabalhadores.get(i).getNúmeroDeRegistro());
            /*
            ***NÃO ESTAMOS CONSIDERANDO OS IMPOSTOS NESSE CALCULO***
            
            Calculo do 13° salario pressupondo que o colaborador tenha 12 meses
            trabalhados, e que o valor digitado ja estaja pronto para o calculo.
            
            Salario / 12 = resutado
            resutado * 12 = resultadoFinal
            
            1° parcela
            resultadoFinal / 2 = resultadoPrimeiraParcela
            2° parcela
            resultadoFinal - resultadoPrimeiraParcela = resultadoSegundaParcela
            
            ***NÃO ESTAMOS CONSIDERANDO OS IMPOSTOS NESSE CALCULO***
             */
            salario = trabalhadores.get(i).getSalario();
            resultadoFinal = (salario / 12) * 12;
            resultadoPrimeiraParcela = (resultadoFinal /= 2);
            System.out.println("13° Salario primeira parcela: " + resultadoPrimeiraParcela);
            System.out.println();
            resultadoSegundaParcela = (salario -= resultadoPrimeiraParcela);
            System.out.println("13° Salario segunda parcela: " + resultadoSegundaParcela);
            System.out.println("----------------------------------");
        }
    }

}
