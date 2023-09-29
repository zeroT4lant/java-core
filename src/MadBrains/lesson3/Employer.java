package MadBrains.lesson3;

public abstract class Employer<T> implements Worker {//абстрактный класс как чертёж, принимает интерфейс
    private String name;
    private int age;
    private T role;
    public Employer(String name,int age){
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public T getRole() {
        return role;
    }
}
