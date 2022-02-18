Feature: Se solicita crear, editar y buscar una red a partir de un convenio
  Como usuario quiero crear una red, editar y buscar

  Background:
    Given El usuario debe estar en la página de login
    When Ingrese nombre_usuario "jescobaro"
    And Ingresa contraseña "Colpatria1"
    And Presiona el botón Iniciar sesion
    And Se muestra la pantalla principal del portal gestion

  @CrearRed
  Scenario Outline: Se realiza la creación de red
    And Realizar click sobre configuracion
    And Realizar click sobre submenu redes
    When Realizar click sobre el boton crear red
    And Confirmar la pantalla crear red
    And Confirmar tabla datos principales
    And Ingresar nombre de red "<nombre_red>"
    And Seleccionar convenio "<convenio>"
    And Seleccionar estado red "<estado>"
    And Seleccionar causal "<causal>"
    And Seleccionar departamento distribucion "<departamento_distribucion>"
    And Seleccionar ciudad distribucion "<ciudad_distribucion>"
    And Confirmar tabla informacion administrativa
    And Ingresar dias cartera "<dias_carteras>"
    Then Click en el boton guardar
    Then Se guarda el convenio "<alertMessage>"

    Examples:
      | nombre_red            | convenio                        | estado  | causal                    | departamento_distribucion  | ciudad_distribucion        |dias_carteras  | alertMessage                                   |
      #| PruebaAutomatizacion  | 6182 - CAÑAVERA GIRALDO LIGIA   | Activo  | Seleccione una causal     | 23 - CORDOBA               | 23001 - MONTERIA           |0              |Éxito:: Operación ejecutada exitosamente. - 0  |
      | PruebaAutomatizacion1  | 6182 - CAÑAVERA GIRALDO LIGIA   | Activo  | Seleccione una causal     | 25 - CUNDINAMARCA          | 25019 - ALBAN              |0              |Éxito:: Operación ejecutada exitosamente. - 0  |