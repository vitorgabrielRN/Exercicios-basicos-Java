import java.util.Scanner;

public class VerificandoTriagulo {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            
            System.out.println("digite o lado 1");
            int lado1 = sc.nextInt();
            System.out.println("digite o lado 2");
            int lado2 = sc.nextInt();
            System.out.println("digite o lado 3");
            int lado3 = sc.nextInt();

            if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1){
                        System.out.println("OS lados formam o triangulo");
            } else {
                System.out.println("não formam ");
            }

}
}
