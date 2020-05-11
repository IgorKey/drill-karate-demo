Feature: Hello Petclinic

  Background:
    Given url 'http://localhost:8080'
    Given path '/'

  Scenario: Home

    Given param name = 'Any'
    When method GET
    Then status 200