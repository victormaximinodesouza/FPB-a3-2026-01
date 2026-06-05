# Documentacao do Projeto

## 1. Descricao do Projeto

### Visao geral

O projeto implementa um sistema de gestao hospitalar chamado **HealthLink**, com foco em centralizar operacoes administrativas e assistenciais em um unico ambiente. A solucao esta dividida em dois blocos:

- **Frontend**: conjunto de telas HTML/CSS/JavaScript para navegacao e visualizacao de indicadores.
- **Backend**: API REST em Java com Spring Boot para modelar entidades hospitalares, consultar dados e acessar o banco PostgreSQL.

### O que o sistema faz

O sistema foi concebido para apoiar a gestao de:

- usuarios e pacientes
- medicos
- hospitais
- prontuarios
- exames
- consultas
- atendimentos
- agendamentos
- fila de espera
- cirurgias
- salas cirurgicas
- senhas de atendimento
- relatorios gerenciais
- doacao de sangue e controle visual de estoque

### Problema que resolve

O projeto busca reduzir a fragmentacao de informacoes hospitalares, reunindo em um unico sistema os principais fluxos clinicos e administrativos da operacao.

### Objetivo do projeto

O objetivo principal e construir uma base para um sistema distribuido de gestao hospitalar, com:

- organizacao modular do dominio
- padronizacao de dados clinicos e administrativos
- consulta centralizada de indicadores
- suporte a evolucao futura da API e da interface

### Estado atual do projeto

Atualmente, o projeto esta em um estagio intermediario entre prototipo de interface e aplicacao integrada:

- o frontend possui telas prontas para os principais modulos
- o dashboard ja consome endpoints reais do backend
- o login tem validacao visual simples no navegador
- o backend ja possui leitura de dados em varios modulos
- existem rotas analiticas para usuarios, consultas, cirurgias, atendimentos e exames
- ainda nao existem rotas de criacao, atualizacao ou exclusao
- alguns endpoints ainda seguem em modo prototipado

---

## 2. Requisitos Funcionais

Com base no codigo atual e nas telas existentes, os requisitos funcionais do sistema sao:

### Acesso

- abrir a tela de login
- validar preenchimento de e-mail e senha no frontend
- acessar o dashboard apos validacao visual
- sair do sistema pela navegacao lateral

### Dashboard

- exibir total de pacientes
- exibir total de consultas do dia
- exibir total de cirurgias agendadas
- exibir quantidade de consultas agendadas do dia como fila de espera
- exibir tabela de consultas do dia

### Usuarios e pacientes

- listar usuarios cadastrados
- consultar total de pacientes
- visualizar dados basicos do usuario
- visualizar prontuario associado ao usuario
- visualizar exames vinculados ao usuario
- manter relacao entre usuario e atendimentos

### Medicos

- listar medicos cadastrados
- exibir CRM, especialidade e telefone
- associar medicos a cirurgias
- associar medicos a hospital
- associar medicos a consultas e exames

### Hospitais

- listar hospitais cadastrados
- exibir nome, numero e endereco
- associar usuarios ao hospital
- associar medicos ao hospital

### Prontuarios

- listar prontuarios
- exibir observacoes e data
- relacionar prontuario a um usuario

### Exames

- listar exames
- exibir tipo e status do exame
- exibir paciente e medico relacionados
- consultar total de exames por mes
- consultar total de exames por status

### Consultas

- listar consultas
- registrar status da consulta
- registrar data da consulta
- associar consulta a um medico
- consultar total de consultas por dia
- listar consultas de uma data especifica

### Cirurgias

- listar cirurgias
- exibir nome, duracao, data e relatorio
- exibir medicos relacionados
- associar cirurgia a sala cirurgica
- consultar total de cirurgias agendadas

### Salas cirurgicas

- listar salas cirurgicas
- exibir numero da sala
- exibir status da sala
- exibir cirurgias relacionadas

