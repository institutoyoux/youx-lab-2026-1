# 🚀 Desafio Prático: Sistema de Delivery Turbo

**Objetivo:** Desenvolver um sistema de linha de comando para um restaurante. Você deverá gerenciar a exibição do cardápio, processar avaliações, aplicar regras de negócio (descontos e taxas) e montar a estrutura de dados de um pedido final.

**Regra de Ouro:** Utilize apenas os conceitos vistos em aula (variáveis, loops, condicionais, listas, tuplas, dicionários e funções). 

## 💾 1. A Base de Dados Inicial
Seu programa deve começar declarando a variável abaixo. Ela simula os dados vindos de um sistema. Repare que a quantidade de avaliações varia de produto para produto:

```python
cardapio = [
    {
        "id": 1, 
        "nome": "Hambúrguer Clássico", 
        "preco": 25.50, 
        "avaliacoes": [5, 4, 5]
    },
    {
        "id": 2, 
        "nome": "Pizza Margherita", 
        "preco": 45.00, 
        "avaliacoes": [5, 5, 4, 4, 5, 4]
    },
    {
        "id": 3, 
        "nome": "Batata Frita", 
        "preco": 15.00, 
        "avaliacoes": [3, 4]
    },
    {
        "id": 4, 
        "nome": "Refrigerante Lata", 
        "preco": 8.00, 
        "avaliacoes": [5, 5, 5, 4]
    },
    {
        "id": 5, 
        "nome": "Cachorro Quente Prensado", 
        "preco": 18.90, 
        "avaliacoes": [4, 4, 5, 3]
    },
    {
        "id": 6, 
        "nome": "Suco de Laranja Natural", 
        "preco": 12.00, 
        "avaliacoes": [5, 5, 5]
    },
    {
        "id": 7, 
        "nome": "Sorvete de Baunilha", 
        "preco": 14.50, 
        "avaliacoes": [5, 4, 5, 5]
    },
    {
        "id": 8, 
        "nome": "Porção de Onion Rings", 
        "preco": 22.00, 
        "avaliacoes": [4, 3, 4, 4, 5]
    },
    {
        "id": 9, 
        "nome": "Salada Caesar", 
        "preco": 28.00, 
        "avaliacoes": [5, 5, 4]
    },
    {
        "id": 10, 
        "nome": "Brownie de Chocolate", 
        "preco": 16.00, 
        "avaliacoes": [5, 5, 5, 5, 4]
    }
]
```

## 👤 2. Inicialização do Sistema
Ao rodar o programa, a primeira coisa que o sistema deve fazer é exibir uma mensagem de boas-vindas e pedir para o usuário digitar o **seu nome**. Esse nome será guardado para ser utilizado na finalização do pedido.

## 🖥️ 3. O Menu Principal
Após pegar o nome do usuário, o sistema deve entrar em um loop contínuo e exibir o seguinte menu:

**[1] Ver Cardápio e Avaliações** \
**[2] Adicionar Item ao Pedido** \
**[3] Finalizar Pedido** \
**[4] Sair do Sistema** 

O usuário digitará o número correspondente. Se digitar uma opção inválida, o sistema avisa o erro e mostra o menu novamente.

## ⚙️ 4. O Que Cada Opção Deve Fazer

### Opção [1] Ver Cardápio e Avaliações
O sistema deve iterar sobre a lista do `cardapio` e imprimir na tela:
* ID, Nome e Preço do produto.
* A **Média de Avaliações** do produto (lembre-se de que cada lista tem um tamanho diferente, você precisará calcular a soma das notas e dividir pela quantidade de avaliações daquele item específico).

### Opção [2] Adicionar Item ao Pedido
* O sistema pede o **ID** do produto desejado.
* O sistema pede a **quantidade** daquele produto.
* O programa busca o produto pelo ID. Se não existir, avisa o erro e volta ao menu.
* Se existir, adiciona o item a um "carrinho" (uma lista que guarda os itens escolhidos durante a execução do programa).

### Opção [3] Finalizar Pedido
Esta opção consolida os dados e aplica as regras de negócio. O sistema deve fazer os seguintes passos:

1. **Cálculo do Subtotal:** Somar o valor de todos os itens adicionados ao carrinho.
2. **Aplicar Desconto (Regra de Negócio):**
   * Se o subtotal for **maior que R$ 75,00**, aplica-se **15% de desconto** sobre o subtotal.
   * Se o subtotal for **maior que R$ 50,00** (e até 75,00), aplica-se **10% de desconto** sobre o subtotal.
3. **Taxa de Entrega:** O valor fixo do frete é sempre **R$ 6,00**, independentemente da quantidade de itens. Esse valor é somado após o cálculo do desconto.
4. **Montagem do Dicionário do Pedido:** Você deve criar, na memória, um dicionário exato com esta estrutura (os valores abaixo são apenas exemplos):
   ```python
   pedido_final = {
       "nome_cliente": "João da Silva",
       "itens": [
           {"nome": "Hambúrguer Clássico", "quantidade": 2, "preco_unitario": 25.50},
           {"nome": "Refrigerante", "quantidade": 1, "preco_unitario": 8.00}
       ],
       "subtotal": 59.00,
       "valor_entrega": 6.00,
       "valor_total": 59.10  # Exemplo com 10% de desconto aplicado sobre os 59.00 + 6.00
   }
   ```
5. **Envio para a Cozinha:** O programa deve imprimir na tela a frase `"Gerando pedido e enviando para a cozinha..."` e, logo em seguida, **imprimir o dicionário cru na tela** (usando apenas `print(pedido_final)`). 
6. Após isso, o carrinho deve ser esvaziado para um próximo pedido.

### Opção [4] Sair do Sistema
Encerra o programa com uma mensagem de despedida.

## 🧠 5. Dicas

* **Um passo de cada vez:** Não tente escrever o programa inteiro de uma vez só! Comece criando apenas o loop `while` do menu e faça as opções imprimirem mensagens simples (como "Você escolheu a opção 1"). Só quando o menu estiver funcionando perfeitamente, comece a programar a lógica de cada opção.
* **O `print()` é o seu melhor amigo:** Se o seu código não está fazendo o que você espera, use a função `print()` no meio dele para ver o que está guardado dentro das suas variáveis. Quer saber se o item foi pro carrinho? Faça um `print(carrinho)` temporário para espiar os dados. 
* **Use funções para organizar a bagunça:** Se você colocar toda a matemática e todos os `for` diretamente dentro das opções do menu, seu código vai ficar gigante e difícil de ler. Crie funções separadas (por exemplo, `def calcular_desconto(valor):`) e chame-as no menu. Isso deixa tudo mais limpo.
* **Cuidado com a ordem dos `if` e `elif`:** Na Opção 3, pense muito bem na ordem em que você vai testar os descontos. Se você colocar `if subtotal > 50:` antes de testar se é maior que 75, o que acontece se o pedido for de R$ 80,00? O programa entra na primeira regra verdadeira e ignora o resto!
* **Proteja o Cardápio:** A variável `cardapio` serve apenas para consulta. Quando for colocar um item no carrinho do usuário, você deve pegar o nome e o preço do item lá no cardápio, mas **nunca** apagar ou alterar os dados da lista original.
* **Construindo o Dicionário Final:** Para montar o dicionário da Opção 3, você não precisa fazer tudo em uma linha só. Calcule o subtotal, o desconto e o total em variáveis separadas primeiro. Só no final, junte todas essas variáveis dentro da estrutura do dicionário.
