//Это расположение нашего шаблона программы.
package program;
//Это класс - шаблон описания нашего объекта.
public class four_example {

    /**
     * Условные операторы:
     * if() else ()
     * switch() case
     */

    //0-15 - не берем на работу
    //16-17 - на неполный рабочий день
    //18-55 - на полный рабочий день
    //55+ - не берем на работу
    //& - и, | - или.

    public static void recruitment(int age) {
        if (15 >= age || age >= 56) {
            System.out.println("Извините, нет открытых позиций под Вашу кандидатуру");
        } else if (age >= 18) {
            System.out.println("Доброго пожаловать на галеру");
        } else if (age >= 18 || age <= 55) {
            System.out.println("Работаем дальше");
        } else {
            System.out.println("Указан некорректный возраст");
        }
    }

    public static void newRecruitment(int group){
        switch (group) {
            case 1:
                System.out.println("Извините, у нас нет открытых позиций под вашу кандидатуру");
                break;
            case 2:
                System.out.println("Доброго пожаловать на галеру, но не на полный рабочий день");
                break;
            case 3:
                System.out.println("Работаем дальше");
                break;
            default:
                System.out.println("Извините, указан некорректный возраст");
        }
    }

    /**
     * это метод - действия для объекта. Это главный метод приложения для запуска программы.
     * public - модификатор доступа к переменной/методу.
     * static - это опредение свойств, которые обрабатывает наш метод или свойство значения переменной.
     * void - не возвращает вычисляемое значение.
     */

    public static void main(String[] args) {
        newRecruitment(3);
        recruitment(27);
    }
}