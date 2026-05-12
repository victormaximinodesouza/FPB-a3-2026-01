# HealthLink - Sistema de Gestao Hospitalar

## Descricao breve

O HealthLink e um sistema de gestao hospitalar com frontend em HTML/CSS/JavaScript e backend em Java com Spring Boot. O projeto organiza modulos de usuarios, medicos, hospitais, prontuarios, exames, consultas, cirurgias, atendimentos, agendamentos, fila de espera, relatorios e doacao de sangue.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven Wrapper
- HTML5
- CSS3
- JavaScript
- Font Awesome

## Como rodar o projeto

### 1. Pre-requisitos

- JDK 21
- PostgreSQL
- Git

### 2. Clonar o repositorio

```bash
git clone <url-do-repositorio>
cd FPB-a3-2026-01
```

### 3. Configurar o banco

Crie o banco `hospital` no PostgreSQL e confira as credenciais em:

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

Abra no navegador:

- `frontend/healthlink/html/login.html`
- `frontend/healthlink/html/index.html`

Observacao:

- o dashboard ja consome alguns endpoints reais da API
- o login atual faz validacao visual simples e redireciona para o dashboard

## Estrutura basica

- `backend/` - codigo da API Spring Boot
- `backend/SistemaHospitalar/src/main/java/.../entities` - entidades do banco
- `backend/SistemaHospitalar/src/main/java/.../Enum` - enums de status e dominio
- `backend/SistemaHospitalar/src/main/java/.../Repository` - repositorios JPA
- `backend/SistemaHospitalar/src/main/java/.../services` - servicos e regras de consulta
- `backend/SistemaHospitalar/src/main/java/.../resources` - rotas da API
- `frontend/healthlink/html/` - telas do sistema
- `frontend/healthlink/css/` - estilos
- `frontend/healthlink/assets/` - imagens e arquivos visuais
- `DOCUMENTACAO.md` - documentacao completa do projeto

## Link para documentacao completa

Veja a documentacao detalhada em [DOCUMENTACAO.md](./DOCUMENTACAO.md).
