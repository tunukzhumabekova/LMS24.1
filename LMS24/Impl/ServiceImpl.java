package LMS24.Impl;

import LMS24.Model.Animal;
import LMS24.Model.Person;
import LMS24.Service.GenericService;

import java.util.List;

public class ServiceImpl<T> implements GenericService<T> {
private List< Animal>Animals;
private List<Person>People;
private List <T>data;


    public ServiceImpl(List<T> data) {
        this.data = data;
    }

    @Override
    public T add(T t) {
        data.add(t);

        return t;
    }

    @Override
    public T getById(Long id) {

        return null;
    }


    @Override
    public List getAll() {
        return data;
    }

    @Override
    public List sortByName() {
        return null;
    }

    @Override
    public List clear0() {
        data.clear();
        return data;
    }


}
