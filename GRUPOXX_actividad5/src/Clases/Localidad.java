package Clases;

import java.util.Objects;

public class Localidad {

    private int idLocalidad;
    private String direccion;
    private String ciudad;
    private String pais;



    public Localidad(int idLocalidad, String dirreccion, String ciudad, String pais) {
        super();
        this.idLocalidad = idLocalidad;
        this.direccion = dirreccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }




    public Localidad() {
        super();
    }




    @Override
    public String toString() {
        return "Localidad [idLocalidad=" + idLocalidad + ", dirreccion=" + direccion + ", ciudad=" + ciudad + ", pais=" +
            pais + "]";
    }




    public int getIdLocalidad() {
        return idLocalidad;
    }




    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }




    public String getDireccion() {
        return direccion;
    }




    public void setDireccion(String dirreccion) {
        this.direccion = dirreccion;
    }




    public String getCiudad() {
        return ciudad;
    }




    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }




    public String getPais() {
        return pais;
    }




    public void setPais(String pais) {
        this.pais = pais;
    }




    @Override
    public int hashCode() {
        return Objects.hash(idLocalidad);
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Localidad other = (Localidad) obj;
        return idLocalidad == other.idLocalidad;
    }









}