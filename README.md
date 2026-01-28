# 🐶 Sistema de Controle de Banho - PetShop (Java)

Este projeto foi desenvolvido como um exercício prático em **Java**, com o objetivo de aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como **abstração, classes e encapsulamento**.

O exercício faz parte dos estudos realizados no curso:

📘 **Java e a arte da Abstração com Classes e Encapsulamento**

---

## 🎯 Objetivo do Projeto

Simular o funcionamento de uma máquina de banho de um petshop, respeitando regras de negócio como:

- Controle de entrada e saída de pets
- Consumo de água e shampoo por operação
- Necessidade de limpeza da máquina em situações específicas

---

## ⚙️ Funcionalidades Implementadas

A máquina de banho permite realizar as seguintes operações:

- Colocar pet na máquina
- Retirar pet da máquina
- Dar banho no pet
- Abastecer água (2L por vez)
- Abastecer shampoo (2L por vez)
- Verificar nível de água
- Verificar nível de shampoo
- Verificar se há pet na máquina
- Limpar a máquina quando necessário

---

## 📌 Regras de Negócio

O sistema segue as regras propostas no exercício:

- A máquina permite apenas **1 pet por vez**
- Cada banho consome:
  - **10 litros de água**
  - **2 litros de shampoo**
- Capacidade máxima dos reservatórios:
  - Água: **30 litros**
  - Shampoo: **10 litros**
- Caso o pet seja removido sem tomar banho, a máquina fica suja
- Para permitir outro pet, é necessário limpar a máquina
- A limpeza consome:
  - **3 litros de água**
  - **1 litro de shampoo**
- O abastecimento adiciona sempre **2 litros por vez**

---

## 🧱 Estrutura do Projeto

O sistema foi dividido em classes para manter organização e encapsulamento:

- `Pet` → representa o pet e seu estado (limpo ou sujo)
- `PetMachine` → controla as regras e operações da máquina de banho
- `Main` → menu interativo no terminal para utilizar o sistema

---

## ▶️ Como executar
### Pré-requisitos
- Java JDK instalado
- Terminal (CMD, PowerShell, Git Bash ou Linux/macOS)

### Passos
No Terminal:
```bash
git clone https://github.com/MiguelO1iveira/exercicio-petshop-classes-e-encapsulamento-java.git
```
```bash
cd exercicio-petshop-classes-e-encapsulamento-java
```
```bash
javac src/Main.java
```
```bash
java -cp src Main
```
