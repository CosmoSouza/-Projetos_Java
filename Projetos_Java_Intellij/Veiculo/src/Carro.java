public class Carro extends Veiculos{
    @Override
    public void CalcularConsumo(double distancia) {
        double consumo = distancia / 12;
        System.out.println("O carro gastou " + consumo + " litros de combustivel");
    }
}
