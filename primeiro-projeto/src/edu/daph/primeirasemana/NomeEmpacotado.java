package edu.daph.primeirasemana;

public class NomeEmpacotado{

    public static void main (String [] args){

        String primeiroNome = "Daphne";
        String segundoNome = "Martins";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    } 

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome); 

    } 

}
    

/*
 * Conceitos utilizados:
 * 1- criação da classe NomeEmpacotado (com mesmo nome do arquivo .java), como estruturação inicial 
 * 2- criação, do método main, como método principal da classe NomeEmpacotado, também como estruturação inicial
 * 3- passar o método nomeCompleto
 * 4- chamar o método, utilizando duas variáveis
 * 5- utilizar as variáveis primeiroNome e segundoNome como entrada de dados 
 * 6- utilizar o println como saídas de dados do método processado
 * 7- criação dos diretórios cujo caminho é chamado no package, o caminho: edu/daph/primeirasemana
 * 8- o caminho é caminho do arquivo NomeEmpacotado.java 
 * 9- desse modo, utiliza-se o package edu.daph.primeirasemana para passar o caminho do arquivo .java 
 */