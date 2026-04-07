# Documentação do Projeto

## 1. Descrição do Projeto

### Visão geral

O projeto implementa um sistema de gestão hospitalar chamado **HealthLink**, com foco em centralizar operações administrativas e assistenciais de um ambiente hospitalar. A solução está dividida em dois blocos:

- **Frontend**: conjunto de telas HTML/CSS para navegação visual do sistema.
- **Backend**: API REST em Java com Spring Boot para modelar entidades hospitalares, expor dados e acessar banco relacional.

### O que o sistema faz

O sistema foi concebido para apoiar a gestão de:

- usuários e pacientes
- médicos
- hospitais
- prontuários
- exames
- consultas
- atendimentos
- agendamentos
- fila de espera
- cirurgias
- salas cirúrgicas
- senhas de atendimento
- relatórios gerenciais
- doação de sangue e controle visual de estoque

### Problema que resolve

O projeto busca resolver o problema de fragmentação de informações hospitalares, organizando em um único sistema visual e de dados os fluxos mais comuns de uma operação clínica e administrativa.

### Objetivo do projeto

O objetivo principal é construir uma base para um sistema distribuído de gestão hospitalar, com:

- padronização de dados clínicos e administrativos
- visualização centralizada de indicadores operacionais
- organização de rotinas hospitalares por módulos
- suporte a futuras integrações entre interface e API

### Estado atual do projeto

Atualmente, o projeto está em um estágio intermediário entre **protótipo funcional de interface** e **API backend em desenvolvimento**:

- o frontend já possui várias telas prontas
- o backend já possui estrutura completa em camadas
- alguns endpoints retornam dados persistidos do banco
- alguns endpoints ainda retornam objetos fixos de teste
- o frontend ainda não consome a API

---

## 2. Requisitos Funcionais

Com base na estrutura do código e nas telas existentes, os requisitos funcionais do sistema são:

### Autenticação e acesso

- permitir acesso à tela de login
- permitir preenchimento de e-mail e senha
- permitir saída do sistema

### Dashboard

- exibir visão geral do sistema hospitalar
- apresentar indicadores resumidos de pacientes, consultas, cirurgias e tempo médio de espera
- apresentar tabelas e painéis de acompanhamento

### Usuários e pacientes

- listar usuários cadastrados
- exibir nome, e-mail, CPF e dados resumidos
- visualizar prontuário associado ao usuário
- visualizar exames vinculados ao usuário
- permitir gestão visual de contas e permissões da equipe

### Médicos

- listar médicos cadastrados
- exibir CRM, especialidade, telefone e cirurgias relacionadas
- associar médicos a hospitais
- associar médicos a cirurgias

### Hospitais

- listar hospitais cadastrados
- exibir dados básicos da unidade
- associar usuários a hospitais
- associar médicos a hospitais

### Prontuários

- listar prontuários
- relacionar prontuário a um usuário
- exibir observações e data do registro

### Exames

- listar exames
- visualizar exames por paciente
- registrar data de solicitação
- registrar data de resultado
- associar exames a usuários
- exibir tela de solicitação e acompanhamento de exames

### Consultas

- representar consultas no backend
- exibir observações da consulta
- disponibilizar rota de consulta

### Atendimentos

- representar atendimentos clínicos
- registrar diagnóstico e data de atendimento
- exibir histórico resumido de atendimentos
- permitir ações visuais como ver prontuário, adicionar anotações, prescrever e solicitar exame

### Agendamentos

- representar agendamentos no backend
- permitir visualmente o cadastro de novos agendamentos
- listar compromissos por paciente, médico, especialidade, data, horário e status

### Fila de espera

- exibir fila atual
- identificar prioridade do paciente
- mostrar tempo de espera
- mostrar status da fila
- permitir ações visuais de chamar e pular paciente

### Cirurgias

- listar cirurgias
- exibir data e relatório cirúrgico
- vincular médicos às cirurgias
- apresentar agenda cirúrgica na interface
- exibir sala, equipe, duração e prioridade

### Salas cirúrgicas

- representar salas cirúrgicas
- exibir número da sala
- disponibilizar rota para consulta

### Senha de atendimento

- representar senha de atendimento
- exibir senha gerada
- disponibilizar rota para consulta

### Doação de sangue

- exibir painel visual de estoque por tipo sanguíneo
- exibir solicitações de sangue
- exibir histórico de doações recentes
- sinalizar níveis críticos de estoque

### Relatórios

