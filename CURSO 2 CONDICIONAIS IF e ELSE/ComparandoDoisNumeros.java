import java.util.Scanner;

public class ComparandoDoisNumeros {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite o primeiro numero");
    int primeiroNumero = sc.nextInt();
    System.out.println("Digite o segundo numero");
    int segundoNumero = sc.nextInt();
    sc.close();


    if(primeiroNumero > segundoNumero){
        System.out.println("o primeiro numero é maior");
    } else if(segundoNumero > primeiroNumero){
        System.out.println("o segundo numero é maior");
    } else {
        System.out.println("iguais");
    }
 }
}
