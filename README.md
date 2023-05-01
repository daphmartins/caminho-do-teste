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

## Operadores
- **Operador de atribuição**: =
    - Define ou sobrescreve o valor de uma variável
    - _exemplos_:

            String nome = "Daphne";
            int idade = 29;
            double altura = 1.65;
            char genero = 'Não declarado';
            boolean doadorOrgao = false;
            // Criação de uma nova classe:
            Date dataNascimento = new Date();
- **Operadores aritméticos**: 
    - Operações matemáticas
    - _exemplos_:

            double expressaoMatematica = (10 + 3) * (30.5 - 100);
            int modulo = 10 % 5;
            int soma = 10 + 10;
    - O operador de soma também concatena strings:

            String linguagemProgramacao = "Linguagem " + "JAVA";  
- **Operador unário de valor positivo**: +
- **Operador unário negativo**: - 
    - Nega número ou expressão aritmética;
- **Operador unário de incremento de valor**: ++
    - Incrementa em uma unidade
- **Operador unário de decremento de valor**: --
    - Decrementa uma unidade
- **Operador unário lógico da negação**: !
    - Nega valor de expressão booleana
- **Operador ternário**: ?:
    - Funcionamento semelhante de um if else
    - No _exemplo_ abaixo, o resultado é "Falso":

            a = 5;
            b = 6;
            int resultado = a==b ? "Verdadeiro" : "Falso";
- **Operadores relacionais**:
    - Operam a relação entre duas variáveis ou expressões
    - Retorna um operador booleano
    - Igualdade: ==
    - Diferente: !=
    - Maior que: >
    - Menor que: <
    - Maior ou igual a: >=
    - Menor ou igual a: <=
- **Operadores lógicos**: 
    - Contemplam valores booleanos
    - Ou contemplam expressões relacionais com valores booleanos
    - E: &&
    - Ou: ||
## Métodos

### Estrutura da declaração de métodos:

    tipoDeRetorno nomeObjetivoInfinitivo (Parametros)

Ex: 
    
    public static String formatarCep (long cep)
     
