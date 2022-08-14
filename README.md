# Quality Assurance (QA) Challenge - SauceDemo

* Autor: Matheus Eugênio Sena

## Acessar "e-commerce" da saucedemo

Testes para simular uma sessão de compras no site sucedemo.com

## Tecnologias Utilizadas

 - Java 
 - Junit 
 - Selenium 
 - WebDriver 
 - Maven
 - Cucumber
 
 ##  Funcionalidades
 
 O teste foi desenvolvido com os seguintes cenarios.
 
 ```bash
Funcionalidade: Realizando compras no site da Sauce
  Eu como usuario quero efetuar o login para realizar compras 

 
  Scenario: Realizar compras com sucesso
    Given que o usuario acessa o site "https://www.saucedemo.com/"
    And efetue o login
    And Organiza os produtos pelo valor
    When clicar no produto desejado
    Then efetue compra do produto com sucesso
 ```

---

## Como executar o projeto

1º - Baixar o repositório .zip e o descompactar em sua maquina.
2º - Abra as informaçãos utilizando o Eclipse(ou programa compativel).
3º - Executar o teste.
