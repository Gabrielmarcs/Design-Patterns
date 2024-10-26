# Abstract Factory

## O que é o Abstract Factory?

O Abstract Factory é um padrão de projeto de criação que fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Esse padrão é útil quando um sistema precisa trabalhar com diferentes tipos de objetos relacionados, garantindo que eles sejam compatíveis entre si sem acoplar o código diretamente a classes específicas.

### Objetivo

O objetivo do Abstract Factory é permitir a criação de famílias de objetos relacionados ou interdependentes de forma coesa e garantir que eles possam ser trocados facilmente. Isso facilita a manutenção do código, permitindo adicionar novas variantes de objetos sem modificar a estrutura principal.

## Estrutura das Classes

Esse projeto utiliza o padrão Abstract Factory para criar diferentes tipos de transporte (Carro e Moto), nas variantes **Combustão** e **Elétrica**.

### Componentes

1. **Interface `TransporteFactory`**: Define os métodos de criação para objetos de transporte (`criarCarro` e `criarMoto`), que são implementados pelas fábricas concretas.
2. **Interfaces dos Produtos**:
   - **`Carro`**: Define o método `exibirInfoCarro`, que exibe informações sobre o carro.
   - **`Moto`**: Define o método `exibirInfoMoto`, que exibe informações sobre a moto.
3. **Classes Concretas de Produtos**:
   - **`CarroCombustao` e `MotoCombustao`**: Implementam as interfaces de `Carro` e `Moto` para veículos a combustão.
   - **`CarroEletrico` e `MotoEletrica`**: Implementam as interfaces de `Carro` e `Moto` para veículos elétricos.
4. **Classes Concretas de Fábrica**:
   - **`CombustaoFactory`**: Implementa a criação de veículos a combustão.
   - **`EletricaFactory`**: Implementa a criação de veículos elétricos.
