package Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import DAO.TurmaDAO;
import Entidades.Turma;
import Util.TransacionalCdi;

public class TurmaService implements Serializable, Service<Turma> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private TurmaDAO TurmaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Turma)
	 */
	@Override
	@TransacionalCdi
	public void save(Turma Turma) {
		TurmaDAO.save(Turma);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Turma, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Turma Turma)  {
			TurmaDAO.update(Turma);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Turma)
	 */
	@Override
	@TransacionalCdi
	public void remove(Turma Turma) {
		TurmaDAO.remove(Turma);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Turma getByID(long TurmaId)  {
			return TurmaDAO.getByID(TurmaId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Turma> getAll() {
			return TurmaDAO.getAll();
	}


}
