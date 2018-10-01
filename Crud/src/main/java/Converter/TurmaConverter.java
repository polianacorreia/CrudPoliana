package Converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import DAO.TurmaDAO;
import Entidades.Identificavel;
import Entidades.Turma;

@FacesConverter(forClass=Turma.class)
public class TurmaConverter implements Converter {
	
	@Inject
	private TurmaDAO TurmaDAO;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		return TurmaDAO.getByID(Long.parseLong(id));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object entidade) {
		return ((Identificavel)entidade).getId().toString();
	}


}
