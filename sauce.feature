#Author: matheussena.25@outlook.com


Feature: 	Realizando compras no site da Sauce
  Eu como usuario quero efetuar o login para realizar compras 

 
  Scenario: Realizar compras com sucesso
    Given que o usuario acessa o site "https://www.saucedemo.com/"
    And efetue o login
    And Organiza os produtos pelo valor
    When clicar no produto desejado
    Then efetue compra do produto com sucesso

 