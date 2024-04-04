package br.ulbra.entity;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class trabalho {

    public ArrayList Lista;

    public trabalho() {
        Lista = new ArrayList();
    }

    public trabalho(JTextArea Arlista1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean NumInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    //adicionar

    public void adicionar(String item) {
        if (NumInt(item)) {
            Lista.add(item);
            JOptionPane.showMessageDialog(null, "Número salvo");
        } else {

            JOptionPane.showMessageDialog(null, "Número inválido");
        }
    }
    //listar

    public String listar() {
        String res = "";
        if (!Lista.isEmpty()) {
            for (int i = 0; i < Lista.size(); i++) {
                res += (i + 1) + " = " + Lista.get(i) + "\n";
            }
        } else {

            res = "Lista Vazia";
        }
        return res;
    }
// Remover um número com base em seu índice na lista.

    public void excluir(int indice) {
        if (!Lista.isEmpty()) {
            if (indice > 0 && indice <= Lista.size()) {
                Lista.remove(indice - 1);

                JOptionPane.showMessageDialog(null, " Excluido ");

            } else {
                JOptionPane.showMessageDialog(null, " Código não existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Impossivel excluir, a lista está vazia!");

        }
    }
    // atualizar um número existente com base em seu índice na lista.

    public void adicionarNumero(String item) {
        Lista.add(item);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }

    public void atualizar(int indice, String novoItem) {
        if (!Lista.isEmpty()) {
            if (indice > 0 && indice <= Lista.size()) {
                Lista.set(indice - 1, novoItem);
                JOptionPane.showMessageDialog(null, " Atualizado com sucesso! ");

            } else {
                JOptionPane.showMessageDialog(null, " Índice inválido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Impossível atualizar, a lista está vazia!");
        }
    }

    // Ordenar a lista
    public void ordenarLista(boolean crescente) {

        if (!Lista.isEmpty()) {
            if (crescente) {
                Collections.sort(Lista);
                JOptionPane.showMessageDialog(null, "Lista ordenada em ordem crescente!");
            } else {
                Collections.sort(Lista, Collections.reverseOrder());
                JOptionPane.showMessageDialog(null, "Lista ordenada em ordem decrescente!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível ordenar, a lista está vazia!");
        }
    }

    // Exibir a média dos números presentes na lista.
    public double media() {
        if (!Lista.isEmpty()) {
            double soma = 0;
            for (Object item : Lista) {
                soma += Double.parseDouble(item.toString());
            }
            return soma / Lista.size();
        } else {
            JOptionPane.showMessageDialog(null, "Impossível calcular a média, a lista está vazia!");
            return 0;
        }
    }

    //Mostrar o maior e o menor número na lista.
    public String menMai() {
        if (!Lista.isEmpty()) {
            Object maior = Collections.max(Lista);
            Object menor = Collections.min(Lista);
            return "Maior número: " + maior.toString() + "\nMenor número: " + menor.toString();
        } else {
            return "Impossível encontrar o maior e o menor número, a lista está vazia!";
        }

    }

}
