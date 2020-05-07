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
        
        meuProduto.codigo='1';
        
        meuProduto.descricao="Arroz";
        
        meuProduto.setor='M';
        
        meuProduto.preco= 2.00;
        
        meuProduto.desconto='5';
        
        meuProduto.disponivel= false;
        
        //Exibindo a minha caranga.
        System.out.println("\n\t\t\t --- Produto ---\n");
        meuProduto.imprimirProduto();
        
        
    }
    
}
