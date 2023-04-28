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
- Usualmente começam com letra minúscula ou **$**
- Em palavras compostas: camelCase
- De somente um valor: 
    - Em palavras compostas: separadas por _
    - **UPPER_CASE** 
    - final + tipo + nome = valor
            
            final String BR = Brasil
- Contém somente letras, **$**, números de 0 a 9 ou _
- Deve ter um nome único dentro do escopo
- Não contém espaço ou algumas palavras específicas, como *long*
### Estrutura: 
  <br>

    tipo nomeBemDefinido = Atribuição

    
    