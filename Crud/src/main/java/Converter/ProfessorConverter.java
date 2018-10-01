package Converter;

import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import DAO.ProfessorDAO;
import Entidades.Identificavel;
import Entidades.Professor;

@FacesConverter(forClass=Professor.class)
public class ProfessorConverter implements Converter {
	
	@Inject
	private ProfessorDAO ProfessorDAO;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		return ProfessorDAO.getByID(Long.parseLong(id));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object entidade) {
		return ((Identificavel)entidade).getId().toString();
	}


}
