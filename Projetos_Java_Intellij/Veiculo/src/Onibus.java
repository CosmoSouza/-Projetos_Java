public class Onibus extends Veiculos{
    @Override
    public void CalcularConsumo(double distancia) {
        double consumo = distancia / 6;
        System.out.println("O carro gastou " + consumo + " Litros de combustivel");
    }
}
