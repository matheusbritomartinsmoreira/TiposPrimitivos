/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Tipos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        // Declaração de variáveis primitivas
        byte ano = 25; // Armazena números pequenos (-128 a 127)
        short salário = 2000; // Armazena valores um pouco maiores (-32.768 a 32.767)
        int tentativas_login = 3; // Tipo mais comum para números inteios
        long meses_vida = 240L; // Necessário 'L' para valores longos
        
        float temperatura = 32.5f; // Necessário 'f' no final para indicar float
        double ir = 72.5; // Mais preciso que float
        
        char sexo = 'M'; // Armazena um único caractere
        boolean ativo = true; // Armazena verdadeiro ou falso
        
        // Exibição dos valores
        System.out.printIn("Ano atual: " + Ano) ;
        System.out.printIn("Salário: " + salário) ;
        System.out.printIn("Tentativas de Login: " + tentativas_login ) ;
        System.out.printIn("Meses de vida: " +  meses_vida) ;
        System.out.printIn("Temperatura do Dia: " + temperatura + "m") ;
        System.out.printIn("(%)IR no seu país: " + ir + "kg") ;
        System.out.printIn("Sexo(Masculino ou Feminino): " + sexo) ;
        System.out.printIn("Está ativo? " + ativo) ;
    }
    
}