- exibir indicadores gerenciais
- apresentar área de relatórios gerados
- disponibilizar ações visuais para gerar e baixar relatórios

### API

- disponibilizar rotas REST para consulta de dados hospitalares
- retornar entidades ou DTOs em formato JSON

---

## 3. Requisitos Não Funcionais

### Segurança

- o sistema deve restringir acesso a funcionalidades administrativas por autenticação
- dados sensíveis de pacientes devem ser protegidos
- credenciais de banco não devem ficar expostas em produção
- a API deve evoluir para uso de autenticação e autorização
- dados clínicos devem ser transmitidos e armazenados com cuidado

### Desempenho

- consultas simples devem responder rapidamente
- listagens devem ser eficientes para volumes moderados de dados
- a camada de DTO deve evitar respostas excessivamente pesadas
- o frontend deve carregar rapidamente por ser estático

### Usabilidade

- a interface deve ser clara para perfis administrativos e clínicos
- a navegação lateral deve manter consistência entre telas
- filtros, tabelas e cartões devem facilitar leitura dos dados
- o sistema deve ser compreensível mesmo para usuários não técnicos

### Confiabilidade

- a API deve manter consistência entre entidades e banco de dados
- relacionamentos entre usuários, prontuários, exames, médicos e cirurgias devem permanecer íntegros
- o sistema deve lidar com falhas de conexão com banco de forma controlada
- testes automatizados devem evoluir para validar comportamento real

### Escalabilidade

- a arquitetura em camadas favorece crescimento do backend
- o uso de Spring Data JPA facilita expansão de consultas e regras de negócio
- o sistema pode crescer por módulos
- a interface pode ser evoluída para integração dinâmica com a API

### Manutenibilidade

- separação entre `entities`, `repositories`, `services`, `resources` e `DTO` facilita manutenção
- o uso de CSS único centraliza identidade visual
- a existência de controllers parcialmente prototipados exige padronização futura

---

## 4. Tecnologias Utilizadas

### Linguagens

- Java 21
- HTML5
- CSS3

### Frameworks e bibliotecas

- Spring Boot 4.0.3
- Spring Web
- Spring Data JPA
- JUnit / Spring Boot Test
- Maven Wrapper
- Font Awesome
- Google Fonts

### Banco de dados

- PostgreSQL
- H2 Database

### Ferramentas e estrutura

- Maven
- IntelliJ IDEA
- JPA / Hibernate
- JSON com serialização Jackson

### Observações

- o PostgreSQL é o banco configurado para execução
- o H2 está presente como dependência, mas não está configurado como banco ativo

---

## 5. Pré-requisitos

Para executar o projeto adequadamente, é necessário ter instalado:

### Backend

- **JDK 21** ou compatível com o `java.version=21`
- **Maven** ou uso do wrapper `mvnw`
- **PostgreSQL**

### Frontend

- navegador web moderno

### Ferramentas opcionais

- Git
- IntelliJ IDEA ou outra IDE Java
- cliente de API como Postman ou Insomnia

### Banco de dados esperado

O backend está configurado para acessar:

- host: `localhost`
- porta: `5432`
- banco: `hospital`
- usuário: `postgres`
- senha: `1234`

Se esses dados forem diferentes no ambiente local, o arquivo `application.properties` precisa ser ajustado.

---

## 6. Como Instalar o Projeto

### 1. Clonar o repositório

```bash
git clone <url-do-repositorio>
cd FPB-a3-2026-01
```

### 2. Preparar o PostgreSQL

Criar um banco com o nome:

```sql
CREATE DATABASE hospital;
```

Garantir também que:

- o PostgreSQL esteja em execução
- o usuário e senha do arquivo `application.properties` estejam corretos

### 3. Verificar o Java

Confirmar que o ambiente possui **JDK**, não apenas JRE:

```bash
java -version
javac -version
```

### 4. Conferir a estrutura principal

- backend em `backend/SistemaHospitalar`
- frontend em `frontend/src/a3`

---

## 7. Como Executar o Projeto

## Backend

No diretório do backend:

```bash
cd backend/SistemaHospitalar
./mvnw spring-boot:run
```

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

### Comportamento ao iniciar

- o Spring Boot sobe a aplicação
- o perfil ativo é `test`
- o schema é recriado porque `spring.jpa.hibernate.ddl-auto=create`
- dados iniciais são inseridos automaticamente pela classe `TestConfig`

### Observação importante

