# Factory Method

## O que é o Factory Method?

O Factory Method é um padrão de projeto de criação. Ele define uma interface para criar objetos, mas permite que subclasses decidam quais objetos específicos serão criados. Esse padrão é útil quando o sistema precisa escolher entre diferentes tipos de objetos sem precisar modificar o código principal.

### Objetivo

O objetivo do Factory Method é reduzir o acoplamento direto do código principal com classes específicas de objetos, facilitando a criação de novos tipos de objetos sem alterar o código que usa esses objetos.

## Estrutura das Classes

padrão Factory Method para criar notificações (`Email` e `SMS`).

### Componentes

1. **Interface `Notificacao`**: Define um método `enviarNotificacao`, que será implementado por todas as notificações.
2. **Classes Concretas (`EmailNotificacao` e `SmsNotificacao`)**: Implementam a interface `Notificacao`, cada uma para seu tipo de notificação específico.
3. **Classe Abstrata `NotificacaoFactory`**: Define um método `criarNotificacao`, que deve ser implementado pelas subclasses para criar notificações específicas.
4. **Subclasses de `NotificacaoFactory`**: `EmailNotificacaoFactory` e `SmsNotificacaoFactory` implementam o método de fábrica e retornam as instâncias de notificações.

## Diagrama UML

O diagrama UML desta implementação está localizado na pasta [`doc`](./doc) do repositório. Você também pode visualizar o diagrama diretamente clicando [aqui](./doc/Diagrama.png), onde ele mostra a estrutura e a relação entre as classes do padrão Factory Method.
