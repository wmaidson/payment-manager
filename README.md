# Gerenciador de Pagamentos

Projeto para exportar relatórios de pagamentos no formato CSV e XML.
Testes com JUnit 5, e logger com Log4J

## Como usar

Para processar os pagamentos, basta apenas incluir o arquivo csv no diretório **resources** com as informações necessárias e executar o método main da classe `Main`. Então, vai aparecer no console o arquivo, basta apenas digitar o código do arquivo, isto é, o número que vai aparecer do lado.

## Resultados apresentados

Após execução, aparecerá todos os pagamentos que foram registrados. Também, automaticamente, será criado um diretório chamado **backup** ao qual conterá os arquivos que foram lidos a cada execução.

## Suporte

Para quaisquer dúvidas ou detalhes, consulte a equipe de desenvolvimento.


## Comandos

comandos utilizados para revisão de código

| Comando | Descrição |
| ------ | ------ |
| Alt + 1 | Navegação na barra esquerda |
| psvm | `public static void main(String[] args)` |
| sout| `System.out.println();` |
| setn | `setName` |
| Alt + shift + 10 |  Execução da classe principal |
|shift +F6 | Refatorar|
| F6| Move classe no package|
| alt + shift + fn + insert |Para inserir dados em coluna|
| Alt + insert |Generate|
| ctrl + n | Buscar classe no projeto|
| ctrl+ y | Para remover linhas selecionadas|
|ctrl+ d| Duplicar linha anterior|
|alt + shift + setas| Mover uma linha verticalmente|
|ctrl+ shift + a | Encontra tudo|
|F5 | Para copiar uma classe|
|alt + setas para direta e esquerda | Navegar entre as classes|
|ctrl + alt + l | Arrumar formatação|
|ctrl + alt + m | Extração do método|
|ctrl + shift | Mover a linha no contexto|
|alt + shift | Mover a linha fora do contexto|
|shift + shift | Buscar em qualquer lugar|
|ctrl + shift + f | Buscar pelo caminho|
|ctrl + F12 | Estrutura da classe|
|ctrl + h | Hierarquia de classe|
|ctrl + shift + alt +t | Delegate|
|alt + F7 | Find usages|
|ctrl + shift + F6 | Type migration|
|ctrl + shift + F12 | Extender|
|ctrl + shift + alt + p | Refactor this|
|ctrl + w | Seleçãopor progressão|
|ctrl + d | Copia processo|
|ctrl + / | Comentar código|
|ctrl + alt + c | Constante|
|ctrl + alt + v | Variável|
|ctrl + alt + f | Field|
|ctrl + alt + T | Surround with|
|ctrl + j | Templates|
|ctrl + alt + o | Ajusta as importações|
