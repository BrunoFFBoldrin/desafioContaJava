# 🏦 Desafio Conta Bancária - Java (Alura)

Projeto de simulação de operações de uma conta bancária via terminal, desenvolvido em **Java** como parte do desafio prático da formação Java na [Alura](https://www.alura.com.br/).

---

## 📌 Funcionalidades

- **1 - Consultar Saldo / Extrato**: Exibe o nome do cliente, o tipo de conta (ex: Conta Corrente) e o saldo atual.
- **2 - Receber Valor (Depósito)**: Permite adicionar valores ao saldo com validação contra valores negativos ou zerados.
- **3 - Sacar Valor**: Permite realizar saques com dupla validação:
  - Impede a inserção de valores negativos ou nulos.
  - Verifica se o valor solicitado não ultrapassa o saldo disponível (evitando saldo negativo).
- **4 - Sair**: Encerra a aplicação liberando os recursos (`Scanner`).

---

## 🏗️ Estrutura do Projeto (Orientação a Objetos)

O projeto foi estruturado seguindo os princípios de **Encapsulamento** da Programação Orientada a Objetos (POO):

```
desafioContaJava/
├── DadosConta.java    # Entidade que encapsula os dados e regras de negócio da conta
├── Main.java          # Classe principal com o menu interativo e controle de fluxo
└── README.md          # Documentação do projeto
```

### Detalhes das Classes

- **`DadosConta`**:
  - Encapsula os atributos privados: `nome`, `tipoConta` e `saldo`.
  - Construtor para inicialização dos dados da conta.
  - Métodos `receberValor(double)` e `sacarValor(double)` que atualizam o estado interno do saldo.
  - Método `extrato()` que imprime as informações consolidadas da conta.

- **`Main`**:
  - Instancia o objeto `DadosConta`.
  - Controla o loop do menu iterativo (`while`).
  - Lê e valida as entradas do usuário (`Scanner`) direcionando as ações no `switch/case`.

---

## 🚀 Como Executar

### Pré-requisitos

- **Java JDK** (versão 17, 21 ou superior) instalado e configurado no `PATH`.

### Passo a passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/SEU_USUARIO/desafioContaJava.git
   cd desafioContaJava
   ```

2. **Compile as classes:**
   ```bash
   javac Main.java DadosConta.java
   ```

3. **Execute o programa:**
   ```bash
   java Main
   ```

*(Ou simplesmente execute diretamente via JDK moderno sem compilação prévia:)*
```bash
java Main.java
```

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Paradigma Orientado a Objetos (POO)**
- **Console I/O (`java.util.Scanner`)**
