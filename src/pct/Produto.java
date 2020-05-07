/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Carlos
 */
public class Produto {
    //Atributos
    int codigo;
    String descricao;
    char setor; //P = Privado, M = Mercearia
    double preco;
    double desconto;
    boolean disponivel;
    
    public void imprimirProduto(){
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Setor: " + setor);
        System.out.println("Preço: " + preco);
        System.out.println("Disponível: " + disponivel);
    }
    
    public void calcularDesconto(){
        desconto = preco - (preco * 0.1);
        System.out.println("Desconto de 10 porcento: " + desconto);
    }
}
