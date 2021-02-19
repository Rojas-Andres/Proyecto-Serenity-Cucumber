@stories
  Feature: Academy Choucair
    As a user ,I want to learn how to autamate in screamplay at the choucair Academy whit automatization cou
  @scenario1
  Scenario Outline: Search for automatization course
    Given Than branon wants to learn automation at the academy choucair
    | strUser    | strPassword       |
    | <strUser>  | <strPassword>     |
    When he search for the course on the choucair academy plataform
    | strCourse   |
    | <strCourse> |
    Then he finds the course called resources
    | strCourse   |
    | <strCourse> |

    Examples:
    | strUser    | strPassword   | strCourse                  |
    | 1006206400 | Choucair2021* | Workshop de Automatización |