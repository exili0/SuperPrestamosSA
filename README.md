¡Bienvenido al SuperPrestamosSA!

Este proyecto, desarrollado por Mario, Nico y Alex , tiene como objetivo crear un sistema para una empresa ficticia que presta recursos 
relacionadas con el mundo de los superhéroes. 
Desde armas místicas hasta los propios superhéroes, nuestro sistema facilita el proceso de préstamo siguiendo una serie de sencillos pasos.

CREACIÓN DE LA APLICACIÓN

Para organizar la codificación y la realización de tareas, se ha llevado a cabo la metodología SCRUM, cuyas características son:
 - El software funcionando por encima de la documentación extensiva
 - Valorar a los individuos y las iteraciones sobre el proceso y las herramientas
 - Valorar más la respuesta ante el cambio que seguir un plan

Teniendo en cuenta la fecha límite (29/4/2024) se han realizado varios Sprints para adecuarlo lo máximo poosible.
Además, hemos organizado varias Daily Meeting (hablando de lo que hemos cambiado o añadido y viendo la dirección del proyecto) para poder estar preparados ante cualquier cambio o error repentino.

REQUISITOS REALIZADOS POR CADA MIEMBRO DEL GRUPO:

-> MARIO:
-> NICO:

OBJETIVOS DEL PROGRAMA 

## **— Login ————————————————————**

- [x]  RQ01: Para iniciar sesión, se requerirá el nickname de usuario y su contraseña
- [x]  RQ02: Dependiendo del rol del usuario (administrador superempresa o superempresa), se dirigirá a una ventana específica después del inicio de sesión.
- [x]  RQ03: La plataforma mostrará información predeterminada, pero para realizar acciones, las superempresas deben iniciar sesión.
- [ ]  RQ04: Después de tres intentos fallidos de inicio de sesión, la aplicación cerrará la sesión y sacará a las superempresas de la plataforma.
(CORREGIR PARA QUE SEA CUANDO SE TRATE DE ENTRAR A UNA CUENTA YA CREADA)
- [ ]  RQ05: Desde la pantalla de inicio de sesión, las superempresas podrán acceder a las opciones de recuperación de contraseña y registro.

## **— Registro ————————————————————**

- [x]  RQ06: Las contraseñas deben tener al menos 6 caracteres, incluyendo mayúsculas, minúsculas y números.
- [x]  RQ07: Los nicknames deben estar compuestos por caracteres anglosajones y pueden incluir números, siendo únicos.
- [ ]  RQ08: Durante el registro, las superempresas deben confirmar que tienen más de 14 años luchando contra el crimen y aceptar los términos y condiciones
- [ ]  RQ09: Seleccionar una de las preguntas de seguridad predefinidas y proporcionar una respuesta para recuperar la contraseña en caso necesario.
- [ ]  RQ10: El registro requerirá el nickname, nombre, superpoder, contraseña (almacenada como hash), ubicación, y repetir la contraseña.
- [ ]  RQ11: Si se selecciona la opción de ser administrador de superempresas, se requerirá un código secreto para completar el registro.
- [ ]  RQ12: El registro será interno, sin depender de servicios externos.

## **— Olvido de Contraseña————————————————————**

- [ ]  RQ13: Desde la pantalla de inicio de sesión, las superempresas podrán acceder a la opción de recuperación de contraseña, donde deberán proporcionar su nickname, seleccionar una pregunta de seguridad predefinida y escribir la respuesta correcta para acceder a la ventana de cambio de contraseña.
- [ ]  RQ14: En la ventana de cambio de contraseña, las superempresas deberán ingresar la nueva contraseña dos veces, siguiendo los requisitos de seguridad establecidos.

## **— Acceso invitado (sin Login)————————————————————**

- [x]  RQ18: Los usuarios invitados sin iniciar sesión podrán acceder aparte de las estadísticas y ver el título de la aplicación
- [ ]  RQ19: Se deberá incluir la opción de buscar por localización (zona en la que comparten recursos las superempresas, por ejemplo, Gotham) y visualizar todos los lugares relevantes de esa localización con los recursos correspondientes

## **— Gestión de Recursos————————————————————**

- [ ]  RQ20: Las superempresas podrán registrar recursos, incluyendo tecnología avanzada, habilidades especiales, armamento, etc.
- [ ]  RQ21: Se permitirá dejar un recurso, registrando la fecha en que se prestó, el código postal y la ubicación (pública o privada).
- [ ]  RQ22: Las superempresas podrán "tomar" un recurso disponible. Al seleccionar un recurso, se realizará un registro de su uso y se marcará como no disponible.
- [ ]  RQ23: Después de dejar un recurso, se deberá realizar una valoración del mismo del 1 al 5, con opción de agregar comentarios.
- [ ]  RQ24: Las superempresas podrán buscar lugares donde depositar o encontrar recursos, tanto públicos como privados

## **— Gestión del Administrador————————————————————**

- [ ]  RQ25: Los administradores podrán dar de baja un recurso de la plataforma.
- [ ]  RQ26: Se proporcionará a los administradores la capacidad de consultar estadísticas sobre recursos, ubicaciones, etc.
- [ ]  RQ27: Los administradores podrán agregar y eliminar ubicaciones privadas de la plataforma.
- [ ]  RQ28: Los administradores tendrán la capacidad de enviar mensajes privados a las superempresas.

## **— Ayudas e Información————————————————————**

- [ ]  RQ29: Las superempresas recibirán mensajes informativos sobre la funcionalidad de la plataforma, que incluirán ayudas
- [x]  RQ30: Deberá haber una sección de Preguntas Frecuentes (FAQ).

## **— Usabilidad y Accesibilidad————————————————————**

- [ ]  RQ31: La plataforma deberá ser fácil de usar, accesible y segura para todas las superempresas
