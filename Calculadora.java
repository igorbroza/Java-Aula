import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo a Calculadora");
        System.out.println("Digite o primeiro numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero:");
        double num2 = scanner.nextDouble();
        System.out.println("Digite a operação desejada: +, -, *, /");
        String operacao = scanner.next();
    
        switch(operacao){
            case "+":
                double soma = num1 + num2;
                System.out.println("A soma é: " + soma);
                break;
            case "-":
                double subtracao = num1 - num2;
                System.out.println("A subtração é: " + subtracao);
                break;
            case "*":
                double multiplicacao = num1 * num2;
                System.out.println("A multiplicação é: " + multiplicacao);
                break;
            case "/":
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("A divisão é: " + divisao);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida. Por favor, escolha entre +, -, *, /.");
        }

        
        
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        
        
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
    }
}
