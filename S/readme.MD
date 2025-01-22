# S - Single Responsibility Principle (Princípio da Responsabilidade Única)

## Definição: Uma classe deve ter apenas uma razão para mudar, ou seja, deve ter apenas uma responsabilidade.

No exemplo errado: Aqui, a classe Order tem múltiplas responsabilidades: cálculo, exibição, e persistência de dados, violando o princípio.

No exemplo correto:
Aqui, cada classe tem uma única responsabilidade: Order lida com lógica de pedidos, OrderRepository com persistência, e OrderViewer com exibição.