### Atendimentos

- listar atendimentos
- registrar descricao, diagnostico e data
- registrar status do atendimento
- associar atendimento a usuario
- consultar total de atendimentos por status

### Agendamentos

- representar agendamentos no backend
- exibir tela de gestao de agendamentos no frontend

### Senhas de atendimento

- representar senha de atendimento no backend
- exibir tela relacionada no frontend

### Relatorios e indicadores

- exibir indicadores gerenciais no frontend
- consultar metricas operacionais na API

---

## 3. Requisitos Nao Funcionais

### Seguranca

- credenciais de banco nao devem ser expostas em producao
- a API deve evoluir para autenticacao e autorizacao reais
- dados clinicos devem ser protegidos
- o login atual e apenas visual e nao autentica no backend

### Desempenho

- listagens simples devem responder rapidamente
- consultas analiticas devem usar contagens diretas no repositorio
- o dashboard deve carregar indicadores sem recarregar a pagina inteira

### Usabilidade

- a navegacao lateral deve ser consistente entre telas
- o dashboard deve apresentar informacoes resumidas de forma clara
- as tabelas devem facilitar leitura de dados hospitalares

### Confiabilidade

- os relacionamentos JPA devem manter coerencia entre entidades
- o perfil `test` deve popular o banco para facilitar demonstracao e testes manuais
- o sistema deve lidar com falhas de chamada no dashboard com mensagens de fallback

### Escalabilidade

- a arquitetura em camadas favorece crescimento do backend
- o uso de enums padroniza estados de negocio
- novas consultas podem ser adicionadas por repositorio e service

### Manutenibilidade

- separacao entre `entities`, `Repository`, `services`, `resources` e `DTO`
- centralizacao do estilo frontend em uma folha principal
- documentacao de API deve acompanhar a evolucao das rotas

---

## 4. Tecnologias Utilizadas

### Linguagens

- Java 21
- HTML5
- CSS3
- JavaScript

### Frameworks e bibliotecas

- Spring Boot 4.0.3
- Spring Web
- Spring Data JPA
- Spring Boot Test
- Maven Wrapper
- Font Awesome
- Google Fonts

### Banco de dados

- PostgreSQL

### Ferramentas e estrutura

- Maven
- IntelliJ IDEA
- JPA / Hibernate
- Jackson para serializacao JSON

### Observacao

- a dependencia H2 foi removida do `pom.xml`
- o banco ativo do projeto atual e apenas PostgreSQL

---

## 5. Pre-requisitos

Para executar o projeto adequadamente, e necessario ter instalado:

### Backend

- JDK 21
- Maven ou uso do wrapper `mvnw`
- PostgreSQL

### Frontend

- navegador web moderno

### Ferramentas opcionais

- Git
- IntelliJ IDEA ou outra IDE Java
- Postman ou Insomnia

### Banco esperado

Configuracao atual em `application.properties`:

- host: `localhost`
- porta: `5432`
- banco: `hospital`
- usuario: `postgres`
- senha: `1234`

---

## 6. Como Instalar o Projeto

### 1. Clonar o repositorio

```bash
git clone <url-do-repositorio>
cd FPB-a3-2026-01
```

### 2. Criar o banco

```sql
CREATE DATABASE hospital;
```

### 3. Validar o Java

```bash
java -version
javac -version
```

### 4. Conferir os caminhos principais

- backend: `backend/SistemaHospitalar`
- frontend: `frontend/healthlink`

---

## 7. Como Executar o Projeto

## Backend

No diretorio do backend:

```bash
cd backend/SistemaHospitalar
./mvnw spring-boot:run
```

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

### Comportamento ao iniciar

- o Spring Boot sobe a aplicacao
- o perfil ativo e `test`
- o schema e recriado com `spring.jpa.hibernate.ddl-auto=create`
- a classe `TestConfig` popula dados iniciais

