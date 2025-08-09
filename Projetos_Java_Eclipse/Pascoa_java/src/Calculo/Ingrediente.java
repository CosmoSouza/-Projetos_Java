package Calculo;

public class Ingrediente {

	    String nome;
	    double quantidade;
	    double precoPor100g;

	    public Ingrediente(String nome, double quantidade, double precoPor100g) {
	        this.nome = nome;
	        this.quantidade = quantidade;
	        this.precoPor100g = precoPor100g;
	    }

	    public double calcularCusto() {
	        return (quantidade / 100) * precoPor100g;
	    }
	}


