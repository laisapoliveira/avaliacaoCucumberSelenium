@tag
Feature: Teste de preenchimento de formulário do site Tricentis

  Scenario: Entrar no site do sampleapp
    Given que eu queira realizar uma simulacao de um seguro veicular
    When eu entrar no site
    And clicar na aba automobile
    Then o site deve ser direcionado para o formulario de seguro de automovel

  Scenario: Preencher aba Enter Vehicle Data
    Given que eu queira preencher a aba Enter Vehicle Data
    When preencher os campos
    Then o site deve validar todos os campos como checked e deve clicar em next para direcionar para a proxima aba

  Scenario: Preencher aba Enter Insurant Data
    Given que eu queira preencher a aba Enter Insurant Data
    When preencher os campos na aba Enter Insurant Data
    Then o site deve validar todos os campos da aba Enter Insurant Data como checked e deve clicar em next para direcionar para a proxima aba

	Scenario: Preencher aba Enter Product Data
    Given que eu queira preencher a aba Enter Product Data
    When preencher os campos na aba Enter Product Data
    Then o site deve validar todos os campos da aba Enter Product Data como checked e deve clicar em next para direcionar para a proxima aba

	Scenario: Preencher aba Select Price Option
    Given que eu queira preencher a aba Select Price Option
    When selecionar a opcao ultimate
    Then o site deve validar a aba Select Price Option e deve clicar em next para direcionar para a proxima aba

  Scenario: Preencher os dados finais e enviar para o email o seguro automobilistico
    Given que eu queira preencher a aba Send Quote
    When preencher os campos na aba Send Quote
    Then o site deve validar a aba Send Quote e deve exibir uma mensagem de sucesso ao finalizar a operacao