import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Ingresa el operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':

                System.out.println("La suma es: " + suma(num1,num2));
                break;
            case '-':

                System.out.println("La resta es: " + resta(num1, num2));
                break;
            case '*':

                System.out.println("La multiplicación es: " + multiplicar(num1, num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre cero.");
                } else {

                    System.out.println("La división es: " + division(num1,num2));
                }
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }

    }

joñnk.j
}