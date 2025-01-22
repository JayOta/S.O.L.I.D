# I - Interface Segregation Principle (Princípio da Segregação de Interface)

## Definição: Uma classe não deve ser forçada a implementar interfaces que não usa.

No exemplo errado: Aqui, Pinguim é forçado a implementar setAltitude mesmo que não faça sentido.

No exemplo correto: Agora, Pinguim implementa apenas métodos relevantes para ele, enquanto Papagaio implementa AvesQueVoam.
