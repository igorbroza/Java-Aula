import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite seu nome:");
       String nome = scanner.nextLine();
       System.out.println("Digite o nome da sua dupla:");
       String nomeDupla = scanner.nextLine();
        System.out.println("Bem Vindo " + nome +" "+ nomeDupla);    
    }
}

