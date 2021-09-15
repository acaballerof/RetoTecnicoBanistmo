# Autor: Alberto Caballero

@stories
Feature: Reto Skill Hacking Banistmo
  As a user i want to open an PDF document to see some bank information
  @scenario1
  Scenario: Search for the PDF of Contrato Para La Inversion Virtual Bancolombia
    Given than Alberto wants to read the Reglamento Inversion Virtual document
    When he seach for the PDF document
    Then he find the PDF document about Contrato Para La Inversion Virtual Bancolombia
      |urlContratoInversionVirtual|
      |Contrato+Inversi|

