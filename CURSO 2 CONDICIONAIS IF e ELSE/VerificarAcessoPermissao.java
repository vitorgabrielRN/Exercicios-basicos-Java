import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class VerificarAcessoPermissao {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int codigoacessoCorreto = 2023;
    int nivelPermissaoMin = 1;
    int nivelPermissaoMax = 3;

    System.out.println("codigo de accesso");
    int codigoDigitado = sc.nextInt();

    System.out.println("nivel");
    int nivelpermissao = sc.nextInt();

    boolean codigoValido = codigoDigitado == codigoacessoCorreto;
    boolean permissaoValida = nivelpermissao >= nivelPermissaoMin && nivelpermissao <= nivelPermissaoMax;
   

    if (codigoValido && permissaoValida){
        System.out.println("permitido");
    } else {
        System.out.println("invalido");
    } if(!codigoValido){
        System.out.println("codigo errado");
    } if(!permissaoValida){
        System.out.println("permissao invalida");
    }
}
}
