Feature: Se solicita crear un convenio, editarlo y buscar, ingresando datos principales e infoormación administrativa.
  Como usuario quiero crear un convenio, editar y buscarlo.

  Background:
    Given El usuario debe estar en la página de login
    When Ingrese nombre_usuario "jescobaro"
    And Ingresa contraseña "Colpatria1"
    And Presiona el botón Iniciar sesion
    And Se muestra la pantalla principal del portal gestion

  @BuscarConvenio
  Scenario Outline: Se realiza la creación de convenio
    And Realizar click sobre configuracion
    And Realizar click sobre submenu convenio
    And Seleccionar canal distribuidor "<canal_distribuidor>"
    And Seleccionar zona "<zona>"
    And Ingresar clave convenio "<convenio>"
    When Click en buscar
    And Confirmar el nombre del canal "<nombre_canal>"
    And Confirmar el nombre de la zona "<nombre_zona>"
    And Confirmar la clave de convenio "<clave_convenio>"
    Then Se debe confirmar que tenga nombre de convenio "<nombre_convenio>"

    Examples:
    |canal_distribuidor     |zona                             |convenio |nombre_canal       |nombre_zona    |clave_convenio |nombre_convenio  |
    |1 - ALIANZAS Y MASIVOS |Zona Atlantico                   |011019   |ALIANZAS Y MASIVOS |Zona Atlantico |011019         |pruebasinRED1-10 |
    |1 - ALIANZAS Y MASIVOS |Por favor, seleccione una opción.|011019   |ALIANZAS Y MASIVOS |Zona Atlantico |011019         |pruebasinRED1-10 |
    |Seleccione un canal    |Por favor, seleccione una opción.|011019   |ALIANZAS Y MASIVOS |Zona Atlantico |011019         |pruebasinRED1-10 |

  @CrearConvenio
  Scenario Outline: Se realiza la creación de convenio
    And Realizar click sobre configuracion
    And Realizar click sobre submenu convenio
    When Realizar click sobre el boton crear convenio
    And Confirmar la pantalla crear convenio
    And Confirmar tabla datos principales
    And Ingresar nombre convenio "<nombre_convenio>"
    And Seleccionar canal distribuidor comercial "<canal_distribuidor>"
    And Ingresar clave convenio "<clave_convenio>"
    And Ingresar direccion "<direccion>"
    And Ingresar telefono "<telefono>"
    And Ingresar celular "<celular>"
    And Ingresar correo convenio "<correo>"
    And Ingresar descripcion "<descripcion>"
    And Ingresar notas "<notas>"
    And Seleccionar tipo identificacion "<tipo_identificacion>"
    And Ingresar numero identificacion "<numero_identificacion>"
    And Ingresar nombre comercial "<nombre_comercial>"
    And Seleccionar departamento residencia "<departamento_residencia>"
    And Seleccionar ciudad residencia "<ciudad_residencia>"
    And Seleccionar departamento tributario "<departamento_tributario>"
    And Seleccionar ciudad tributario "<ciudad_tributario>"
    And Seleccionar clase "<clase>"
    And Seleccionar sucursal "<sucursal>"
    And Confirmar tabla informacion administrativa
    And Seleccionar modo descuento comision "<modo_descuento_comision>"
    And Seleccionar tipo regimen "<tipo_regimen>"
    And Seleccionar tipo convenio "<tipo_convenio>"
    And Seleccionar estado "<estado>"
    And Seleccionar casual "<casual>"
    And Ingresar administrado por "<administrador_por>"
    And Ingresar numero serie datafono "<numero_serie_datafono>"
    And Click en el boton guardar
    Then Se guarda el convenio "<alertMessage>"

    Examples:
      | nombre_usuario| contraseña| nombre_convenio          | canal_distribuidor      | clave_convenio  | direccion     | telefono  | celular     | correo                      | descripcion           | notas                 | tipo_identificacion     | numero_identificacion  | nombre_comercial          | departamento_residencia   | ciudad_residencia       | departamento_tributario   | ciudad_tributario     | clase     | sucursal              | modo_descuento_comision   | tipo_regimen  | tipo_convenio   | estado | casual               | administrador_por | numero_serie_datafono  | alertMessage                          |
      #| jescobaro     | Colpatria1| CAÑAVERA  GIRALDO LIGIA  | 1 - ALIANZAS Y MASIVOS  | 6182            | Cra 27#15-20  | 1234567   | 3024523256  | jason.fierro@vasslatam.com  | PruebaAutomatización  | PruebaAutomatización  | CC - Cedula Ciudadania  | 64543150               | CAÑAVERA  GIRALDO LIGIA   | 23 - CORDOBA              | 23001 - MONTERIA        | 23 - CORDOBA              | 23001 - MONTERIA      | Convenio  | 5 - BOGOTÁ SAN DIEGO  | Corte de cuenta           | Común         | BASICOS         | Activo | Seleccione una causal| Jason             | 12345                  |Operación ejecutada exitosamente. - 0 |
      | jescobaro     | Colpatria1| JAIME SOLANO & CIA. LTDA.| 1 - ALIANZAS Y MASIVOS  | 6611            | Cra 27#15-20  | 1234567   | 3024523256  | jason.fierro@vasslatam.com  | PruebaAutomatización  | PruebaAutomatización  | CC - Cedula Ciudadania  | 890311394              | JAIME SOLANO & CIA. LTDA. | 23 - CORDOBA              | 23001 - MONTERIA        | 23 - CORDOBA              | 23001 - MONTERIA      | Convenio  | 5 - BOGOTÁ SAN DIEGO  | Corte de cuenta           | Común         | BASICOS         | Activo | Seleccione una causal| Jason             | 12345                  |Operación ejecutada exitosamente. - 0  |

  @EditarConvenio
  Scenario Outline: Se realiza la edicion de convenio
    And Realizar click sobre configuracion
    And Realizar click sobre submenu convenio
    And Seleccionar canal distribuidor "<canal_distribuidor>"
    And Seleccionar zona "<zona>"
    And Ingresar clave convenio "<convenio>"
    When Click en buscar
    And Confirmar el nombre del canal "<nombre_canal>"
    And Confirmar el nombre de la zona "<nombre_zona>"
    And Confirmar la clave de convenio "<clave_convenio>"
    And Se debe confirmar que tenga nombre de convenio "<nombre_convenio>"
    And Click sobre el boton editar
    And Ingresar direccion "<direccion>"
    And Ingresar telefono "<telefono>"
    And Ingresar celular "<celular>"
    Then Click en el boton actualizar
    #Then Se guarda el convenio "<alertMessage>"

    Examples:
      |canal_distribuidor     |zona                             |convenio |nombre_canal       |nombre_zona    |clave_convenio |nombre_convenio        | direccion     | telefono  | celular     | alertMessage                          |
      |Seleccione un canal    |Por favor, seleccione una opción.|6182     |ALIANZAS Y MASIVOS |Zona Arauca    |6182           |CAÑAVERA GIRALDO LIGIA | Cra 27#15-55  | 1234567   | 3024523256  |Operación ejecutada exitosamente. - 0  |