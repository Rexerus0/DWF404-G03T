# Investigación Aplicada 1 - Simulador de Parque de Diversiones [DWF404 | 2025 01]

Entrega de investigación aplicada 1.

> Equipo: _Terceto de Nos_

| Estudiantes:                      | Carnets: |
| --------------------------------- | -------- |
| Caballeros Cruz, Carlos Alexander | CC241589 |
| Lovato Molina, Franklin David     | LM162734 |
| Rivera Serrano, Marvin Josué      | RS180397 |

------------------------------------------------------------------------

## Contexto

Un parque de diversiones necesita un sistema para administrar sus atracciones y visitantes. Cada atracción tiene
restricciones de edad, capacidad máxima y estados operativos. Los visitantes deben comprar boletos antes de
acceder a las atracciones.

Cuando una atracción entra en mantenimiento, los visitantes deben ser reubicados a otra atracción similar. Los
boletos tienen diferentes tipos (Infantil, Adulto, VIP), y el precio varía según el tipo de atracción.

## Modelado de clases y relaciones

* Atraccion (superclase con atributos nombre, capacidad, edadMinima, estado).
    * Subclases (MontañaRusa, Carrusel, CasaDelTerror) con restricciones específicas.
* Empresa, que contiene instancias de los departamentos y un historial de eventos.
* Visitante con atributos nombre, edad, listaDeBoletos.
* Boleto con tipos de acceso y precios.
* Interfaces y abstracción
    * Una interfaz Operable con métodos iniciar(), detener(), realizarMantenimiento().

## Reglas del sistema

+ Un visitante solo puede entrar a una atracción si cumple la edad mínima.
+ Cuando una atracción entra en mantenimiento, los visitantes deben ser reasignados.
+ Los boletos VIP permiten acceso a todas las atracciones sin restricciones de edad.
+ Cada atracción tiene un cupo máximo de visitante

## Casos de prueba

* Intentar ingresar un niño a una montaña rusa con restricción de edad y validar que el acceso se deniega.
* Simular la venta de boletos y verificar que los tipos de boletos asignan acceso correctamente.
* Poner una atracción en mantenimiento y confirmar que los visitantes son reubicados.

------------------------------------------------------------------------

## 📌 Requerimientos Técnicos

1. Configuración del Proyecto
    * [ ] Lenguaje: Java 17
    * [ ] Gestor de dependencias: Maven
    * [ ] Repositorio de código: Git & GitHub
2. Uso de Git y GitHub
    * [ ] Cada equipo debe crear un repositorio privado en GitHub.
    * [ ] Configurar el archivo .gitignore para evitar subir archivos innecesarios (por ejemplo, la carpeta
          target/).
    * [ ] Utilizar branches para organizar el trabajo:
        * main → Versión estable del código
        * develop → Desarrollo en curso
        * feature/nombre-feature → Ramas individuales por funcionalidad
    * [ ] Al menos dos pull requests deben ser revisadas por el equipo antes de fusionarse a develop.
    * [ ] Cada commit debe tener un mensaje descriptivo y claro.  
          (Revisar: https://www.atlassian.com/es/git/tutorials/comparing-workflows/gitflow-workflow)
3. Diseño e Implementación en Java
    * [ ] Aplicar correctamente los principios de Programación Orientada a Objetos (POO):
        * Herencia
        * Polimorfismo
        * Abstracción
        * Encapsulamiento
    * [ ] Utilizar interfaces y clases abstractas cuando sea necesario.
    * [ ] Implementar patrones de diseño según el problema asignado (opcional)
4. Pruebas Unitarias con JUnit
    * [ ] Implementar pruebas unitarias con JUnit 5 en la carpeta src/test/java.
    * [ ] Cobertura mínima del 70% en las clases principales (puede configurar y utilizar jacoco).  
          Jacoco: https://www.eclemma.org/jacoco/
    * [ ] Cada prueba debe:
        * Evaluar una funcionalidad específica.
        * Tener nombres descriptivos (shouldRegistrarClienteCuandoDatosValidos).
5. Documentación y Presentación
    * [ ] Incluir un README.md en el repositorio con:
        * Descripción del problema y solución
        * Cómo ejecutar el proyecto
        * Explicación breve de las pruebas unitarias
* 📌 Entregables Finales
    1. Repositorio en GitHub con el código implementado.
    2. README.md con la documentación básica.
    3. Pruebas unitarias funcionando con al menos 70% de cobertura.

------------------------------------------------------------------------

## README TODO:
* [ ] Cómo ejecutar el proyecto
* [ ] Explicación breve de las pruebas unitarias