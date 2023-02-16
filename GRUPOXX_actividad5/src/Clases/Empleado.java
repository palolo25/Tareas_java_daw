package Clases;

import java.util.Objects;

public class Empleado {


    private int idEmpleado;

    private String nombre;
    private String apellido;
    private String email;
    private double salario;
    private double complemento;
    private char sexo;
    private Trabajo trabajo;
    private Departamento departamento;



    public Empleado(int idEmpleado, String nombre, String apellido, String email, double salario,
        double complemento, char sexo, Trabajo trabajo, Departamento departamento) {
        super();
        this.idEmpleado = idEmpleado;

        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.salario = salario;
        this.complemento = complemento;
        this.sexo = sexo;
        this.trabajo = trabajo;
        this.departamento = departamento;
    }


    public Empleado() {
        super();

    }

    public Trabajo getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getComplemento() {
        return complemento;
    }
    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre +
            ", apellido=" + apellido + ", email=" + email + ", salario=" + salario + ", complemento=" +
            complemento + ", sexo=" + sexo + ", trabajo=" + trabajo + ", departamento=" + departamento + "]";
    }







    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        return idEmpleado == other.idEmpleado;
    }


    public double salarioBruto() {
        double salarioBruto = this.salario + this.complemento;
        return salarioBruto;
    }

    public double salarioMensual(int meses) {
        double salarioMensual = this.salario * meses;
        return salarioMensual;
    }

    public String literalSexo() {

        if (sexo == 'h' || sexo == 'H') {
            return "Hombre";
        } else if (sexo == 'm' || sexo == 'M') {
            return "Mujer";
        } else {
            return "Indefinido";
        }

    }
    public String obtenerEmail() {
        String obtenerEmail = nombre.charAt(0) + "." + apellido.toLowerCase() + "@gmail.com";
        return obtenerEmail;

    }

    public String nombreCompleto() {

        String nombreCompleto = nombre + " " + apellido;
        return nombreCompleto;

    }









}