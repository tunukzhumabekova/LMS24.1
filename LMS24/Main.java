package LMS24;

import LMS24.Impl.ServiceImpl;
import LMS24.Model.Animal;
import LMS24.Model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Rex",2);
        Animal animal1=new Animal("vb",1);

        List<Animal> animalList=new ArrayList<>();
        animalList.add(animal);
        Person person=new Person("Alice",10);
        Person person1=new Person("Bob",18);
        List <Person>PeopleList=new ArrayList<>();
        PeopleList.add(person);


        ServiceImpl A=new ServiceImpl(animalList);
        ServiceImpl P=new ServiceImpl(PeopleList);
        System.out.println(P.getAll());
        System.out.println(P.clear0());
        System.out.println(P.add(person1));
        System.out.println(P.getById(1L));
        P.sortByName();
        System.out.println(A.getById(0L));
        System.out.println(A.add(animal1));
        System.out.println(A.getAll());
        System.out.println(A.clear0());
        A.sortByName();

    }
}
