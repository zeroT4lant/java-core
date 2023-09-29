package MadBrains.lesson3;

public class PM extends Employer<ITRole>{
    public PM(String name,int age){
        super(name,age,ITRole.PM);
    }

    @Override
    public void work(){
        System.out.println(getName() + "- is managing project");
    }
}
