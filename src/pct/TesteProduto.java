/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Almir
 */
public class TesteProduto {

    public static void main(String[] args) {

        //Criação em instancia do objeto da classe veiculo.
        Produto meuProduto = new Produto();
        
        //Cnstrução do objeto
        
        meuProduto.codigo = 0;
        
        meuProduto.descricao = "Feijão";
        
        meuProduto.setor = 'M';
        
        meuProduto.preco = 10.00;
        
//        meuProduto.desconto='5';
        
        meuProduto.disponivel = true;
        
        //Exibindo a minha caranga.
        System.out.println("\n\t\t\t --- Produto ---\n");
        meuProduto.imprimirProduto();
        
        //Testando o médoto calcular desconto
        meuProduto.calcularDesconto();
        
        //Imprimir o produto com desconto
        System.out.println("\n\t\t\t -- Produto com Desconto --\n");
        meuProduto.imprimirProduto();
        
        
    }
    
}
