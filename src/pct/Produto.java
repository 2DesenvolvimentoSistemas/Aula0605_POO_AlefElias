/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Elias
 */
public class Produto {
    //Atributos
    private int codigo;
    private String descricao;
    private char setor; //P = Perecíveis, M = Mercearia
    private double preco;
    //double desconto; atributo não listado
    private boolean disponivel;
    
    public void imprimirProduto(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Setor: " + getSetor());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Disponível: " + isDisponivel());
    }
    
    public void calcularDesconto(){
        setPreco(getPreco() - (getPreco() * 0.1));
        //System.out.println("Desconto de 10 porcento: " + desconto);
        //return preco;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the setor
     */
    public char getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(char setor) {
        this.setor = setor;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the disponivel
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * @param disponivel the disponivel to set
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Produto(int codigo, String descricao, char setor, double preco, boolean disponivel) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.setor = setor;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public Produto() {
    }
    
}
