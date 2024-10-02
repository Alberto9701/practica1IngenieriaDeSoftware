# practica1IngenieriaDeSoftware
El proyecto se enfoca en la creación de un arquetipo de una API Rest utilizando Spring Boot. El arquetipo debe ser desarrollado a través de Spring Initializr y puede usar Gradle o Maven como herramientas de construcción. Además, se recomienda utilizar Groovy o cualquier lenguaje compatible con la JVM, como Java, Kotlin, Scala, entre otros.

El API implementará dos métodos que calculan la cerradura de Kleene y la cerradura positiva de un conjunto de cadenas binarias de longitud máxima n. El valor de n se recibe como parámetro y determinará los elementos en los conjuntos resultantes:

*Cerradura de Kleene (Σ)**: Incluirá el conjunto de cadenas binarias de longitud hasta n, más la cadena vacía (λ).
Cerradura positiva (Σ⁺): Similar a la cerradura de Kleene, pero excluye la cadena vacía (λ).
Los endpoints tendrán la siguiente estructura:

Path:

/api/cerradura/estrella/<input>: Calcula la cerradura de Kleene.
/api/cerradura/positiva/<input>: Calcula la cerradura positiva.
Método: Se utilizará el método PUT, aunque se permite la opción de usar POST o GET como variantes. Si se usa POST, el parámetro n deberá enviarse en el cuerpo de la solicitud.

Respuesta: La respuesta del API será en formato JSON, conteniendo el conjunto resultante de cadenas.
