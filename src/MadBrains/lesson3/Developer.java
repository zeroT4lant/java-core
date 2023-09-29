package MadBrains.lesson3;

public class Developer extends Employer<ITRole>{
    private String language;

    public Developer(String name,int age,String language) {
        super(name,age,ITRole.Developer);
        this.language = language;
    }

    public void work(){
        writeCode();
    }

    private void writeCode() {
        System.out.println(getName() + "- developer working " + getAge() + " on " + language);
    }
}