Sem **JDK** completo, o projeto não compila. Em análise local do ambiente, a execução falhou por ausência de compilador Java, o que indica execução sobre JRE.

## Frontend

O frontend é estático. Para visualizar:

1. abrir a pasta `frontend/src/a3`
2. abrir `login.html` ou `index.html` no navegador

Alternativamente, usar uma extensão de servidor local ou um servidor HTTP simples, embora isso não seja obrigatório para exibir as páginas.

### Observação importante

O frontend atual não consome a API backend. As telas funcionam como interface visual estática.

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
│   ├── index.html
│   ├── src/
│   │   ├── Main.java
│   │   └── a3/
│   │       ├── index.html
│   │       ├── login.html
│   │       ├── style.css
│   │       ├── login-style.css
│   │       ├── agendamentos.html
│   │       ├── atendimento.html
│   │       ├── filadeespera.html
│   │       ├── cirurgias.html
│   │       ├── exames.html
│   │       ├── doacaodesangue.html
│   │       ├── relatorios.html
│   │       ├── usuarios.html
│   │       └── imagens/
│   └── frontend.iml
└── DOCUMENTACAO.md
```

### Explicação das principais pastas

#### `backend/SistemaHospitalar`

Projeto Maven principal do backend.

#### `src/main/java/com/a3_20261/SistemaHospitalar/entities`

Contém as entidades JPA que representam as tabelas do banco.

#### `src/main/java/com/a3_20261/SistemaHospitalar/Repository`

Contém os repositórios Spring Data JPA. Todos estendem `JpaRepository`.

#### `src/main/java/com/a3_20261/SistemaHospitalar/services`

Contém a camada de serviços. No estado atual, a maioria encapsula apenas métodos `findAll()`.

#### `src/main/java/com/a3_20261/SistemaHospitalar/resources`

Contém os controllers REST da aplicação.

#### `src/main/java/com/a3_20261/SistemaHospitalar/DTO`

Contém DTOs completos e DTOs resumidos usados nas respostas da API.

#### `src/main/java/com/a3_20261/SistemaHospitalar/config`

Contém a configuração de carga inicial de dados de teste.

#### `src/main/resources/application.properties`

Arquivo de configuração da aplicação, banco e JPA.

#### `frontend/src/a3`

Contém as telas HTML/CSS do sistema.

### Arquivos principais

- `pom.xml`: define dependências, plugins e versão Java
- `SistemaHospitalarApplication.java`: ponto de entrada da aplicação Spring Boot
- `TestConfig.java`: popula dados iniciais
- `style.css`: folha de estilos principal do frontend
- `login.html`: tela de autenticação visual
- `index.html`: dashboard principal

### Arquivos auxiliares não centrais

- `backend/src/Main.java`: arquivo padrão da IDE, não participa do backend Spring Boot
- `frontend/src/Main.java`: arquivo padrão da IDE, não participa do frontend HTML
- `frontend/index.html`: arquivo vazio no estado atual

---

## 9. Documentação das Rotas

## Resumo

A API atual expõe apenas rotas `GET`. Não foram encontrados `POST`, `PUT` ou `DELETE`.

## Base da API

Quando o backend estiver em execução local com configuração padrão, a base será:

```text
http://localhost:8080
```

## Rotas disponíveis

### 1. `GET /users`

Lista usuários com informações resumidas e relacionamentos relevantes.

**Recebe**

- nada

**Retorna**

- lista de `UserDTO`

**Campos principais**

- `id`
- `nome`
- `CPF`
- `dateBirth`
- `address`
- `email`
- `number`
- `prontuario`
- `exame`

### 2. `GET /medicos`

Lista médicos cadastrados.

**Recebe**

- nada

**Retorna**

- lista de `MedicoDTO`

**Campos principais**

- `id`
- `name`
- `CRM`
- `specialty`
- `number`
- `cirurgia`

### 3. `GET /hospitais`

Lista hospitais cadastrados.

**Recebe**

- nada

**Retorna**

- lista de entidades `Hospital`

**Observação**

Essa rota retorna entidade diretamente, não DTO.

### 4. `GET /cirurgias`

Lista cirurgias cadastradas.

**Recebe**

- nada

**Retorna**

- lista de `CirurgiaDTO`

**Campos principais**

- `id`
- `dateSurgery`
- `report`

### 5. `GET /exames`

Lista exames cadastrados.

**Recebe**

- nada

**Retorna**

- lista de `ExameDTO`

**Campos principais**

- `id`
- `date_request`
- `result`
- `user`

### 6. `GET /prontuarios`

Lista prontuários cadastrados.

**Recebe**

- nada

**Retorna**

- lista de `ProntuarioDTO`

**Campos principais**

- `id`
- `date`
- `OBS`
- `user`

### 7. `GET /consultas`

Retorna um objeto de consulta fixo.

**Recebe**

- nada

**Retorna**

- objeto `Consulta`

**Observação**

Não lê dados do banco. Atualmente retorna um exemplo em memória.

### 8. `GET /atendimentos`

Retorna um objeto de atendimento fixo.

**Recebe**

- nada

**Retorna**

- objeto `Atendimento`

**Observação**

Não lê dados do banco. Atualmente retorna um exemplo em memória.

### 9. `GET /agendamentos`

Retorna um objeto de agendamento vazio.

**Recebe**

- nada

**Retorna**

- objeto `Agendamento`

**Observação**

Não lê dados do banco.

### 10. `GET /sala`

Retorna um objeto fixo de sala cirúrgica.

**Recebe**

- nada

**Retorna**

- objeto `SalaCirurgica`

**Observação**

Atualmente não consulta repositório.

### 11. `GET /senha`

Retorna um objeto de senha de atendimento.

**Recebe**

- nada

**Retorna**

- objeto `SenhaAtendimento`

**Observação**

Atualmente não consulta repositório e retorna objeto sem preenchimento significativo.

## Limitações atuais das rotas

- ausência de autenticação
- ausência de operações de escrita
- falta de padronização entre uso de DTO e entidade
- alguns módulos usam service e outros acessam repository diretamente
- alguns endpoints são apenas protótipos de demonstração

---

## 10. Banco de Dados

## Visão geral

O banco é relacional e modelado com JPA/Hibernate. As tabelas são geradas automaticamente a partir das entidades.

## Configuração atual

- banco ativo: PostgreSQL
- schema recriado a cada execução com `ddl-auto=create`

## Tabelas e colunas principais

### `tb_user`

Representa usuários/pacientes.

**Colunas**

- `id` - chave primária
- `nome`
- `CPF`
- `dateBirth`
- `address`
- `number`
- `email`

**Relacionamentos**

- `1:1` com `tb_prontuario`
- `1:N` com `tb_exame`

### `tb_prontuario`

Representa prontuários.

**Colunas**

- `id` - chave primária
- `date`
- `OBS`
- referência para `user`

**Relacionamentos**

- `1:1` com `tb_user`

### `tb_exame`

Representa exames.

**Colunas**

- `id` - chave primária
- `Date_request`
- `result`
- `User_id`

**Relacionamentos**

- `N:1` com `tb_user`

### `tb_medico`

Representa médicos.

**Colunas**

- `id` - chave primária
- `name`
- `CRM`
- `specialty`
- `number`
- `Hospital_id`

**Relacionamentos**

- `N:1` com `tb_hospital`
- `N:N` com `tb_Cirurgias`

### `tb_Cirurgias`

Representa cirurgias.

**Colunas**

- `id` - chave primária
- `dateSurgery`
- `report`

**Relacionamentos**

- `N:N` com `tb_medico`

### `medico_cirurgia`

Tabela de junção entre médicos e cirurgias.

**Colunas**

- `medico_id`
- `cirurgia_id`

### `tb_hospital`

Representa hospitais.

**Colunas**

- `id` - chave primária
- `name`
- `number`
- `address`

**Relacionamentos**

- `N:N` com `tb_user`
- `1:N` com `tb_medico`

### `hospital_user`

Tabela de junção entre hospitais e usuários.

**Colunas**

- `hospital_id`
- `user_id`

### `tb_agendamento`

Representa agendamentos.

**Colunas**

- `id` - chave primária
- `data`

### `tb_Atendimento`

Representa atendimentos.

**Colunas**

- `id` - chave primária
- `diagnosis`
- `service_date`

### `tb_Consulta`

Representa consultas.

**Colunas**

- `id` - chave primária
- `obs`

### `tb_sala`

Representa salas cirúrgicas.

**Colunas**

- `id` - chave primária
- `number`

### `tb_senhaAtendimento`

Representa senhas de atendimento.

**Colunas**

- `id` - chave primária
- `senha`

## Relacionamentos principais

- um usuário pode ter um prontuário
- um usuário pode possuir vários exames
- um hospital pode ter vários médicos
- um hospital pode estar relacionado a vários usuários
- um médico pode participar de várias cirurgias
- uma cirurgia pode possuir vários médicos

## Dados iniciais

Ao subir a aplicação com perfil `test`, a classe `TestConfig` insere:

- médicos
- cirurgias
- atendimentos
- consultas
- exames
- salas cirúrgicas
- usuários
- prontuários
- hospitais
- senhas de atendimento
- agendamentos

---

## 11. Explicação das Principais Funções do Código

## Backend

### `SistemaHospitalarApplication.main`

Função principal do backend. Inicializa o contexto Spring Boot e sobe a aplicação.

### `TestConfig.run`

Executada automaticamente no perfil `test`. Sua função é popular o banco com dados de exemplo para facilitar testes e visualização inicial dos módulos.

### Métodos `findAll()` dos services

Presentes em praticamente todos os serviços.

**Função**

- chamar o repositório correspondente
- buscar todos os registros da entidade

**Papel arquitetural**

- separar o controller da camada de persistência
- preparar o código para futura inclusão de regras de negócio

### Controllers `findAll()` em `resources`

Cada controller expõe uma rota REST.

Exemplos:

- `UserResources.findAll()`
- `MedicoResources.findAll()`
- `CirurgiasResources.findAll()`
- `ExameResources.findAll()`
- `ProntuarioResources.findAll()`

**Função**

- receber a requisição HTTP
- consultar service ou repository
- converter entidade em DTO quando necessário
- devolver resposta JSON

### Construtores de DTO

Os construtores das classes DTO são fundamentais para o backend.

**Função**

- transformar entidades JPA em objetos de saída
- controlar o que será exposto na API
- resumir relacionamentos aninhados

Exemplos importantes:

- `UserDTO(User entity)`
- `MedicoDTO(Medico entity)`
- `ProntuarioDTO(Prontuario entity)`
- `ExameDTO(Exame entity)`
- `HospitalDTO(Hospital entity)`

### Repositórios Spring Data JPA

Os repositórios são interfaces como:

- `UserRepository`
- `MedicoRepository`
- `HospitalRepository`
- `ExameRepository`

**Função**

- fornecer operações de persistência
- permitir uso de `findAll()`, `save()`, `findById()` e demais operações do `JpaRepository`

## Frontend

O frontend não possui funções JavaScript implementadas. Seu comportamento está concentrado em:

- organização visual das páginas HTML
- navegação lateral
- formulários visuais
- tabelas e indicadores estáticos

### Arquivos HTML principais

#### `login.html`

Responsável por exibir a tela de login com campos de e-mail e senha.

#### `index.html`

Responsável por exibir o dashboard inicial com visão geral do sistema.

#### `agendamentos.html`

Mostra busca, filtros, tabela e ação para novo agendamento.

#### `filadeespera.html`

Mostra pacientes em espera, prioridade, tempo e ações de chamada.

#### `atendimento.html`

Mostra cartões de atendimentos, diagnósticos e ações clínicas.

#### `cirurgias.html`

Mostra agenda cirúrgica, status, equipe e detalhes operatórios.

#### `exames.html`

Mostra catálogo e acompanhamento de exames.

#### `doacaodesangue.html`

Mostra visão de estoque, solicitações e histórico de doações.

#### `relatorios.html`

Mostra indicadores analíticos e relatórios disponíveis.

#### `usuarios.html`

Mostra gestão de usuários e permissões.

### `style.css`

Arquivo responsável por:

- layout principal com sidebar e header
- estilos de cartões
- estilos de tabelas
- estilos específicos para módulos
- identidade visual do sistema

## Considerações finais sobre o código

### Pontos fortes

- boa separação em camadas no backend
- modelagem inicial coerente para domínio hospitalar
- variedade de módulos funcionais já prevista
- frontend visualmente avançado para protótipo

### Pontos que ainda precisam evoluir

- integração real entre frontend e backend
- implementação de rotas de criação, edição e exclusão
- autenticação e controle de acesso
- padronização dos endpoints
- melhoria de codificação de caracteres em alguns arquivos
- ampliação dos testes automatizados

---

## Conclusão

O projeto já possui uma base sólida para um sistema de gestão hospitalar modular. O backend apresenta arquitetura apropriada para crescimento, enquanto o frontend já cobre os principais módulos da operação hospitalar em nível de interface. O próximo passo natural é conectar as telas à API, padronizar os endpoints e evoluir os fluxos atualmente prototipados para funcionalidades completas.
