import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("IMC");
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Peso (kg): ");
            double peso = input.nextDouble();
            System.out.print("Altura (m): ");
            double altura = input.nextDouble();
            new Pessoa(nome, peso, altura).exibirResultado();
        }
    }
}