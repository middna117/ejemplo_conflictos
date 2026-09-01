import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;

        try {
            System.out.println("Ingrese un entero A: ");
            a = Integer.parseInt(br.readLine());
            System.out.println("Ingrese un entero B: ");
            b = Integer.parseInt(br.readLine());
            System.out.println("Ingrese un entero C: ");
            c = Integer.parseInt(br.readLine());

            int resultado = a + b + c;
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}