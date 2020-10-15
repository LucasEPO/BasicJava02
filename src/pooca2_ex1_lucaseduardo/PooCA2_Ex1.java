/*  * Autor: Lucas Eduardo
 * 
 * Exercicio sobre objetos, classes, atributos e métodos
 * d1 = data atual, d2 = data nascimento inserida, d3 = data invalida solicitada no exercicio
 */
package pooca2_ex1_lucaseduardo;

import java.time.LocalDate;
import java.util.Scanner;

public class PooCA2_Ex1 {

    public static void main(String[] args) {
        //Instanciando os objetos d1, d2 e d3
        Scanner scan = new Scanner(System.in);
        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data();
        
        //Requisitando método publico para alterar atributos privados de d1 - Data Atual
        d1.atualizaDia(LocalDate.now().getDayOfMonth());
        d1.atualizaMes(LocalDate.now().getMonthValue());
        d1.atualizaAno(LocalDate.now().getYear());
        
        //Requisitando método publico para alterar atributos privados de d2 - Data Nascimento
        System.out.println("Coloque o dia o mes e o ano de nascimento");
        d2.atualizaDia(scan.nextInt());
        d2.atualizaMes(scan.nextInt());
        d2.atualizaAno(scan.nextInt());
        
        //Requisitando método publico para alterar atributos privados de d3 - Data Solicitada
        d3.atualizaDia(32);
        d3.atualizaMes(13);
        d3.atualizaAno(1827);
        
        //Requisitando método publico que vai exibir os objetos
        System.out.print("D1: ");
        d1.mostraData();
        System.out.print("D2: ");
        d2.mostraData();
        System.out.print("D3: ");
        d3.mostraData();
    }
    
}
