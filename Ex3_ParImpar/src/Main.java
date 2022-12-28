import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumero;
        int numero;
        int quantPares = 0 , quantImpares = 0;

        System.out.println("Quantidade de Numeros");
        quantNumero = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            }else {
                quantImpares++;
            }

            count++;
        }while (count < quantNumero );
        System.out.println("Numero Pares: "+quantPares);
        System.out.println("Numero Pares: "+quantImpares);
    }

}