//Это расположение нашего шаблона программы.
package program;
//Это класс - шаблон описания нашего объекта.
public class third_example {

    //Переменные:

    //Объявлена, но непроинициализирована
    static double c;
    //Объявлена м проинициализирована
    static int a = 2;
    static int b = 2;

    //void - метод без возвращаемого значения, void - без значения.
    public static void calc(int b) {
        c = a/b;
        System.out.println(c);
    }

    //Метод с возвращаемым значение, int - тип возвращаемого значения через return.
    public static int calcNew(int c) {
        c = a/b;
        System.out.println(c);
        return c;
    }
}


