package LMS24.Model;

public class Animal {
    private int id;
    private String name;
    private int age;
    private static int idd=0;

    public Animal( String name, int age) {
        this.id = idd++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Animal.idd = idd;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
