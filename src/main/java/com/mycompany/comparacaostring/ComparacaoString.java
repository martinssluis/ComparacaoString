/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author Dell
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Luis";
        String nome2 = "Luis";
        String nome3 = new String("Luis"); // new String("Luis") != n1 & n2
        String res;
        res = (nome1.equals(nome3))?"igual":"diferene"; //equals verifica se o conteudo é igual(para objetos utilizar equals em vez de ==)
        System.out.println(res);
    }
}
