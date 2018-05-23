# https://docs.cucumber.io/gherkin/reference/#step-arguments
Feature: Test cucumber features

  Scenario: data tables
    Given the following users exist:
      | name   | email              | twitter         |
      | Aslak  | aslak@cucumber.io  | @aslak_hellesoy |
      | Julien | julien@cucumber.io | @jbpros         |
      | Matt   | matt@cucumber.io   | @mattwynne      |