## Frontend

Abra no navegador:

- `frontend/healthlink/html/login.html`
- `frontend/healthlink/html/index.html`

### Observacoes

- o dashboard usa `fetch` para consultar a API em `http://localhost:8080`
- o login atual so valida campos preenchidos e redireciona para `index.html`

---

## 8. Estrutura de Pastas

```text
FPB-a3-2026-01/
├── backend/
│   ├── SistemaHospitalar/
│   │   ├── pom.xml
│   │   ├── mvnw / mvnw.cmd
│   │   └── src/
│   │       ├── main/
│   │       │   ├── java/com/a3_20261/SistemaHospitalar/
│   │       │   │   ├── config/
│   │       │   │   ├── DTO/
│   │       │   │   ├── Enum/
│   │       │   │   ├── entities/
│   │       │   │   ├── Repository/
│   │       │   │   ├── resources/
│   │       │   │   ├── services/
│   │       │   │   └── SistemaHospitalarApplication.java
│   │       │   └── resources/
│   │       │       └── application.properties
│   │       └── test/
│   └── src/
│       └── Main.java
├── frontend/
│   ├── healthlink/
│   │   ├── assets/
│   │   ├── css/
│   │   └── html/
│   ├── index.html
│   └── src/
├── DOCUMENTACAO.md
└── README.md
```

### Pastas principais

#### `backend/SistemaHospitalar`

Projeto principal da API.

#### `entities`

Entidades JPA que representam as tabelas do banco.

#### `Repository`

Repositorios Spring Data JPA com consultas padrao e consultas derivadas.

#### `services`

Camada de servicos com listagens e metricas analiticas.

#### `resources`

Controllers REST e endpoints publicos da API.

#### `Enum`

Enums de dominio usados para padronizar status e categorias:

- `StatusConsulta`
- `StatusCirurgia`
- `AtendimentoStatus`
- `ExameStatus`
- `ExameTipo`
- `MedicoSpecialty`
- `StatusSalaCirurgica`

#### `frontend/healthlink/html`

Telas do sistema, incluindo login e dashboard.

#### `frontend/healthlink/css`

Folha de estilos principal do frontend.

#### `frontend/healthlink/assets`

Imagens e arquivos visuais.

---

## 9. Documentacao da API

## Visao geral da API

A API atual expõe apenas rotas `GET`. Ela mistura:

- endpoints de listagem
- endpoints analiticos de contagem
- alguns endpoints ainda prototipados

### Base URL

```text
http://localhost:8080
```

### Formato das respostas

- JSON
- algumas rotas retornam DTOs
- outras retornam entidades diretamente
- algumas rotas retornam apenas `Long`

### Limitacoes atuais

- nao ha autenticacao
- nao ha `POST`, `PUT` ou `DELETE`
- nem todos os modulos usam DTO
- alguns endpoints ainda nao representam o comportamento final do sistema

## Endpoints por modulo

### Usuarios

#### `GET /users`

Lista usuarios em formato DTO.

**Resposta**

```json
[
  {
    "id": 1,
    "nome": "adm1",
    "CPF": 1111111111,
    "email": "adm1@gmail.com",
    "dateBirth": null,
    "address": "rua da macaxeira",
    "number": "2",
    "prontuario": {
      "id": 1,
      "date": null,
      "OBS": "..."
    },
    "exame": []
  }
]
```

**Campos retornados**

- `id`
- `nome`
- `CPF`
- `email`
- `dateBirth`
- `address`
- `number`
- `prontuario`
- `exame`

#### `GET /users/totalPacientes`

Retorna a quantidade total de usuarios cadastrados.

**Resposta**

```json
2
```

**Origem**

- `UserService.totalPacientes()`
- `UserRepository.count()`

---

### Medicos

#### `GET /medicos`

Lista medicos em formato DTO.

**Campos retornados**

