package MadBrains.lesson1;

public class Arrays {
    public static void main(String[] args) {
        int[] mas = new int[10];
        mas[0] = 1;
        mas[1] = mas[2] = mas[3] = mas[0]++;

        for (int i = 0;i<mas.length;i++){
            System.out.println(mas[i]);
        }

        for (int a : mas) {//в int a сложи очередной элемент массива

        }
    }
}
