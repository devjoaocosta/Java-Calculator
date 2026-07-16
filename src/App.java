

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao programa Calculadora 2000!");
        int opcao = 0;
        while (opcao != 5) {
        

        System.out.println("Seleciona a operaçao que deseja realizar:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtraçao");
        System.out.println("3 - Multiplicaçao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Sair");
        opcao = Integer.parseInt(System.console().readLine());
        if (opcao == 5) {
            System.out.println("Saindo do programa...");
            break;
        }
        else if (opcao < 1 || opcao > 5) {
            System.out.println("Opçao invalida!");
        }
        int a = Integer.parseInt(System.console().readLine("Digite o primeiro numero: "));
        int b = Integer.parseInt(System.console().readLine("Digite o segundo numero: "));        
        int result = 0;
        if (opcao == 1) {
            result = a + b;
            System.out.println("O resultado da soma é: " + result);
        }
        else if (opcao == 2) {
            result = a - b;
            System.out.println("O resultado da subtração é: " + result);
        }
        else if (opcao == 3) {
            result = a * b;
            System.out.println("O resultado da multiplicação é: " + result);
        }
        else if (opcao == 4) {
            result = a / b;
            System.out.println("O resultado da divisão é: " + result);
        }
        
    }
    }
}
