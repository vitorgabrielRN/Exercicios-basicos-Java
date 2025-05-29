public class planoVIagem {
    

    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaviagem = 200;
        

        Double autonomiaMax =  consumoMedio * capacidadeTanque;
        Double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("autonomia max é " + autonomiaMax);
        System.out.println("autonomia atual é " + autonomiaAtual);
        
        if (autonomiaAtual >= distanciaviagem){
            System.out.println("dá pra viajar");
        } else{
            System.out.println("não vai dar");
        }
        
        

        

}
}
