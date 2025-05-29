public class classCategoria {
    public static void main(String[] args) {

    
    double preco = 150.00;


    if(preco <= 50){
        System.out.println("economico");
    } else if (preco > 50 && preco <= 200.00) {
        System.out.println("intermediario");
    } else{
        System.out.println("premium");
    }
    }

}
