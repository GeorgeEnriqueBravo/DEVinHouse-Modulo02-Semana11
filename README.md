# Bem vindo à DEVinHouse <img width="180px" alt="Philips" src="ExerciciosM02S11/images/logo-phil.png"/>
## Módulo 02 - Semana 11

Repositório criado para a elaboração dos 9 exercícios referentes a essa semana. <br>

Para visualizar os exercícios, <a href="https://github.com/GeorgeEnriqueBravo/DEVinHouse-Modulo02-Semana11/archive/refs/heads/main.zip" target="_blank">
    clique aqui
</a>
para baixa-los. <br>

Após o download, abra a pasta "ExerciciosM02S11" utilizando o software `IntelliJ`. Para baixar a última versão grátis do IntelliJ 
<a href="https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC" target="_blank">
    clique aqui
</a>.
  
---

# Lista de exercícios <img width="75px" alt="Philips" src="ExerciciosM02S11/images/lista.png"/>
### [M2S11] Ex 1 - Criação de Entidades

Criar as Entidades:

- Quiz - id, nome, descricao
- Perguntas - id, titulo, texto, id_quiz
- Resposta - id, texto, id_pergunta

### [M2S11] Ex 2 - Criar os Repositórios para as Entidades

Criar os Repositórios para as Entidades.

### [M2S11] Ex 3 - Endpoints GET

Crie endpoints de método GET que realizem as listagens:

- Todas as Perguntas
- Todos os Quizzes
- Todas as Respostas

Devemos ter também endpoits GET para retornar: (utilize path parameters)

- A Pergunta por ID
- O Quizzes por ID
- A Respostas por ID

### [M2S11] Ex 4 - Novas funcionalidades

Crie endpoints para realizar as seguintes listagens (utilizar query parameters):

- Listar Perguntas por Quiz
- Listar Respostas por Pergunta

### [M2S11] Ex 5 - Endpoints POST

Crie os endpoints do método POST que realizem as tarefas:

- Criar nova Pergunta
- Criar nova Resposta
- Criar novo Quiz

### [M2S11] Ex 6 - Endpoints PUT

Crie os endpoints do método PUT que realizem as tarefas:

- Atualizar uma Pergunta
- Atualizar uma Resposta
- Atualizar um Quiz

### [M2S11] Ex 7 - Endpoints DELETE

Crie os endpoints do método DELETE que realizem as tarefas: (utilize path variables)

- Deletar uma Pergunta por ID
- Deletar uma Resposta por ID
- Deletar um Quiz por ID

### [M2S11] Ex 8 - Crie uma classe para tratar exceções

Essa classe deve ter tratamento para erros HTTP do tipo 500, 400 e 404,
cada um desses deve ter uma mensagem que fale o status do erro e a causa do erro.

### [M2S11] Ex 9 - Organize o código em Controller-Service-Repository

Agora que você já conseguiu criar a API, está na hora de organizar, separando a lógica em classes Service.

---

# O que é DEVinHouse?
DEVinhouse é uma jornada de aceleração da carreira com: grade curricular direcionada, professores do mercado, prática constante, interação frequente com as houses parceiras de cada turma, simulação do dia-a-dia DEV e vagas exclusivas que são abertas pelas Houses durante a jornada.

No DEVinHouse você vira um desenvolvedor Fullstack em 9 meses, ao longo de 900 horas de conteúdo, divididas em três módulos de 3 meses cada, com intervalo de uma semana entre cada um. Aproximadamente 25 horas de dedicação por semana entre aulas, atividades e vivências.

__1º módulo:__ Front-End – JavaScript e Angular <br/>
__2º módulo:__ Back-End – Java, Spring e SQL <br/>
__3º módulo:__ Full-Stack – Scrum, DevOps, Clean Code e Design Patterns <br/>
__Ferramentas__ – GitHub, Trello e Slack

---

# Tecnologias Utilizadas <img width="35px" alt="🌐" src="ExerciciosM02S11/images/tag.gif"/>
Nos exercícios dessa semana foram utilizadas as seguintes tecnologias:
<div style="display: inline_block">
    <img align="center" alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
    <img align="center" alt="Spring" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
    <img align="center" alt="Intellij" src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
    <img align="center" alt="Oracle" src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=black"/>
    <img align="center" alt="Trello" src="https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white"/>
    <img align="center" alt="GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/>
</div>
