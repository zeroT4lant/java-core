package MadBrains.lesson2;

public class Factorial {
    //n==5 допустим. Первый проход - проверку на n=1 не проходит
    // возвращает 5 * на вызов функции(n-1), пока n не уменьшится до 1
    // в конце вернёт 1. Итого 5*4*3*2*1=120;
    public static long factorial(long n) {
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);//
    }
}
