@sarah
Feature: Teste Sarah


Scenario: Teste Fazer login
Given que entre no site "http://sampleapp.tricentis.com/101/app.php"
And Preencha o formul�rio Enter Vehicle Data
And Preencha o formul�rio Enter Insurant Data
And Preencha o formul�rio Enter Product Data
And Preencha o formul�rio Select Price Option
When Preencha o formul�rio Send Quote
Then ser� apresentado em tela a mensagem "Sending e-mail success!"