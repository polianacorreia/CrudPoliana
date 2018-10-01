package Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import DAO.ProfessorDAO;
import Entidades.Professor;
import Util.TransacionalCdi;

public class ProfessorService implements Serializable, Service<Professor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProfessorDAO ProfessorDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Professor)
	 */
	@Override
	@TransacionalCdi
	public void save(Professor Professor) {
		ProfessorDAO.save(Professor);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Professor, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Professor Professor)  {
			ProfessorDAO.update(Professor);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Professor)
	 */
	@Override
	@TransacionalCdi
	public void remove(Professor Professor) {
		ProfessorDAO.remove(Professor);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Professor getByID(long ProfessorId)  {
			return ProfessorDAO.getByID(ProfessorId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Professor> getAll() {
			return ProfessorDAO.getAll();
	}


}
