//Это расположение нашего шаблона программы.
package program;

//Это класс - шаблон описания нашего объекта.
public class first_example {
    public static void sayHello() {
        System.out.println("Hello Java");
    }
    /**
     * это метод - действия для объекта. Это главный метод приложения для запуска программы.
     * public - модификатор доступа к переменной/методу.
     * static - это опредение свойств, которые обрабатывает наш метод или свойство значения переменной.
     * void - не возвращает вычисляемое значение.
     */

    public static void main(String[] args) {
        sayHello();
    }
}