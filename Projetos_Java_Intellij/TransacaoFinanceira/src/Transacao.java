public class Transacao {

    private String descricao;
    private double valor;
    private String tipo;

    public Transacao(String descricao, String tipo, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo.toLowerCase();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return tipo.toUpperCase() + " | " + descricao + " | R$ " + valor;
    }
}

