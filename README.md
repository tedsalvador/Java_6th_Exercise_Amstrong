# Java 6th Exercise: Amstrong

Enunciado:
Se quiere desarrollar un programa que determine si un número es un número de Amstrong. Un número de Amstrong es aquel que es igual a la suma de sus dígitos elevados a la potencia de su número de cifras.

Por ejemplo, el número 371 es un número que cumple dicha característica ya que tiene tres cifras y:
371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371


# Estructura del Proyecto
Java_6th_Exercise_Amstrong/ <br>
├── src/<br>
│    ├── main/<br>
│    │   └── java/<br>
│    │       └── com/<br>
│    │           └── example/<br>
│    │               └── amstrong/<br>
│    │                   ├── AmstrongChecker.java<br>
│    │                   └── Main.java<br>
│    │                   └── models/<br>
│    │                       └── Number.java<br>
│    ├── test/<br>
│    │   └── java/<br>
│    │       └── com/<br>
│    │           └── example/<br>
│    │               └── amstrong/<br>
│    │                   ├── AmstrongCheckerTest.java<br>
│    │                   └── models/<br>
│    │                       └── NumberTest.java<br>
│    └── resources/<br>
├── .gitignore<br>
├── pom.xml<br>
└── README.md<br>

Entregable:
- Repositorio de git
- Obligatorio realizar los pruebas unitarias

# Diagrama de Clases

                                                +------------------+<br>
                                                |       Main       |<br>
                                                +------------------+<br>
                                                |                  |<br>
                                                +------------------+<br>
                                                        |<br>
                                                        |<br>
  +---------------------------+         +----------------------------------+<br>
  |      AmstrongChecker      |         |             Number               |<br>
  +---------------------------+         +----------------------------------+<br>
  | - isAmstrong(int): boolean|         | - getNumberOfDigits(): int       |<br>
  +---------------------------+         | - calculateArmstrongValue(): int |<br>
             |                          +----------------------------------+<br>
             |                                       | <br>
             |                                       |<br>
             |                                       |<br>
        Comprueba si                           Pide número al<br>
       es número de                               usuario y <br>
        Amstrong.                              muestra resultado.<br>

# Texto Enunciado:
[Enunciado Link]https://docs.google.com/document/d/1-6DPcrDmny4UHEaCBlcs7V6kWdMtPRd1_Ke8aYIQCMA/edit