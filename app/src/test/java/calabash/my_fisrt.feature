Feature: Comprobar los componentes de la interfaz
  Scenario: Pulsar boton perfil
    Then acceder al menu
    Then pulsar el boton "perfil"
  Scenario: Introducir por teclado un usuario
    Then pulsar el boton de "login"
    Then pulsar boton "ususario"
    Then introducir por teclado "usuario"
    Then pulsar boton "contraseña"
    Then introducir por teclado "contraseña"
  Scenario: Comprobar el teclado de movil
    Then pulsar el boton de "login"
    Then pulsar boton "ususario"
    Then introducir por teclado "usuario"
    Then pulsar boton "contraseña"
    Then introducir por teclado "contraseña"
    Then abrir "teclado"