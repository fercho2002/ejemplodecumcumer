Feature: Realizar el Login correctamente y validación de campos del portal gestion
  Como usuario quiero ver el login correcto, incorrecto y vacio con validaciones

  @LoginSuccess
  Scenario Outline: Ingresar al portal cuando el usuario es correcto
    Given El usuario debe estar en la página de login
    When Ingrese el nombre_usuario "<nombre_usuario>"
    And Ingresa la contraseña "<contraseña>"
    And Presiona el botón Iniciar sesion
    Then Se muestra la pantalla principal del portal gestion
    Examples:
      | nombre_usuario  | contraseña |
      | jescobaro       | Colpatria1 |

  @LoginFail
  Scenario Outline: Ingresar al portal cuando el usuario es incorrecto
    Given El usuario debe estar en la página de login
    When Ingrese el nombre_usuario "<nombre_usuario1>"
    And Ingresa la contraseña "<contraseña1>"
    And Presiona el botón Iniciar sesion
    Then Se muestra el error de inicio de Sesion
    Examples:
      | nombre_usuario1  | contraseña1  |
      | jescobar        | Colpatria   |
      | jescobar        | Colpatria3  |

  @LoginClear
  Scenario Outline: Ingresar al portal cuando el usuario es incorrecto
    Given El usuario debe estar en la página de login
    When Ingrese el nombre_usuario "<nombre_usuario2>"
    And Ingresa la contraseña "<contraseña2>"
    And Presiona el botón Iniciar sesion
    Then Se muestra el error de campo obligatorio
    Examples:
      | nombre_usuario2  | contraseña2  |
      |                 |             |