import java.util.Scanner;

// se declara la clase
public class MainMultiplicacion {
    // se agrega el metodo main
    public static void main(String[] args) {
        // se llama al metodo Scanner
        Scanner n1 = new Scanner(System.in);
        // se ingresa el mensaje que se le dara al usuario
Multiplicacion m1 = new Multiplicacion();
        System.out.println("Ingresa un numero");
        // se almacena el valor del usuario
        int a = n1.nextInt();
        // se almacena el valor del usuario
        System.out.println("Ingrese el segundo numero");
        // se almacena el valor del usuario
        int b = n1.nextInt();
        // se hace la operacion con los datos ingresados por el usuario
        int r = a * b;
        // se imprime el resultado de la operacion y se muestra en pantalla
        Multiplicacion m2= new Multiplicacion();
        m2.setA(a);
        m2.setB(b);
        m2.setR(r);
        m2.getA();
        m2.getB();
        m2.getR();
System.out.println(m2.toString());
        // se cierra el metodo mian
    }
    // se cierra clase
}