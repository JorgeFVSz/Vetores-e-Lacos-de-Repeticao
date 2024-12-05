import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExercicioBonus {
    public static void main(String[] args) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Agora digite a sua data de nascimento no formato: DD-MM-AAAA");
        String dataNascimentoString = scanner.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formato);

        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(dataNascimento, hoje);

        System.out.println("Olá " + nome + " Sua idade é: " + periodo.getYears() + " anos.");

        scanner.close();
    }
}
