@guru99_Feature
Feature: Guru99 website

@tc01_guru99
Scenario: Learn cucumber framework with the help of guru99 website

          Given the user launched the chrome browser
          When the user opens guru99 homepage
          And selects cucumber testing from testing list
          Then the user should navigate to cucumber tutorial


@tc02_google
Scenario:  Check that main elements on a google homepage are displayed
        
        Given launch an chrome browser
        When the user opens google homepage
         And verify textbox
       Then Click the search button
        