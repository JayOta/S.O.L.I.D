# D - Dependency Inversion Principle (Princípio da Inversão de Dependência)

## Definição: Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.

No exemplo errado: Aqui, PasswordReminder depende diretamente de MySQLConnection.

No exemplo correto: Agora, PasswordReminder depende de uma abstração (DBConnectionInterface), permitindo o uso de diferentes implementações de conexão de banco de dados sem modificar a classe PasswordReminder.
