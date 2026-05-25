# 🏦 Sistema de Transferência Bancária - Simulação em Java

Este é um projeto console desenvolvido em Java que simula operações bancárias essenciais entre contas (Saque, Depósito e Transferência). O grande diferencial deste sistema é o foco na **resiliência do software**, utilizando técnicas avançadas de validação de dados e tratamento de exceções para garantir que a aplicação não quebre diante de erros do usuário.

Projeto desenvolvido com o objetivo de consolidar conceitos de Programação Orientada a Objetos (POO) e manipulação robusta de fluxos de execução.

---

## 🛠️ Conceitos Técnicos e Engenharia de Software Aplicados

Para construir um sistema seguro e alinhado com as boas práticas de mercado, foram aplicados os seguintes conceitos:

* **Tratamento de Exceções Personalizadas (`throw` e `throws`):** A lógica de negócio dentro da classe `Conta` não permite estados inválidos (como transferir valores negativos ou acima do saldo disponível). Em vez de retornar booleanos genéricos, o sistema lança exceções com mensagens descritivas.
* **Resiliência de Interface (Try-Catch Avançado):** No ecossistema de terminal, entradas de dados do usuário são altamente propensas a falhas. O loop de execução na classe `Principal` captura tanto erros de negócio quanto erros de tipo de dado (`InputMismatchException`), impedindo o travamento do programa caso letras sejam digitadas no lugar de números.
* **Limpeza do Buffer do Console:** Uso estratégico de `teclado.nextLine()` dentro do bloco de captura de erros para esvaziar o fluxo de entrada do teclado, evitando o clássico bug de loop infinito em aplicações console.
* **Reutilização de Código (Princípio DRY - Don't Repeat Yourself):** O método `transferir` foi projetado de forma elegante para reutilizar os métodos de `sacar` e `depositar` já existentes, reduzindo a redundância e facilitando a manutenção do código.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java JDK 21 ou superior instalado.
* Git configurado na máquina.

### Passo a Passo no Terminal
1. Clone este repositório na sua máquina:
   ```bash
   git clone https://github.com/keykke/sistema-transferencia-bancaria.git
