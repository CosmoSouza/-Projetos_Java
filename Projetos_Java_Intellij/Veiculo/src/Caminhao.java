public class Caminhao extends Veiculos{
    @Override
    public void CalcularConsumo(double distancia) {
        double consumo = distancia / 4;
        System.out.println("O caminhao gastou " + consumo + " por litros");
    }
}
