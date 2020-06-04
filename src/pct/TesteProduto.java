/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Alef
 */
public class TesteProduto {

    public static void main(String[] args) {

        //Criação em instancia do objeto da classe Produto.
        Produto meuProduto = new Produto();
        
        //Construção do objeto
        
        meuProduto.setCodigo(0);
        
        meuProduto.setDescricao("Feijão");
        
        meuProduto.setSetor('M');
        
        meuProduto.setPreco(10.00);
        
//        meuProduto.desconto='5';
        
        meuProduto.setDisponivel(true);
        
        //Exibindo o meu Produto.
        System.out.println("\n\t\t\t --- Produto ---\n");
        meuProduto.imprimirProduto();
        
        //Testando o médoto calcular desconto.
        meuProduto.calcularDesconto();
        
        //Imprimir o produto com desconto.
        System.out.println("\n\t\t\t -- Produto com Desconto --\n");
        meuProduto.imprimirProduto();
        
        //Criação em instancia do objeto da classe Produto.
        Produto outroProduto = new Produto(77, "Arroz", 'P', 9.90, true);
        
        //Exibindo o meu Produto.
        System.out.println("\n\t\t\t --- Produto ---\n");
        outroProduto.imprimirProduto();
    }
    
}
