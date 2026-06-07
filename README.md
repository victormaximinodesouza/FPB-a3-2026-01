# 🏥 FPB A3 2026.1: Sistema de Gestão Hospitalar

![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-blue)
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.3-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)

Projeto desenvolvido para a disciplina **Sistemas Distribuídos e Mobile** da **Faculdade Internacional da Paraíba (FPB)**.

---

## 🎯 Sobre o Projeto

O Sistema de Gestão Hospitalar foi desenvolvido para auxiliar hospitais e unidades de saúde no gerenciamento e acompanhamento de atendimentos hospitalares.

A plataforma centraliza informações relacionadas a:

- 👤 Pacientes
- 👨‍⚕️ Médicos
- 🏥 Hospitais
- 📅 Consultas
- 🧪 Exames
- 🔪 Cirurgias
- 📋 Prontuários
- 📞 Atendimentos
- 📊 Indicadores Gerenciais

O objetivo é otimizar processos internos, melhorar a gestão hospitalar e fornecer informações estratégicas para tomada de decisão.

---

## ✨ Funcionalidades

### 👨‍💼 Administrador

- Dashboard geral
- Gerenciamento de usuários
- Gerenciamento de hospitais
- Gerenciamento de médicos
- Relatórios e indicadores

### 🏥 Recepção

- Consulta de agendamentos
- Controle da fila de espera
- Chamada de pacientes
- Acompanhamento de atendimentos

### 👨‍⚕️ Médico

- Consulta de agenda médica
- Visualização de prontuários
- Solicitação de exames
- Histórico de atendimentos
- Acompanhamento de cirurgias

### 🧪 Laboratório

- Consulta de exames
- Controle de status dos exames
- Acompanhamento de resultados

### 🔪 Centro Cirúrgico

- Gestão de cirurgias
- Controle de salas cirúrgicas
- Associação entre médicos e procedimentos

### 🩸 Banco de Sangue

- Controle de estoque sanguíneo
- Acompanhamento de solicitações
- Registro de doações

---

## 💻 Tecnologias Utilizadas

### Backend

- Java 21
- Spring Boot 4.0.3
- Spring Web
- Spring Data JPA
- Hibernate
- Maven

### Frontend

- HTML5
- CSS3
- JavaScript
- Font Awesome
- Google Fonts

### Banco de Dados

- PostgreSQL

### Ferramentas

- Git
- GitHub
- IntelliJ IDEA
- Maven
- Postman
- Insomnia

---

## ⚙️ Pré-requisitos

### Backend

- JDK 21
- Maven ou Maven Wrapper
- PostgreSQL

### Frontend

- Navegador Web Moderno

### Ferramentas Opcionais

- Git
- IntelliJ IDEA
- Postman
- Insomnia

---

## 🚀 Como Executar o Projeto

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

### 2️⃣ Entre na pasta do projeto

```bash
cd nome-do-projeto
```

### 3️⃣ Configure o banco PostgreSQL

```sql
CREATE DATABASE hospital;
```

### 4️⃣ Execute a aplicação

**Linux/Mac**

```bash
./mvnw spring-boot:run
```

**Windows**

```bash
mvnw.cmd spring-boot:run
```

### 5️⃣ Acesse o sistema

```text
http://localhost:8080
```

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL
```

Estrutura principal:

```text
src
├── entities
├── repositories
├── services
├── resources
├── dto
├── enums
└── config
```

---

## 👥 Equipe de Desenvolvimento

| Participante |
|--------------|
| Lenon Furtado Medeiros |
| Venicio Ferreira da Silva |
| Wlisses Gabriel Cabral dos Santos |
| Victor Maximino de Souza |
| Emanuel Viktor de Souza Bezerra |

---

## 👨‍🏫 Professores

- Pablo Ramon

---

## 📚 Disciplina

**Sistemas Distribuídos e Mobile**

**Faculdade Internacional da Paraíba - FPB**

**Projeto A3 - 2026.1**

---

## 📄 Licença

Projeto acadêmico desenvolvido exclusivamente para fins educacionais.
