Feature: Estadísticas Vacunación Covid
  Como usuario de la app, quiero que el sistema me notifique cuando pulse el botón que me lleva a la página de vacunación.

  Scenario: Pulsar el botón de vacunación
    Given una página web del ministerio con toda la información de la vacunación
    When cuando se pulsa el botón "Vacunación"
    Then se muestra una notificación al usuario
