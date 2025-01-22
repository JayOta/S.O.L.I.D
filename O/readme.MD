# O - Open/Closed Principle (Princípio Aberto/Fechado)

## Definição: As classes devem estar abertas para extensão, mas fechadas para modificação.

No exemplo errado: Aqui, a classe FolhaDePagamento precisa ser modificada sempre que um novo tipo de contrato for adicionado.

No exemplo correto: Agora, novos tipos de contrato podem ser adicionados sem modificar FolhaDePagamento, apenas implementando a interface Remuneravel.
