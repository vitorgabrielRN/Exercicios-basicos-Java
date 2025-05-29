import java.util.Scanner;

public class VerificandoNumeroIntervalo {
    public static void main(String[] args) {
       
 
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do emprestimo ");
        Double valor = sc.nextDouble();

        if(valor <1000){
            System.out.println(valor + " Não pode pedir emprestimo");
        } else if(valor > 5000){
            System.out.println("não pode tbm");
        } else{
            System.out.println("aceito" + valor);
        }
    }

}
