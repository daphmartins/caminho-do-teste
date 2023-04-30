# caminho-do-teste
<p>
Esse repositório é voltado para estudo da linguagem Java com foco em testes e automação de testes de software
</P>

# Sobre o Java
## Classes
 
- Ao criar um arquivo .java, esse arquivo deve possuir o nome de sua classe, i.e, a classe tem que estar compatível com o nome do arquivo 
- As primeiras letras das palavras de uma classe precisam ser maiúsculas. Ex: MinhaClasse

            
            public class MinhaClasse{
                
            } 

- A classe precisa ter um método principal, chamado de main
    - Possui característica única na sua representação de inicialização.
- O método main precisa seguir um padrão: 
    - **public static**; 
    - *void*;
    - parâmetro args **(String [] *args*)**;
    - o corpo do método {}.
  

            public static void main (String [] args){

            }
## Variáveis

<p>
É a identificação de uma porção de espaço de uma memória que será utilizada pelo programa. </p>
<p>Isto é, ao criar uma variável você dá nome específico para uma quantia de memória necessária e ao estabelecer um tipo, você estabelece o tipo de dado que será armazenado nessa memória.
</p>

### Estrutura da variável: 
  <br>

    tipo nomeBemDefinido = Atribuição

- Tipo: String, inteiro, booleano, etc.
- Nome da variável:
  - Deve conter somente letras, **$**, números de 0 a 9 ou _
  - Usualmente começam com letra minúscula ou **$**
  - Em palavras compostas utilizar: camelCase  
  - Deve ter um nome único dentro do escopo  
  - Não contém espaço ou algumas palavras específicas, como *long*
  - **As atribuições são opcionais em alguns casos**

## Constantes
 ### Estrutura da constante 
    final + tipo + nome = atribuição
Exemplo:       

    final String BR = Brasil
- São como variáveis que receberão somente um valor: 
    - Utilizar **UPPER_CASE** 
    - Em palavras compostas devem ser separar por: _
   
 ## Métodos

 ### Estrutura da declaração de métodos:

    tipoDeRetorno nomeObjetivoInfinitivo (Parametros)

Ex: 
    
    public static String formatarCep (long cep)
     