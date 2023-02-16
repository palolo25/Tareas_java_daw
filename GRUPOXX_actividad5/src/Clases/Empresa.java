package Clases;

import java.util.ArrayList;

public class Empresa implements IntGestionEmpresa {

    private String nombreEmpresa;
    private ArrayList<Empleado> plantilla;

    public Empresa(String nombreEmpresa) {
        super();
        this.nombreEmpresa = nombreEmpresa;
        this.plantilla = new ArrayList<Empleado>();
        cargarDatos();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    private void cargarDatos() {
    	
    	Localidad localidad = new Localidad(1, "c/garci n23", "Madrid", "España");
		Departamento departamento = new Departamento(1, "informatica", localidad);
		Trabajo trabajo = new Trabajo("2021D", "programador", 2300, 4000);
		Empleado empleado = new Empleado(1, "Pepe", "perez", "", 3400, 500, 'H', trabajo, departamento);
		plantilla.add(empleado);
		//Empleado2
		Localidad localidad2 = new Localidad(3, "Avenida de España n21", "Madrid", "España");
		Departamento departamento2 = new Departamento(3, "Informatica", localidad2);
		Trabajo trabajo2 = new Trabajo("3409F", "Desarrollador", 1300, 4300);
		Empleado empleado2 = new Empleado(3, "Ana", "Gomez", "", 2100, 500, 'M', trabajo2, departamento2);
		plantilla.add(empleado2);
		//Empleado3
		Localidad localidad3 = new Localidad(4, "San juan 23", "Barcelona", "España");
		Departamento departamento3 = new Departamento(4, "Directivo", localidad3);
		Trabajo trabajo3 = new Trabajo("5050G", "Lider regional", 5000, 12000);
		Empleado empleado3 = new Empleado(4, "Antonio", "Asensio", "", 5000, 3500, 'H', trabajo3, departamento3);
		plantilla.add(empleado3);
		//Empleado4
		Localidad localidad4 = new Localidad(5, "Avenida de Madrid s/n", "Valencia", "España");
		Departamento departamento4 = new Departamento(5, "Desarrollador", localidad4);
		Trabajo trabajo4 = new Trabajo("1245J", "Programador java", 2100, 7000);
		Empleado empleado4 = new Empleado(5, "Carlos", "Fernadez", "", 4500, 1200, 'H', trabajo4, departamento4);
		plantilla.add(empleado4);
		//Empleado5
		Localidad localidad5 = new Localidad(6, "C/ corre y vete n31", "Madrid", "España");
		Departamento departamento5 = new Departamento(6, "Informatica", localidad5);
		Trabajo trabajo5 = new Trabajo("6769T", "Programador python", 4300, 9500);
		Empleado empleado5 = new Empleado(6, "Juan Carlos", "Mendez", "", 6600, 1200, 'H', trabajo5, departamento5);
		plantilla.add(empleado5);		
    }

    @Override
    public boolean altaEmpleado(Empleado empleado) {   
    	if (plantilla.contains(empleado)) {
    		return false;
    	}else {
    		return plantilla.add(empleado);
    	}
    }
    
    @Override
    public boolean eliminarUno(Empleado empleado) {   
        return plantilla.remove(empleado);
    }
    
    @Override
    public boolean modificarUno(Empleado empleado) {      
    	int posicion = plantilla.indexOf(empleado);
        if (posicion == -1) {
    		return false;
    	}
    	plantilla.set(posicion, empleado);
    	return true;
    }
    
    @Override
    public ArrayList<Empleado> buscarPorSexo(char sexo) {
    	ArrayList<Empleado> empleadosCoincidentes = new ArrayList<Empleado>();
    	for(Empleado empleadoPlantilla: plantilla) {
    		if(empleadoPlantilla.getSexo() == sexo) {
    			empleadosCoincidentes.add(empleadoPlantilla);
    		}
    	}	
        return empleadosCoincidentes;
    }
    
    @Override
    public Empleado buscarUno(int idEmpleado) {        	
    	Empleado empleadoBuscado = new Empleado();
    	empleadoBuscado.setIdEmpleado(idEmpleado);;
    	int posicion = plantilla.indexOf(empleadoBuscado);
    	
    	if (posicion == -1) {
    		return null;
    	}
        return plantilla.get(posicion); 
    }
    
    @Override
    public ArrayList<Empleado> buscarTodos() {
        return plantilla;
    }
    
    @Override
    public double masaSalarial() {
       double acumuladorSalario = 0;
       for(Empleado empleadoPlantilla: plantilla) {
    	   acumuladorSalario += empleadoPlantilla.getSalario();
       }
       return acumuladorSalario;
    }
    
    @Override
    public ArrayList<Empleado> buscarPorDepartamento(int idDepar) {
       	ArrayList<Empleado> empleadosEncontrados = new ArrayList<Empleado>();
    	for(Empleado empleadoPlantilla: plantilla) {
    		if(empleadoPlantilla.getDepartamento().getIdDepar() == idDepar) {
    			empleadosEncontrados.add(empleadoPlantilla);
    		}
    	}	
        return empleadosEncontrados;
    }
    
    @Override
    public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {   
    	ArrayList<Empleado> empleadosEncontrados = new ArrayList<Empleado>();
    	for(Empleado empleadoPlantilla: plantilla) {
    		if(empleadoPlantilla.getTrabajo().getIdTrabajo().equalsIgnoreCase(idTrabajo)) {
    			empleadosEncontrados.add(empleadoPlantilla);
    		}
    	}	
        return empleadosEncontrados;
    }
    
    @Override
    public ArrayList<Empleado> buscarPorPais(String pais) {
    	ArrayList<Empleado> empleadosEncontrados = new ArrayList<Empleado>();
    	for(Empleado empleadoPlantilla: plantilla) {
    		if(empleadoPlantilla.getDepartamento().getLocalidad().getPais().equalsIgnoreCase(pais)) {
    			empleadosEncontrados.add(empleadoPlantilla);
    		}
    	}	
        return empleadosEncontrados;
    }

   



}
