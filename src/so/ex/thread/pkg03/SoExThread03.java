/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ex.thread.pkg03;

import java.security.SecureRandom;


public class SoExThread03 {

  
 
    public static void main(String[] args) {
        
        final int linha = 3;
        final int coluna = 5;
        int[][] matriz = new int[linha][coluna];

        // populando a matriz com valores aleatorios de 0 a 10
        for(int x = 0; x < linha; x++) {
            for (int y = 0; y < coluna; y++) {
                matriz[x][y] = new SecureRandom().nextInt(10);
            }
        }

        int qtdThreads = 3;

        for (int i = 0; i < qtdThreads; i++) {
            ThreadMatriz threadMatriz = new ThreadMatriz(matriz);
            threadMatriz.start();
        }

    }
}
        

