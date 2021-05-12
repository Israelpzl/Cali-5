Feature: Estadísticas Vacuncación Covid
  Como usuario de la app, quiero ver las estadísticas de la vacunacion en España

  Scenario: Búsqueda a traves de un link
    Given una página web del ministerio con toda la infromación de la vacunación
    When cuando se pulsa el botón "Vacunación"
    Then se muestra el resultado de la información
