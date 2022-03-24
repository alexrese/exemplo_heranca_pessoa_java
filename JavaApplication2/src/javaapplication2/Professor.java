/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 3223612
 */
public class Professor extends Pessoa {

    private String disciplina;
    private int horaDeAula;
    private int codDocente;

    public Professor(String disciplina, int horaDeAula, int codDocente, String nome, String sexo, int cpf, int idade) {
        super(nome, sexo, cpf, idade);
        this.disciplina = disciplina;
        this.horaDeAula = horaDeAula;
        this.codDocente = codDocente;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getHoraDeAula() {
        return horaDeAula;
    }

    public void setHoraDeAula(int horaDeAula) {
        this.horaDeAula = horaDeAula;
    }

    public int getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(int codDocente) {
        this.codDocente = codDocente;
    }

}
