package Lesson_04;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println(increaser(5, 20));
        System.out.println(min (increaser(10, 5),11));


    }
    public static int increaser(int a, int index) {
        System.out.println("Method invoke");
        a += index;
        System.out.println("method before return");
        return a;
    }

    public static int min (int a, int b) {
        /*if (a < b)
            return a;
        else
            return b; */
        return a < b ? a : b;

    }
}
