/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ex.thread.pkg03;


public class ThreadMatriz extends Thread {
    
    private int[][] matriz;

    public ThreadMatriz(int[][] matriz) {
       this.matriz = matriz;
    }

    @Override
    public void run() {
        int somaColunas = 0;
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna ++) {
                somaColunas = somaColunas + matriz[linha][coluna];
            }
            System.out.println("Thread Id=" + getId() + " - Linha=" + linha + " - Soma=" + somaColunas);
        }
    
}

}