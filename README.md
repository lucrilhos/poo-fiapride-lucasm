# Projeto FiapRide - Lucas M. Moraes

## Informações do Aluno
- **Nome:** Lucas Mendes Moraes
- **RM:** 563667
- **Turma:** 2CCPO
- **Curso:** Ciências da Computação
- **GitHub:** https://github.com/lucrilhos

## Descrição do Projeto 
Este projeto é o resultado do aprendizado nas aulas 1-9 de programação orientada a objetos, onde aprendi os conceitos dessa área por meio do desenvolvimento do sistema **FiapRide** (aplicativo de mobilidade urbana). Para que, enfim, pude aplicar em um projeto pessoal
com um objeto de minha escolha, que foi uma **jaqueta**, evoluindo de uma forma comercial e criando um **Sistema de Gestão de Estoque**. Tipos, modelos, tamanhos, caimentos e preço em uma array list
de roupas (jaquetas) variadas.

## Checklist de Implementação 
- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos 
- [x] Aula 3 - Encapsulamento 
- [x] Aula 4 - Construtores 
- [x] Aula 5 - Associação / Herança 
- [x] Aula 6 - Herança / Polimorfismo 
- [x] Aula 7 - Polimorfismo / Interfaces 
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces / Collections

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos
**Pergunta:** Por que precisamos criar uma classe 'Passageiro'? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`? Pense: E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso? 
**R:** Eu gosto de imaginar que a classe é tipo um molde de um objeto real. Aplicando isso no mundo da programação, se usássemos umas variáveis soltas, nesse caso teria que criar manualmente milhões de variáveis, poluindo o código e tornando a manutenção inviável. Com a classe `Passageiro`, deixamos o conceito abstrato e podendo instanciar 1 milhão de objetos padronizados de uma maneira organizada.

### Aula 2 - Métodos 
**Pergunta:** Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100.0` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?
**R:** Criar o método centraliza a regra de negócio. Se alterarmos o saldo por conta própria, permite qualquer um inserir valores negativos ou quebrar a lógica do código. O método garante que qualquer mudança de saldo passe por um controle seguro (ex: verificar se o valor de recarga é maior que zero). Isso evita fraudes no sistema.

### Aula 3 - Encapsulamento 
**Pergunta:** No nosso código, os atributos são 'private', mas os métodos `getSaldo()` e `getNome()` são 'public'. Por que é seguro deixar o 'get' público, mas perigoso deixar o atributo original público? Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar? 
**R:** Deixar o atributo público é dar o controle total do sistema externo para modificar, rasurar, copiar ou mudar livremente o original. O método `get` público só retorna o valor, isso protege a integridade do dado, garantindo que o objeto não seja corrompido de fora.

### Aula 4 - Construtores
**Pergunta:** Na nossa classe 'Veiculo', nós tomamos duas decisões arquitetônicas muito importantes: 1. Nós não criamos o método `setModelo()`. 2. O `setPlaca()` foi criado como privado, e criamos um método público chamado `atualizarPlaca()` para acessá-lo. Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo automaticamente' na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica? 
**R:** Utilizando essa lógica no mundo real, o modelo de um carro não muda fisicamente após fabricado, por exemplo. Então, não deve ter um setter. Já a placa pode mudar, mas exige um processo mais complexo com as autoridades responsáveis (o Detran nesse caso). Usar `atualizarPlaca()` em vez de um setter permite colocar as determinadas validações e regras de negócio antes de efetivar a troca no sistema.

### Aula 5 - Associação
**Pergunta:** No construtor da 'Viagem', nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo? Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela? 
**R:** Se passarmos apenas a string, a gente perde o acesso aos comportamentos e dados do passageiro. Isso acarreta a necessidade de acessar o objeto `Passageiro` para debitar o saldo da conta dele. Apenas a string não carrega o dinheiro nem os métodos de pagamento.

### Aula 6 - Herança 
**Pergunta:** No meu código a classe 'Veiculo' possui os atributos `placa` e `modelo` como 'private'. Quando o 'Carro' herda de 'Veiculo', ele recebe esses atributos, mas o código dentro de Carro não consegue fazer `this.placa = "ABC"`,  obrigando a usar o `super()` ou o `setPlaca()`. Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo? 
**R:** O java protege o encapsulamento. A classe mãe é a responsável por garantir as regras de validação, então se a classe filha pudesse alterar os atributos privados diretamente, ela poderia burlar validações importantes que existem nos setters da mãe.