- `id`
- `name`
- `CRM`
- `specialty`
- `number`
- `cirurgia`

**Observacoes**

- `specialty` usa enum `MedicoSpecialty`
- as cirurgias sao retornadas em formato resumido

---

### Hospitais

#### `GET /hospitais`

Lista hospitais diretamente como entidade.

**Campos principais**

- `id`
- `name`
- `number`
- `address`
- `users`
- `medicos`

**Observacao**

- esta rota nao usa DTO atualmente

---

### Prontuarios

#### `GET /prontuarios`

Lista prontuarios em formato DTO.

**Campos retornados**

- `id`
- `OBS`
- `date`
- `user`

---

### Consultas

#### `GET /consultas`

Lista consultas como entidade.

**Campos principais**

- `id`
- `status`
- `data`
- `obs`
- `medico`

**Observacoes**

- `status` usa enum `StatusConsulta`
- `data` usa `LocalDate`

#### `GET /consultas/por-dia?data=YYYY-MM-DD`

Retorna a quantidade de consultas em uma data especifica.

**Exemplo**

```text
GET /consultas/por-dia?data=2026-05-12
```

**Resposta**

```json
2
```

**Origem**

- `ConsultaService.totalConsultasPorDia(LocalDate data)`
- `ConsultaRepository.countByData(LocalDate data)`

#### `GET /consultas/por-dia/lista?data=YYYY-MM-DD`

Lista as consultas de uma data especifica.

**Exemplo**

```text
GET /consultas/por-dia/lista?data=2026-05-12
```

**Resposta**

- lista de entidades `Consulta`

**Origem**

- `ConsultaService.buscarPorData(LocalDate data)`
- `ConsultaRepository.findByData(LocalDate data)`

**Uso atual no frontend**

- o dashboard consome essa rota para montar a tabela de consultas do dia

---

### Cirurgias

#### `GET /cirurgias`

Lista cirurgias em formato DTO.

**Campos retornados**

- `id`
- `nome`
- `duracao`
- `dateSurgery`
- `report`
- `medicos`
- `salaCirurgica`

**Observacoes**

- `status` existe na entidade `Cirurgia`, mas nao esta exposto no `CirurgiaDTO`
- `salaCirurgica` esta sendo retornada diretamente

#### `GET /cirurgias/total-agendadas`

Retorna o total de cirurgias com status `AGENDADA`.

**Resposta**

```json
0
```

**Origem**

- `CirurgiasService.totalAgendadas()`
- `CirurgiasRepository.countByStatus(StatusCirurgia.AGENDADA)`

**Uso atual no frontend**

- o dashboard consome essa rota para preencher o KPI de cirurgias agendadas

---

### Exames

#### `GET /exames`

Lista exames em formato DTO.

**Campos retornados**

- `id`
- `date_request`
- `result`
- `tipo`
- `user`
- `medico`
- `status`

**Observacoes**

- `tipo` usa enum `ExameTipo`
- `status` usa enum `ExameStatus`

#### `GET /exames/por-mes?mes=MM&ano=YYYY`

Retorna a quantidade de exames solicitados em um mes especifico.

**Exemplo**

```text
GET /exames/por-mes?mes=5&ano=2026
```

**Resposta**

```json
0
```

**Origem**

- `ExameService.totalExamePorMes(int mes, int ano)`
- `ExameRepository.countByDateRequestBetween(Date inicio, Date fim)`

#### `GET /exames/por-status?status=AGENDADO`

Retorna a quantidade de exames por status.

**Exemplo**

```text
GET /exames/por-status?status=AGENDADO
```

**Resposta**

```json
2
```

**Origem**

- `ExameService.totalPorStatus(ExameStatus status)`
- `ExameRepository.countByExameStatus(ExameStatus status)`

---

### Atendimentos

#### `GET /atendimentos`

Lista atendimentos como entidade.

**Campos principais**

