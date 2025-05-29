import java.util.Scanner;

public class verificandoDesconto {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("digite o valor da compra");
    int compra = sc.nextInt();
   
    if(compra >= 100){
        double desconto = compra * 0.10;
        double Vdesconto = compra - desconto;
        System.out.println("o valor é " + Vdesconto);
    } else {
        System.out.println("valor da compra:    " + compra);
    }
    sc.close();
 }
}
