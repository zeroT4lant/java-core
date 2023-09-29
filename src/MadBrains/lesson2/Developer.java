package MadBrains.lesson2;

public class Developer extends Employer{
    private String language;

    public Developer() {
    }

    public Developer(String name,int age){
        super(name,age);
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void work() {
        System.out.println(getName() + " override method" + "on " + getLanguage());
    }

    public void writeCode() {
        System.out.println(getName() + " is writing code");
    }
}
