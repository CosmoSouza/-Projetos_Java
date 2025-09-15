package dobackaofront.controller;

import dobackaofront.model.Item;

import java.io.*;
import java.util.ArrayList;

public class BancoDeDados {
    private Item item;

    public BancoDeDados() {

    }

    public void cadastrar(Item item, boolean opcao) {
        try {
            OutputStream os = new FileOutputStream("Medicamentos.txt", opcao);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String linha = item.getNome() + "," + item.getQuantidade() + "," + item.getTipo();

            bw.write(linha);
            bw.newLine();

            bw.close();
            osw.close();
            os.close();

            System.out.println("O medicamento " + item.getNome() + " Foi cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Nao conseguiu cadastrar o Medicamento!");
            System.out.println(e);
        }
    }

    public void excluir(int codigo, ArrayList<Item> itens) {
        itens.remove(codigo);

        for (int i = 0; i < itens.size(); i++) {
            if (i == 0) {
                cadastrar(itens.get(i), false);
            } else {
                cadastrar(itens.get(i), true);
            }
        }
    }

    public void editar(int codigo, ArrayList<Item> itens) {
        if (itens == null || itens.isEmpty()) {
            System.out.println("Lista de itens não carregada ou vazia.");
            return;
        }
        if (codigo < 0 || codigo >= itens.size()) {
            System.out.println("Índice inválido: " + codigo + " (tamanho = " + itens.size() + ")");
            return;
        }


        Item item = itens.get(codigo);
        item.setNome("Tilenol 200ml XPSKT2");
        item.setQuantidade(300);
        item.setTipo("Frasco de 200ml");


        for (int i = 0; i < itens.size(); i++) {
            cadastrar(itens.get(i), i != 0);
        }
    }

    public Item pesquisar(int codigo, ArrayList<Item> itens) {
        try {
            Item item = itens.get(codigo);
            return item;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Item> ler() {
        ArrayList<Item> itens = new ArrayList<>();
        try (InputStream is = new FileInputStream("Medicamentos.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(isr)) {

            String linha;
            ArrayList<String> linhas = new ArrayList<>();
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
                linhas.add(linha);
            }
            System.out.println("O arquivo Medicamentos.txt foi lido com sucesso!");

            for (String l : linhas) {
                String[] el = l.split(",", 3);
                int q = Integer.parseInt(el[1].trim());
                itens.add(new Item(el[0].trim(), q, el[2].trim()));
            }
            System.out.println("Linhas convertidas em objetos com Sucesso!");
        } catch (Exception e) {
            System.out.println("Nao conseguiu ler o arquivo! " + e.getMessage());
        }
        return itens;
    }
}
