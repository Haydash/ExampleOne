package program;

public class regular_variable {

    public static void calc(int a, int b, char operator) {

        switch (operator) {
            case '+':
                System.out.println(a + b);
            break;
            case '-':
                System.out.println(a - b);
            break;
            case '*':
                System.out.println(a * b);
            break;
            case '/':
                System.out.println(a / b);
            break;
            default:
                System.out.println("Введите корректный оператор (+, -, *, /)");
            break;
        }
    }
    public static void main(String[] args) {
        calc(2,4, '-');
    }
}
