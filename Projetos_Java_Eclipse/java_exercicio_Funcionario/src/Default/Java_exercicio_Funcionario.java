package Default;
import java.util.Scanner;
public class Java_exercicio_Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor por hora: ");
        double valorHora = sc.nextDouble();

        // Cálculo do salário
        double salario = horasTrabalhadas * valorHora;

        // Saída formatada com duas casas decimais
        System.out.printf("Número do funcionário: %d\n", numeroFuncionario);
        System.out.printf("Salário: R$ %.2f\n", salario);

        sc.close(); 
        
	}

}
