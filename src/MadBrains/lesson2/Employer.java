package MadBrains.lesson2;

public class Employer {
    //модификатор доступа protected - до него могут достучаться лишь сам класс и наследники
    //модификатор доступа default - только в этом пакете есть доступ
    private int age;
    protected String name;
    public Employer() {
    }

    public Employer(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void work() {
        System.out.println(this.name + " is working " + this.age + " ages." );
    }
}
