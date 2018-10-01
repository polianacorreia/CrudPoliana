package Service;

import java.util.List;

import Entidades.Identificavel;

public interface Service <E extends Identificavel> {

	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long userId);

	List<E> getAll();

}
