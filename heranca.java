/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class professor extends pessoa{
    int matricula;
    double salario;

    public professor(int matricula, double salario, String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.matricula = matricula;
        this.salario = salario;
    }

    public professor(int matricula, double salario) {
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
