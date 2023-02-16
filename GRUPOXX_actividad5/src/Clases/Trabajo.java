package Clases;

import java.util.Objects;

public class Trabajo {

    private String idTrabajo;
    private String descripcion;
    private double minSalario;
    private double maxSalario;


    public Trabajo(String idTrabajo, String descripcion, double minSalario, double maxSalario) {
        super();
        this.idTrabajo = idTrabajo;
        this.descripcion = descripcion;
        this.minSalario = minSalario;
        this.maxSalario = maxSalario;
    }



    public Trabajo() {
        super();
    }



    @Override
    public String toString() {
        return "Trabajo [idTrabajo=" + idTrabajo + ", descripcion=" + descripcion + ", minSalario=" + minSalario +
            ", maxSalario=" + maxSalario + "]";
    }



    public String getIdTrabajo() {
        return idTrabajo;
    }



    public void setIdTrabajo(String idTrabajo) {
        this.idTrabajo = idTrabajo;
    }



    public String getDescripcion() {
        return descripcion;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public double getMinSalario() {
        return minSalario;
    }



    public void setMinSalario(double minSalario) {
        this.minSalario = minSalario;
    }



    public double getMaxSalario() {
        return maxSalario;
    }



    public void setMaxSalario(double maxSalario) {
        this.maxSalario = maxSalario;
    }



    @Override
    public int hashCode() {
        return Objects.hash(descripcion, idTrabajo, maxSalario, minSalario);
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trabajo other = (Trabajo) obj;
        return Objects.equals(descripcion, other.descripcion) && Objects.equals(idTrabajo, other.idTrabajo) &&
            Double.doubleToLongBits(maxSalario) == Double.doubleToLongBits(other.maxSalario) &&
            Double.doubleToLongBits(minSalario) == Double.doubleToLongBits(other.minSalario);
    }



}
