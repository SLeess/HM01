# Sistema de Gerenciamento de Barbearia (HM01)

## Descrição

Este é um sistema de desktop para gerenciamento de uma barbearia ou salão de beleza, desenvolvido em Java com uma interface gráfica Swing. O sistema permite o cadastro e a gestão de clientes, funcionários, serviços e agendamentos.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

*   **Login:** Acesso ao sistema através de uma tela de login.
*   **Gestão de Clientes:**
    *   Cadastrar novos clientes (nome, sobrenome, telefone, email).
    *   Listar, atualizar e remover clientes existentes.
    *   Pesquisar clientes por diferentes critérios.
*   **Gestão de Funcionários:**
    *   Cadastrar novos funcionários (nome, CPF).
    *   Listar, atualizar e remover funcionários.
*   **Gestão de Serviços:**
    *   Cadastrar novos serviços (nome, descrição, preço).
    *   Listar, atualizar e remover serviços.
*   **Gestão de Agendamentos:**
    *   Marcar novos agendamentos para clientes, associando serviços e funcionários.
    *   Visualizar agendamentos.
    *   Marcar agendamentos como concluídos e pagos.

## Tecnologias Utilizadas

*   **Linguagem:** Java
*   **Interface Gráfica:** Swing
*   **Banco de Dados:** MySQL
*   **Build:** Apache Ant (integrado com NetBeans)

## Configuração do Banco de Dados

O sistema requer um banco de dados MySQL para funcionar.

1.  **Crie o Banco de Dados:**
    Crie um novo banco de dados (schema) com o nome `HM01`.

2.  **Crie as Tabelas:**
    Execute o script SQL abaixo para criar todas as tabelas necessárias:

    ```sql
    CREATE TABLE Cliente (
        idCliente SMALLINT(5) PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(20) NOT NULL,
        sobrenome VARCHAR(50) NOT NULL,
        telefone VARCHAR(15) NULL,
        email VARCHAR(100) NULL
    );

    CREATE TABLE Funcionario (
        CPF CHAR(11) PRIMARY KEY,
        nome VARCHAR(50) NOT NULL
    );

    CREATE TABLE Servico (
        idServico SMALLINT(2) PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(20) NOT NULL,
        descricao TINYTEXT NULL,
        preco DECIMAL(5,2) NOT NULL
    );

    CREATE TABLE Agendamento (
        data DATE NOT NULL,
        hora TIME NOT NULL,
        idCliente SMALLINT(5) NOT NULL,
        PRIMARY KEY(data, hora, idCliente),
        FOREIGN KEY(idCliente) REFERENCES Cliente(idCliente)
    );

    CREATE TABLE Agendamento_Funcionario (
        data DATE NOT NULL,
        hora TIME NOT NULL,
        idCliente SMALLINT(5) NOT NULL,
        CPF CHAR(11) NOT NULL,
        PRIMARY KEY(data, hora, idCliente, CPF),
        FOREIGN KEY(data, hora, idCliente) REFERENCES Agendamento(data, hora, idCliente),
        FOREIGN KEY(CPF) REFERENCES Funcionario(CPF)
    );

    CREATE TABLE Agendamento_Servico (
        data DATE NOT NULL,
        hora TIME NOT NULL,
        idCliente SMALLINT(5) NOT NULL,
        idServico SMALLINT(2) NOT NULL,
        precoTotal DECIMAL(5,2) NOT NULL,
        status BOOLEAN DEFAULT FALSE,
        pago BOOLEAN DEFAULT FALSE,
        PRIMARY KEY(data, hora, idCliente, idServico),
        FOREIGN KEY(data, hora, idCliente) REFERENCES Agendamento(data, hora, idCliente),
        FOREIGN KEY(idServico) REFERENCES Servico(idServico)
    );
    ```

3.  **Configuração da Conexão:**
    A conexão com o banco de dados está configurada no arquivo `src/br/unimontes/hm01/controller/BD.java`. Por padrão, ela utiliza:
    *   **Host:** `localhost`
    *   **Porta:** `3306`
    *   **Usuário:** `root`
    *   **Senha:** (vazia)

    Se o seu ambiente de banco de dados for diferente, altere as credenciais neste arquivo.

## Como Executar o Projeto

Este projeto foi desenvolvido utilizando o NetBeans IDE, que gerencia as dependências e o processo de build automaticamente.

1.  **Abra o projeto no NetBeans:**
    *   Clone ou baixe este repositório.
    *   Abra o NetBeans IDE.
    *   Vá em `Arquivo > Abrir Projeto...` e selecione a pasta do projeto.

2.  **Execute o projeto:**
    *   Após o NetBeans carregar o projeto, você pode executá-lo clicando no botão "Executar Projeto" (ícone de play verde) ou pressionando a tecla `F6`.
    *   O NetBeans irá compilar o código e iniciar a aplicação, começando pela tela de `Login`.