- `id`
- `descricao`
- `diagnosis`
- `service_date`
- `atendimentoStatus`
- `usuario`

**Observacoes**

- `atendimentoStatus` usa enum `AtendimentoStatus`
- agora existe relacionamento `ManyToOne` com `User`

#### `GET /atendimentos/por-status?status=ANDAMENTO`

Retorna a quantidade de atendimentos por status.

**Exemplo**

```text
GET /atendimentos/por-status?status=ANDAMENTO
```

**Resposta**

```json
1
```

**Origem**

- `AtendimentoService.totalPorStatus(AtendimentoStatus status)`
- `AtendimentoRepository.countByAtendimentoStatus(AtendimentoStatus status)`

---

### Salas cirurgicas

#### `GET /sala`

Lista salas cirurgicas diretamente como entidade.

**Campos principais**

- `id`
- `number`
- `status`
- `cirurgias`

**Observacoes**

- `status` usa enum `StatusSalaCirurgica`
- a rota deixou de retornar objeto fixo e agora usa `SalaCirurgicaService.findAll()`

---

### Agendamentos

#### `GET /agendamentos`

Retorna um objeto `Agendamento` vazio.

**Status atual**

- endpoint ainda prototipado
- nao consulta o banco apesar de existir repository e service

---

### Senha de atendimento

#### `GET /senha`

Retorna um objeto `SenhaAtendimento` vazio.

**Status atual**

- endpoint ainda prototipado
- nao consulta o banco apesar de existir repository e service

---

## Rotas usadas pelo frontend atual

O dashboard em `frontend/healthlink/html/index.html` chama:

- `GET /users/totalPacientes`
- `GET /consultas/por-dia?data=YYYY-MM-DD`
- `GET /cirurgias/total-agendadas`
- `GET /consultas/por-dia/lista?data=YYYY-MM-DD`

Essas rotas alimentam:

- KPI total de pacientes
- KPI consultas do dia
- KPI cirurgias agendadas
- KPI fila de espera
- tabela de consultas de hoje

## Oportunidades de melhoria na API

- padronizar todas as respostas em DTO
- criar rotas `POST`, `PUT` e `DELETE`
- adicionar autenticacao
- expor `status` no `CirurgiaDTO`
- revisar enums com construtores inconsistentes
- alinhar nomes de campos entre frontend e backend para reduzir logica de fallback no JavaScript

---

## 10. Banco de Dados

## Visao geral

O banco e relacional e modelado com JPA/Hibernate. As tabelas sao geradas automaticamente a partir das entidades.

## Configuracao atual

- banco ativo: PostgreSQL
- schema recriado a cada execucao com `ddl-auto=create`

## Entidades e tabelas principais

### `tb_user`

Representa usuarios/pacientes.

**Colunas principais**

- `id`
- `nome`
- `CPF`
- `dateBirth`
- `address`
- `number`
- `email`

**Relacionamentos**

- `1:1` com `tb_prontuario`
- `1:N` com `tb_exame`
- `1:N` com `tb_Atendimento`

### `tb_prontuario`

Representa prontuarios.

**Colunas principais**

- `id`
- `date`
- `OBS`
- `user`

### `tb_exame`

Representa exames.

**Colunas principais**

- `id`
- `dateRequest`
- `result`
- `User_id`
- `Medico_id`
- `exameTipo`
- `exameStatus`

### `tb_medico`

Representa medicos.

**Colunas principais**

- `id`
- `name`
- `CRM`
- `specialty`
- `number`
- `Hospital_id`

**Relacionamentos**

- `N:1` com hospital
- `N:N` com cirurgia
- `1:N` com consulta
- `1:N` com exame

### `tb_Consulta`

Representa consultas.

**Colunas principais**

- `id`
- `status`
- `data`
- `obs`
- `medico_id`

### `tb_Cirurgias`

Representa cirurgias.

**Colunas principais**

