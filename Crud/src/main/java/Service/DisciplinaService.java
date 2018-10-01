package Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import DAO.DisciplinaDAO;
import Entidades.Disciplina;
import Util.TransacionalCdi;

public class DisciplinaService implements Serializable, Service<Disciplina> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DisciplinaDAO DisciplinaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Disciplina)
	 */
	@Override
	@TransacionalCdi
	public void save(Disciplina Disciplina) {
		DisciplinaDAO.save(Disciplina);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Disciplina, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Disciplina Disciplina)  {
			DisciplinaDAO.update(Disciplina);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Disciplina)
	 */
	@Override
	@TransacionalCdi
	public void remove(Disciplina Disciplina) {
		DisciplinaDAO.remove(Disciplina);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Disciplina getByID(long DisciplinaId)  {
			return DisciplinaDAO.getByID(DisciplinaId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Disciplina> getAll() {
			return DisciplinaDAO.getAll();
	}

	
	

}
