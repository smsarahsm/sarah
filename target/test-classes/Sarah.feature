@sarah
Feature: Teste Sarah


Scenario: Teste Fazer login
Given que entre no site "http://sampleapp.tricentis.com/101/app.php"
And Preencha o formulário Enter Vehicle Data
And Preencha o formulário Enter Insurant Data
And Preencha o formulário Enter Product Data
And Preencha o formulário Select Price Option
When Preencha o formulário Send Quote
Then será apresentado em tela a mensagem "Sending e-mail success!"