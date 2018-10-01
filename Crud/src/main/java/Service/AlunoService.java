package Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import DAO.AlunoDAO;
import Entidades.Aluno;
import Util.TransacionalCdi;

public class AlunoService implements Serializable, Service<Aluno> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AlunoDAO alunoDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Aluno)
	 */
	@Override
	@TransacionalCdi
	public void save(Aluno aluno) {
		alunoDAO.save(aluno);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Aluno, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Aluno aluno)  {
			alunoDAO.update(aluno);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Aluno)
	 */
	@Override
	@TransacionalCdi
	public void remove(Aluno aluno) {
		alunoDAO.remove(aluno);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Aluno getByID(long alunoId)  {
			return alunoDAO.getByID(alunoId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Aluno> getAll() {
			return alunoDAO.getAll();
	}

	
}
