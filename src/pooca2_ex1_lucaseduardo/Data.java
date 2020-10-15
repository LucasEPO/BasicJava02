/*  Classe Data - Ex1 CA2 - POO
 *  Autor: Lucas Eduardo
 */
package pooca2_ex1_lucaseduardo;

public class Data {
    //Declarando atributos e suas visibilidades
    private int dia;
    private int mes;
    private int ano;

    //Métodos com suas visibilidades
    public void atualizaDia(int d){
        dia = d;
    }
    
    public void atualizaMes(int m){
        mes = m;
    }
    
    public void atualizaAno(int a){
        ano = a;
    }
    
    public void mostraData(){
        
        //Verificação de data, entra para qualquer um dos casos
        //1. Caso dia abaixo de 0 ou acima de 32 ou
        //2. Caso mes abaixo de 0 ou acima de 12 ou
        //3. caso No mes 02 dia tenha valor maior que 29, embora não verifique qual ano é bissexto
        if( (dia < 0 || dia > 31) || (mes < 0 || mes > 12) || (mes == 2 && dia > 29) ){
            System.out.print("A data inserida é inválida: ");
            
        }
        
        System.out.println( dia + "/" + mes + "/"  + ano);
    }
}


