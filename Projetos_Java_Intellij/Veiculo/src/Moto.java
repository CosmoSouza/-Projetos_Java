public class Moto extends Veiculos{
    @Override
    public void CalcularConsumo(double distancia) {
        double consumo = distancia / 25;
        System.out.println("A moto gastou" + consumo + " litros de combustivel." );
    }
}
