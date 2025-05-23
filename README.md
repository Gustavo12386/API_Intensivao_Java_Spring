# API_Evento_Intensivão_Java_Spirng

## 💻 Sobre o Projeto
- Esse projeto se trata de uma API realizada no evento Intensivão Java Spring do instrutor Nélio Alves da instituição de ensino DevSuperior.
Essa API têm o objetivo de criar uma lista de jogos com nome uma imagem e uma descrição separado por categorias e por uma determinada ordem
que pode ser customizada por um determinado usuário

## ✨ Tecnologias Utilizadas
- Java 21
- SpringBoot 3.4.2
- Spring Dev Tools Suite 4(IDE)
- Maven
- H2 Database
- PostgreSQL
- Docker/Docker Compose

## 🗒️ Roteiro
- [ ] Criação da API
- [ ] Criação do banco de dados em memória para testes com H2 Database
- [ ] Criação do banco de dados definitivo com PostgreSQL através de um container com Docker e Docker Compose

## 🚀 Como Executar
- Clone o repositório
- Abra em qualquer IDE Java
- Execute o projeto Spring Boot

## Diagrama UML do projeto
![dslist-model](https://github.com/user-attachments/assets/e75cf69e-9385-40f7-868b-419efbdd38d8)

## Imagens do JSON geradas pelos endpoints
- endpoint games findAll:  `localhost:8080/games`
![findAll](https://github.com/user-attachments/assets/9e4b61a3-7323-4b40-ba10-3cc95a680543)
- endpoint games findById:  `localhost:8080/games/id`
![findById](https://github.com/user-attachments/assets/2928e0a9-198d-4258-8273-8e369e1797f4)
- endpoint lists findAll:  `localhost:8080/lists`
![findAll lists](https://github.com/user-attachments/assets/4c39ef26-1fa8-4ed2-babd-0a1f413e02f4)
- endpoint lists findById:  `localhost:8080/lists/id/games`
![findById lists](https://github.com/user-attachments/assets/d5880ac7-69d5-45f1-b0b7-cf299e4e7a40)
- endpoint de mudança de posição de um jogo: `localhost:8080/lists/id/replacement`
![endpoint mudança de posição](https://github.com/user-attachments/assets/5c8b47a3-4167-42a0-a356-3a31345fb0b3)
- antes da requisição do endpoint de mudança de posição
- ![Captura de tela de 2025-05-22 16-05-06](https://github.com/user-attachments/assets/33be7939-2dbd-4a5e-8b97-adb14cb09371)
- após a requsição do endpoint de mudança de posição
- ![Captura de tela de 2025-05-22 16-29-11](https://github.com/user-attachments/assets/25dfaf43-a80d-4d93-94c1-c2ef6a91fa89)

## Autor 
- Gustavo Calderaro 
