Feature: Página de error
  Scenario: Tener una página de error por si falla la aplicación
    Given Una página que avise al usuario que algo va mal
    When Cuando suceda un error
    Then Se notificará al usuario que ha habido un error