- `id`
- `nome`
- `duracao`
- `dateSurgery`
- `report`
- `status`
- `SalaCirurgica_id`

### `medico_cirurgia`

Tabela de juncao entre medicos e cirurgias.

### `tb_sala`

Representa salas cirurgicas.

**Colunas principais**

- `id`
- `number`
- `status`

### `tb_Atendimento`

Representa atendimentos.

**Colunas principais**

- `id`
- `descricao`
- `diagnosis`
- `service_date`
- `atendimentoStatus`
- `usuario_id`

### `tb_hospital`

Representa hospitais.

### `hospital_user`

Tabela de juncao entre hospital e usuario.

### `tb_agendamento`

Representa agendamentos.

### `tb_senhaAtendimento`

Representa senhas de atendimento.

## Dados iniciais

Ao subir a aplicacao com perfil `test`, a classe `TestConfig` insere dados de:

- usuarios
- medicos
- hospitais
- prontuarios
- consultas
- cirurgias
- exames
- atendimentos
- salas cirurgicas
- senhas
- agendamentos

---

## 11. Explicacao das Principais Funcoes do Codigo

## Backend

### `SistemaHospitalarApplication.main`

Inicializa o contexto Spring Boot e sobe a API.

### `TestConfig.run`

Executa automaticamente no perfil `test` e popula o banco com dados iniciais para testes e demonstracao.

### Servicos principais

#### `UserService.totalPacientes`

Conta o total de usuarios no banco usando `repository.count()`.

#### `ConsultaService.totalConsultasPorDia`

Conta consultas de uma data especifica.

#### `ConsultaService.buscarPorData`

Retorna a lista de consultas de uma data especifica.

#### `CirurgiasService.totalAgendadas`

Conta cirurgias com status `AGENDADA`.

#### `AtendimentoService.totalPorStatus`

Conta atendimentos por status.

#### `ExameService.totalExamePorMes`

Conta exames entre o primeiro e o ultimo dia do mes informado.

#### `ExameService.totalPorStatus`

Conta exames por status.

### Repositorios com consultas derivadas importantes

- `UserRepository.count()`
- `ConsultaRepository.countByData(LocalDate data)`
- `ConsultaRepository.findByData(LocalDate data)`
- `CirurgiasRepository.countByStatus(StatusCirurgia status)`
- `AtendimentoRepository.countByAtendimentoStatus(AtendimentoStatus status)`
- `ExameRepository.countByDateRequestBetween(Date inicio, Date fim)`
- `ExameRepository.countByExameStatus(ExameStatus status)`

### Controllers mais importantes para o estado atual

- `UserResources`
- `ConsultaResources`
- `CirurgiasResources`
- `AtendimentoResources`
- `ExameResources`

Esses controllers concentram as rotas mais relevantes para o dashboard e para as metricas atuais do sistema.

## Frontend

### `frontend/healthlink/html/login.html`

Implementa:

- validacao simples de campos
- submit por clique
- submit ao pressionar Enter
- redirecionamento para o dashboard

### `frontend/healthlink/html/index.html`

Implementa:

- carga automatica do dashboard no `DOMContentLoaded`
- chamadas `fetch` para a API
- atualizacao dinamica dos KPIs
- renderizacao da tabela de consultas do dia
- fallback quando a API nao responde

### `frontend/healthlink/css/style.css`

Centraliza:

- layout principal
- sidebar
- header
- cards
- tabelas
- estilos comuns entre modulos

---

## Conclusao

O projeto evoluiu de um prototipo visual para uma base mais consistente de sistema hospitalar com API de leitura e metricas. O ponto mais forte no momento esta no backend, que ja oferece rotas uteis para alimentar o dashboard e organizar o dominio com enums, relacionamentos e consultas analiticas. O proximo passo natural e padronizar os retornos da API, completar os endpoints ainda prototipados e adicionar operacoes de escrita e autenticacao.
