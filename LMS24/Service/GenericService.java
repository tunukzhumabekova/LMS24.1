package LMS24.Service;

import java.util.List;

public interface GenericService <T>{

    T add(T t);

    T getById(Long id);
List<T> getAll();
List<T> sortByName ();
List<T> clear0();

}
