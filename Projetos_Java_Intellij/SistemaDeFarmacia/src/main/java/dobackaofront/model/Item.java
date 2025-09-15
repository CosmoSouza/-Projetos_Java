package dobackaofront.model;

public class Item {
    private String nome;
    private int quantidade;
    private String tipo;
    private int codigo;

    public Item(String nome, int quantidade, String tipo) {
        this.setQuantidade(quantidade);
        this.setNome(nome);
        this.setTipo(tipo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
