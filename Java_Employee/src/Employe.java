
public class Employe {
	String name;
    public double grossSalary;
    public double tax;
    
 // retorna o salário líquido
	public double NetSalary() {
	 return grossSalary - tax;
    }
	// aumenta o salário bruto baseado na porcentagem
	public void IncreaseSalary (double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
}
