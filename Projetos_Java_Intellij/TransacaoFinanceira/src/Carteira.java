import java.util.ArrayList;
import java.util.List;

public class Carteira {
    private List<Transacao> transacoes;

    public Carteira() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void listarTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação encontrada.");
        } else {
            for (Transacao t : transacoes) {
                System.out.println("Descrição: " + t.getDescricao());
                System.out.println("Tipo: " + t.getTipo());
                System.out.println("Valor: R$ " + t.getValor());
                System.out.println("------");
            }
        }
    }

    public double calcularSaldo() {
        double saldo = 0.0;
        for (Transacao t : transacoes) {
            if (t.getTipo().equalsIgnoreCase("entrada")) {
                saldo += t.getValor();
            } else if (t.getTipo().equalsIgnoreCase("saida")) {
                saldo -= t.getValor();
            }
        }
        return saldo;
    }
}
