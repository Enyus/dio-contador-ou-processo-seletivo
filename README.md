# Lab DIO: Contador ou Processo Seletivo
Repositório para guardar o Lab da DIO para o bootcamp Santander Fullstack Java + Angular, o qual não deixou muito bem explicado se era pra fazer um contator ou um sistema para validação de processo seletivo haha.

Na prática, este é o meu primeiro direto contato coma linguagem Java.

## Na dúvida, façamos os dois!

### Java do VSCode
Eu já tinha instalado o VSCode no meu computador, então o que eu fiz foi simplesmente instalar a extensão ```Extension Pack for Java``` direto no programa. Logo na instalação, foi-me pedido para instalar também a JDK, o que imagino seja necessário para o uso da extensão.

No entanto, conforme dito em aula, é possível baixar o VS Code já com as configurações para o Java [aqui](https://code.visualstudio.com/docs/languages/java).

### Contador ✔
Usando uma [estrutura pré criada pelo instrutor](https://felipe-silva-aguiar.gitbook.io/dio-java/desafios/controle-fluxo), o programa deve receber dois parâmetros através do console que definirão a quantidade de interações de um laço ```for```.
* O segundo parâmetro tem que ser maior que o primeiro e, caso não for, uma excessão deverá ser lançada.
* Cada iteração do loop deve imprimir a frase `"Imprimindo o número [i]"`, onde i é um número começando em 1.

🚩 ***Importante lembrar que as classes de Exception devem ser criadas em um arquivo separado.***

### Processo Seletivo ✔
O desafio demonstrado nos vídeos da plataforma da DIO mostravam a resolução deste desafio, que vem [deste link](https://glysns.gitbook.io/java-basico/controle-de-fluxo/cases). Assim, vou tentar resolvê-lo com o mínimo de intervenção dos vídeos ou de consulta à solução apresentada pelo instrutor. O desafio é:

1. ✔ A partir de uma lista de nomes de candidatos, o programa deve enviar mensagem informando se o RH deve ou não ligar para cada um deles, baseado no valor de salário de uma vaga para a qual se aplicaram:
    * Se o valor salário base (`2000.0`), for maior que valor salário pretentido, imprima : "LIGAR PARA O CANDIDATO";
    * Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : "LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA";
    * Senão imprima: "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS".
```java
// Método nativo oferecido para gera valor aleatório.
import java.util.concurrent.ThreadLocalRandom;
static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
```
---
<br>

2. ✔ Selecionar de uma lista apenas 5 candidados, baseado no retorno do item 1.
```java
// Array com a lista de candidatos
String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
```
---
<br>

3. ✔ Imprimir a lista dos candidados selecionados para os quais o RH deverá ligar.
---
<br>

4. ✔ Criar um método que simule as ligações (devendo ser feitas 3 tentativas):
* Caso o candidato atenda a ligação, o sistema deve imprimir: "CONSEGUIMOS CONTATO COM `[CANDIDATO]` APÓS `[TENTATIVA]` TENTATIVA(S)";
* Do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O(A) CANDIDATO(A) `[CANDIDATO]`".

---

🚩 ***É sério mesmo que não tem um método simples para adicionar um elemento a um array em Java!?***
✔ ***Ah, é porque existe diferença entre array e collections (que são mais próximas das arrays que eu estou acostumado a usar em javascript), era justamente a próxima aula haha.***
