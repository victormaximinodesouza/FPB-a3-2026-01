# HealthLink - Sistema de Gestão Hospitalar

## Descrição breve

O HealthLink é um projeto de sistema de gestão hospitalar com frontend em HTML/CSS e backend em Java com Spring Boot. Ele organiza módulos como usuários, médicos, hospitais, prontuários, exames, cirurgias, atendimentos, agendamentos, fila de espera, relatórios e doação de sangue.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- H2 Database
- Maven
- HTML5
- CSS3
- Font Awesome

## Como rodar o projeto

### 1. Pré-requisitos

- JDK 21
- PostgreSQL
- Git

### 2. Clonar o repositório

```bash
git clone <url-do-repositorio>
cd FPB-a3-2026-01
```

### 3. Configurar o banco

Crie o banco `hospital` no PostgreSQL e ajuste as credenciais em:

`backend/SistemaHospitalar/src/main/resources/application.properties`

### 4. Executar o backend

```bash
cd backend/SistemaHospitalar
./mvnw spring-boot:run
```

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

### 5. Abrir o frontend

Abra no navegador um dos arquivos da pasta:

`frontend/src/a3/`

Sugestão:

- `login.html`
- `index.html`

## Estrutura básica

- `backend/` - código da API Spring Boot
- `backend/SistemaHospitalar/src/main/java/.../entities` - entidades do banco
- `backend/SistemaHospitalar/src/main/java/.../Repository` - repositórios JPA
- `backend/SistemaHospitalar/src/main/java/.../services` - regras e consultas
- `backend/SistemaHospitalar/src/main/java/.../resources` - rotas da API
- `frontend/src/a3/` - telas HTML/CSS do sistema
- `DOCUMENTACAO.md` - documentação completa do projeto

## Link para documentação completa

Veja a documentação detalhada em [DOCUMENTACAO.md](./DOCUMENTACAO.md).
