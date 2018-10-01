package DAO;

import java.util.List;

import Entidades.Aluno;
import Filtros.AlunoFiltro;

public class AlunoDAO extends DAO<Aluno> {
	
	public AlunoDAO() {
		super(Aluno.class);
	}

	public List<Aluno> findBy(AlunoFiltro filtro) {
		return null;
	}

}
