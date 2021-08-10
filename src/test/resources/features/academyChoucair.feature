  #Autor: Laura



  @Stories
  Feature: Academy Choucair
    As a user, I want to learn how to  automate in screamplay at the Choucair Academy with the automation course
    @scenario1

    Scenario: Search for a automation course
      Given than Laura wants to learn automation at the academy Choucair
      | strUser  | strPassword |
      | TuUusario| TuClave     |
      When she search for the course  on the choucair academy platform
      | strCourse              |
      | Metodología Bancolombia|
      Then she finds the course called
      | StrCourse              |
      | Metodología Bancolombia|



