package daos;

import java.util.List;

import javabeans.Departamentos;



public interface DepartamentoDao {

	int altadepartamento(Departamentos departamentos);
	int eliminardepartamento(int departamentos);
	int modificardepartamento(Departamentos departamentos);
	List<Departamentos> buscarTodos();
	Departamentos buscarUno(int idDepar);
}