### Aula 7 - Polimorfismo 
**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável 'veiculo' é do tipo genérico 'Veiculo'. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe 'Veiculo', nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do 'Carro' e da 'Moto'? Por que o contrato precisa existir na base da hierarquia?
**R:** Não seria possível. Porque o compilador do java analisa o tipo da variável de referência (nesse caso `Veiculo`). Portanto, se o método não existir na classe mãe, o java não tem o contrato de que todos os objetos daquela lista realmente tenham aquele comportamento em específico. O contrato na base é crucial pro polimorfismo funcionar bem.

### Aula 8 - Classes Abstratas 
**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso? Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que 'Veiculo' é 'abstract'? Por que ele não deduz isso sozinho? Pense: Se esquecermos de colocar 'abstract', qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema? 
**R:** O java precisa da palavra explícita porque ele não interpreta os contextos do mundo real sozinho, então se não colocarmos `abstract`, permitimos que outros desenvolvedores instanciem um `Veiculo` fantasma. O que quebraria o código do sistema por causa da falta de implementação real dos métodos definidas, causando erros em tempo de execução.

### Aula 9 - Interfaces 
**Pergunta:** Por que o Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)? Pense: Se 'CarroEletrico' pudesse herdar de 'Veiculo' E de 'Bateria' ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`? Como as interfaces resolvem esse problema? 
**R:** A herança múltipla gera problemas de ambiguidade, o que ocasiona erros na hora de executar algum método. As interfaces resolvem isso porque elas fornecem apenas a "assinatura" (o contrato) do método, sem o resto do corpo. Assim, quem manda mo comportamento é a própria classe filha, garantindo que sempre terá somente uma implementação pra ser executada.

###########################################

## Desafios Técnicos Implementados 

### Desafio Pessoal (Seu Projeto) 
**Qual foi o domínio que você escolheu para seu projeto pessoal?** 
Sistema de Gestão de E-commerce de Vestuário (FiapRide adaptado para loja de roupas).

**Quais classes você criou?** 
`Jaqueta` (Classe abstrata mãe), `CamisetaOversized` (Classe filha especializada), `Promoção` (Interface), `Main` (Package principal).

**Qual foi o maior desafio técnico que você enfrentou?** 
O maior desafio foi compreender a diferença entre classes abstratas e interfaces, afinal elas têm conceitos bem similares só que distintos na aplicação prática. Entender como moldar o comportamento de desconto (classe `Promoção`) sem engessar a classe pai (`Jaqueta`), e conseguir estruturar o `ArrayList` para processar diferentes tipos de objetos via polimorfismo exigiu bastante atenção, tentativa e erro, pesquisa, consulta e afins.

Conclusão 

**O que você aprendeu nestas 9 aulas?**
Aprendi que a programação orientada a objetos não é assustadora como eu achava, que basta entender a lógica e pensar calmamente para chegar a uma solução. Inclusive, quando você faz o uso de 
analogias a objetos da vida real, por exemplo, torna muito mais fácil compreender a maneira que os sistemas orientados a objetos funcionam. Ainda é preciso bastante treino para fixar os inúmeros conceitos e 
criações necessárias para fazer um projeto funcional e útil, afinal a prática de conceitos como polimorfismo e herança são muito mais fáceis de compreender do que de executar de fato.


**Qual conceito foi mais difícil de entender?** 
Polimorfismo aplicado à herança foi o mais díficil disparado. Foram necessários alguns dias (inclusive de auxílio da IA) para poder ter uma noção boa. 
Especialmente porque o java exige que a classe genérica do lado esquerdo (por exemplo: `Veiculo v = new Carro()`) precisa conter as assinaturas dos métodos, e isso força o programador a criar métodos na classe pai e usar o @Override nas filhas.

**O que você melhoraria no seu projeto se pudesse refazer?**
Se pudesse refazer, eu aprofundaria ainda mais o uso de Collections que vi na aula 9. Em vez de usar apenas o `ArrayList`, eu exploraria esses mapas `HashMap` para buscar produtos pelo ID, por exemplo. Resumidamente, uma forma de deixar listas mais robustas e seguras de forma mais prática e profissional.
