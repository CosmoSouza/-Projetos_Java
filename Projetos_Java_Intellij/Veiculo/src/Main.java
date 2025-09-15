public class Main {
    public static void main(String[] args) {
        Veiculos v1 = new Veiculos();
        Veiculos v2 = new Carro();
        Veiculos v3 = new Moto();
        Veiculos v4 = new Onibus();
        Veiculos v5 = new Caminhao();

        v1.CalcularConsumo(120);
        v2.CalcularConsumo(120);
        v3.CalcularConsumo(120);
        v4.CalcularConsumo(120);
        v5.CalcularConsumo(120);

    }
}