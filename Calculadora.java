import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");

        System.out.print("Digite o primeiro númenro: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("\nEscolha uma operação; ");
        System.out.println("1 - Soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");


        System.out.println("Digite sua opção: ");
        int opcao = scanner.nextInt();

        double resultado;

        switch (opcao) {

            case 1:
                resultado = numero1 + numero2;
                System.out.println("resultado;" + resultado );
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("resultado: " + resultado);
                break;

            case 3: resultado = numero1 * numero2;
                System.out.println("resultado" + resultado);
                break;

            case 4:
              if (numero2 !=0 ){  
                resultado = numero1 / numero2; 
                System.out.println("resultado" + resultado);
              }else{
                System.out.println("Não é posivel dividir por zero!");
              }
              break;
            
        default: 
            System.out.println("Opção invalida!");

        }

        scanner.close();
        
    }
}