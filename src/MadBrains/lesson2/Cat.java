package MadBrains.lesson2;

public class Cat {

    String name;
    int age;

    public void sayMeow() {
        System.out.println("meow");
    }

    public void jump() {
        System.out.println("jump");
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.name = "Barsik";
        barsik.age = 228;
        barsik.jump();
        barsik.sayMeow();
        System.out.println(barsik.name + " " + barsik.age);
    }
}
