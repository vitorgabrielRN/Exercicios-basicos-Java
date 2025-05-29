import java.util.Scanner;

public class VerificandoDoacaoSangue {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("qual sua idade? "); 
   int idade = sc.nextInt();
   System.out.println("qual é o peso");
   int peso = sc.nextInt();
  
   boolean idadeValida = idade >18 && idade<=65;
   boolean pesoValido = peso > 50;

   if(idadeValida && pesoValido){
    System.out.println("o doador é compativel para doar sangue ");
   } else { 
     System.out.println("não é compativel");
   } if(!idadeValida) {
    System.out.println("- deve ter entre 18 - 65 anos");
   } if(!pesoValido){
    System.out.println("tem que pesar mais de 50kg");
   }
   sc.close();
 }
}
