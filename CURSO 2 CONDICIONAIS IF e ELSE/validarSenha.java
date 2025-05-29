import java.util.Scanner;

public class validarSenha {

    public static void main(String[] args) {
        String senhaCorreta = "123456";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha");
        String tentativaSenha = sc.nextLine();
        sc.close();

        if(tentativaSenha.equals(senhaCorreta)){
            System.out.println("senha correta");
        } else {
            System.out.println("    senha errada  " + tentativaSenha + ":" );
        }
}
}

