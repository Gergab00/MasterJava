# 2. Fundamentos de Spring Boot

Spring Boot es un framework para aplicaciones Java que se basa en el popular framework Spring y que tiene como objetivo simplificar el proceso de desarrollo de aplicaciones. Aquí te proporciono algunos de los fundamentos de Spring Boot que debes conocer para comenzar a trabajar con él:

1. **Inversión de control (IoC) y la inyección de dependencias:** Spring Boot utiliza la inversión de control y la inyección de dependencias para crear objetos y gestionar su ciclo de vida. Esto significa que los objetos son creados y administrados por el contenedor de Spring en lugar de ser creados directamente por el código de la aplicación.

2. **Autoconfiguración:** Spring Boot proporciona una funcionalidad de autoconfiguración que reduce la cantidad de configuración necesaria. Utiliza convenciones y detección automática de clases para configurar automáticamente la aplicación y sus dependencias.

3. **Microservicios:** Spring Boot es una opción popular para el desarrollo de aplicaciones basadas en microservicios debido a su soporte para la creación de servicios web RESTful y su capacidad para empaquetar y desplegar servicios en contenedores.

4. **Spring Data:** Spring Boot proporciona soporte para la capa de acceso a datos a través de Spring Data. Spring Data es una biblioteca que proporciona un conjunto de abstracciones para acceder a diferentes tipos de bases de datos y realizar operaciones CRUD (crear, leer, actualizar, eliminar).

5. **Actuadores:** Spring Boot incluye actuadores que proporcionan una visibilidad y gestión detallada de la aplicación en ejecución. Los actuadores incluyen endpoints que exponen información sobre la salud de la aplicación, las estadísticas de la aplicación y otros datos importantes.

6. **Spring Security:** Spring Boot proporciona soporte para la seguridad de la aplicación a través de Spring Security. Spring Security es una biblioteca que proporciona un conjunto de herramientas para autenticar y autorizar a los usuarios en la aplicación.

En resumen, los fundamentos de Spring Boot incluyen la inversión de control y la inyección de dependencias, la autoconfiguración, el soporte para aplicaciones basadas en microservicios, Spring Data, los actuadores y Spring Security. Estos conceptos son esenciales para comprender y utilizar Spring Boot de manera efectiva.

## Arquitectura de Spring Boot {#arquitectura-de-spring-boot}

La arquitectura de Spring Boot se basa en el patrón de arquitectura MVC (Modelo-Vista-Controlador), que separa la lógica de la aplicación en tres componentes principales: el modelo, la vista y el controlador. Sin embargo, Spring Boot va más allá del patrón MVC y ofrece una arquitectura que se basa en el uso de componentes, la inyección de dependencias y la configuración basada en anotaciones. Aquí te explico los principales componentes de la arquitectura de Spring Boot:

- **Controladores:** Los controladores son componentes que se utilizan para procesar las solicitudes entrantes y generar una respuesta adecuada. En Spring Boot, los controladores son clases anotadas con **`@RestController`** que manejan las solicitudes HTTP a través de métodos anotados con **`@RequestMapping`**. Por ejemplo, el siguiente código muestra un controlador que maneja las solicitudes GET a /hello:

```java
@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "Hello World!";
    }
}
```

> **Nota:** En Spring Boot, los controladores se utilizan principalmente para procesar las solicitudes HTTP. Sin embargo, también se pueden utilizar para procesar solicitudes de otros tipos, como solicitudes de mensajería.

- **Servicios:** Los servicios son componentes que contienen la lógica de negocio de la aplicación. En Spring Boot, los servicios son clases anotadas con **`@Service`** que contienen los métodos que realizan la lógica de la aplicación. Por ejemplo, el siguiente código muestra un servicio que contiene un método que devuelve el nombre de un usuario:

```java
@Service
public class UserService {

    public String getUserName() {
        return "John Doe";
    }
}
```

> **Nota:** En Spring Boot, los servicios se utilizan principalmente para encapsular la lógica de negocio de la aplicación. Sin embargo, también se pueden utilizar para encapsular la lógica de acceso a datos.

- **Repositorios:** Los repositorios son componentes que se utilizan para interactuar con la capa de acceso a datos de la aplicación. En Spring Boot, los repositorios son interfaces anotadas con **`@Repository`** que contienen los métodos para acceder a la base de datos. Por ejemplo, el siguiente código muestra un repositorio que contiene un método que devuelve el nombre de un usuario:

```java
@Repository
public interface UserRepository {

    String getUserName();
}
```

> **Nota:** En Spring Boot, los repositorios se utilizan principalmente para interactuar con bases de datos relacionales. Sin embargo, también se pueden utilizar para interactuar con bases de datos no relacionales, como MongoDB.

- **Modelos:** Los modelos son componentes que representan los datos de la aplicación. En Spring Boot, los modelos son clases POJO (Plain Old Java Object) que representan los datos que se utilizan en la aplicación. Por ejemplo, el siguiente código muestra un modelo que representa un usuario:

```java
public class User {

    private String name;
    private String email;
    private String phone;
}
```
> **Nota:** En Spring Boot, los modelos se utilizan principalmente para representar los datos que se envían y reciben en las solicitudes HTTP.

- **Configuración:** La configuración en Spring Boot se basa en la inyección de dependencias y la configuración basada en anotaciones. La inyección de dependencias se utiliza para proporcionar instancias de componentes necesarios para la aplicación. La configuración basada en anotaciones se utiliza para configurar los componentes de la aplicación, como los controladores, servicios y repositorios. Por ejemplo, el siguiente código muestra cómo se configura un controlador para que se inyecte automáticamente en la aplicación:

```java
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "Hello " + userService.getUserName();
    }
}
```

- **Autoconfiguración:** Spring Boot incluye una funcionalidad de autoconfiguración que reduce la cantidad de configuración necesaria. Utiliza convenciones y detección automática de clases para configurar automáticamente la aplicación y sus dependencias. Por ejemplo, si la aplicación utiliza Spring Data JPA, Spring Boot detecta automáticamente la presencia de la dependencia y configura automáticamente el contenedor de dependencias para que se inyecte automáticamente en la aplicación.

En resumen, la arquitectura de Spring Boot se basa en componentes, inyección de dependencias y configuración basada en anotaciones. Los componentes principales incluyen los controladores, servicios, repositorios, modelos, configuración y autoconfiguración. Al utilizar estos componentes, se puede desarrollar una aplicación fácilmente escalable y mantenible.

## Inversión de control y contenedor de dependencias {#inversion-de-control-y-contenedor-de-dependencias}

La Inversión de Control (IoC) y el Contenedor de Dependencias (DI) son conceptos importantes en Spring Boot y son fundamentales para su funcionamiento.

La Inversión de Control es un patrón de diseño que se utiliza para eliminar la dependencia directa de los objetos de otros objetos. En lugar de crear un objeto directamente, se utiliza una entidad externa para crear el objeto y manejar sus dependencias. La idea es que un objeto no debe preocuparse por cómo se crean sus dependencias, sino que simplemente las recibe y las utiliza.

El Contenedor de Dependencias es una implementación de la Inversión de Control. Es un componente que se encarga de crear y administrar los objetos de una aplicación. El Contenedor de Dependencias recibe las solicitudes de objetos y se encarga de crearlos y administrar sus dependencias.

En Spring Boot, el Contenedor de Dependencias se conoce como ApplicationContext. El ApplicationContext es un objeto que contiene y administra los objetos de una aplicación. Cuando se inicia una aplicación de Spring Boot, se crea un ApplicationContext. El ApplicationContext se encarga de crear los objetos que se necesitan en la aplicación, como los controladores, servicios, repositorios y otros componentes. El ApplicationContext utiliza la Inyección de Dependencias para proporcionar las dependencias necesarias a los objetos creados.

La Inyección de Dependencias es el proceso mediante el cual se proporcionan las dependencias necesarias a un objeto. En Spring Boot, la Inyección de Dependencias se realiza a través de anotaciones, como @Autowired, @Component, @Service, @Repository, entre otras. Estas anotaciones le indican a Spring Boot que debe crear y administrar el objeto anotado y sus dependencias.

En resumen, la Inversión de Control y el Contenedor de Dependencias son conceptos clave en Spring Boot. El Contenedor de Dependencias es responsable de crear y administrar los objetos de una aplicación, mientras que la Inyección de Dependencias se utiliza para proporcionar las dependencias necesarias a los objetos creados. El uso de estos conceptos permite que las aplicaciones de Spring Boot sean más escalables, mantenibles y fáciles de desarrollar.

## Anotaciones básicas de Spring Boot {#anotaciones-basicas-de-spring-boot}

En Spring Boot, las anotaciones se utilizan para indicar al contenedor de dependencias cómo debe crear y administrar los objetos de la aplicación. Algunas de las anotaciones más comunes en Spring Boot son:

- **@SpringBootApplication:** esta anotación se utiliza en la clase principal de la aplicación para indicar que se trata de una aplicación Spring Boot. Esta anotación combina otras tres anotaciones: @Configuration, @ComponentScan y @EnableAutoConfiguration.

    - **@Configuration:** esta anotación se utiliza para indicar que una clase es una clase de configuración. Las clases de configuración se utilizan para definir los beans de la aplicación.

    - **@ComponentScan:** esta anotación se utiliza para indicar que Spring Boot debe escanear los componentes de la aplicación. Los componentes se definen en las clases de configuración.

    - **@EnableAutoConfiguration:** esta anotación se utiliza para habilitar la autoconfiguración de Spring Boot. La autoconfiguración se utiliza para configurar automáticamente los componentes de la aplicación.

Por ejemplo, el siguiente código muestra cómo se utiliza la anotación @SpringBootApplication en la clase principal de la aplicación:

```java
@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
```

- **@RestController:** esta anotación se utiliza para crear un controlador REST en la aplicación. Indica que la clase es un controlador y que sus métodos deben ser tratados como controladores de solicitud REST. Por ejemplo, el siguiente código muestra cómo se utiliza la anotación **`@RestController`** para crear un controlador REST en la aplicación:

```java
@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "Hello World";
    }
}
```

- **@Service:** esta anotación se utiliza para indicar que una clase es un servicio. Los servicios son componentes de la aplicación que se encargan de la lógica de negocio. Por ejemplo, el siguiente código muestra cómo se utiliza la anotación **`@Service`** para crear un servicio en la aplicación:

```java
@Service
public class UserService {

    public String getUserName() {
        return "John Doe";
    }
}
```

- **@Repository:** esta anotación se utiliza para indicar que una clase es un repositorio. Los repositorios son componentes de la aplicación que se encargan de acceder a la capa de datos de la aplicación. Por ejemplo, el siguiente código muestra cómo se utiliza la anotación **`@Repository`** para crear un repositorio en la aplicación:

```java
@Repository
public class UserRepository {

    public String getUser() {
        return "John Doe";
    }
}
```

- **@Autowired:** esta anotación se utiliza para realizar la inyección de dependencias. Se utiliza para indicar que Spring Boot debe proporcionar una instancia de una dependencia para un componente determinado. Por ejemplo, el siguiente código muestra cómo se utiliza la anotación **`@Autowired`** para inyectar una dependencia en un componente:

```java
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getUserName() {
        return userRepository.getUser();
    }
}
```

- **@Value:** esta anotación se utiliza para inyectar valores en un componente. Se utiliza para inyectar valores como propiedades de configuración de la aplicación. Por ejemplo, el siguiente código muestra cómo se utiliza la anotación **`@Value`** para inyectar un valor en un componente:

```java
@Service
public class UserService {

    @Value("${app.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }
}
```

En el ejemplo que proporcionas, @Value("${app.name}") se utiliza para inyectar el valor de la propiedad app.name en una variable.

Por ejemplo, si en un archivo de propiedades, `aplication.properties`, se define la propiedad app.name con el valor Spring Boot Demo, entonces el valor de la variable appName será Spring Boot Demo. Como se ve a continuación:

```properties
app.name=Spring Boot Demo
```

En este ejemplo, la propiedad app.name se inyecta en la variable appName mediante la anotación @Value. Cuando Spring crea el bean de la clase MyService, lee el valor de la propiedad app.name del archivo de propiedades y lo inyecta en la variable appName.

Es importante destacar que la sintaxis ${...} dentro de la anotación @Value se utiliza para referirse al valor de una propiedad. En este caso, app.name es el nombre de la propiedad, y el valor correspondiente se busca en el archivo de propiedades o en otra fuente de configuración especificada.

- **@Configuration:** esta anotación se utiliza para indicar que una clase es una clase de configuración de Spring. Se utiliza para definir configuraciones personalizadas para la aplicación. Por ejemplo, el siguiente código muestra cómo se utiliza la anotación **`@Configuration`** para crear una clase de configuración en la aplicación:

```java
@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
```

- **@Bean:** esta anotación se utiliza para crear un bean en la aplicación. Se utiliza para crear objetos que se pueden inyectar en otros componentes. Por ejemplo, el siguiente código muestra cómo se utiliza la anotación **`@Bean`** para crear un bean en la aplicación:

```java
@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
```

- **@Qualifier:** esta anotación se utiliza para resolver la ambigüedad cuando hay más de una instancia de un tipo de componente. La anotación `@Qualifier` se utiliza en Spring para especificar un nombre o una identificación única para un bean, cuando hay varios beans del mismo tipo en la aplicación.

Por ejemplo, supongamos que tienes dos clases que implementan una misma interfaz:

```java
public interface MensajeService {
    void enviarMensaje(String mensaje);
}

@Service("sms")
public class ServicioMensajeSMS implements MensajeService {
    // implementación de los métodos de la interfaz
}

@Service("email")
public class ServicioMensajeEmail implements MensajeService {
    // implementación de los métodos de la interfaz
}
```

En este ejemplo, tenemos dos clases que implementan la interfaz MensajeService. Ambas clases están anotadas con la anotación @Service, lo que significa que Spring las considera beans. Como ambas clases implementan la misma interfaz, Spring no puede determinar cuál de las dos instancias debe inyectar en un componente que dependa de la interfaz MensajeService. En este caso, se utiliza la anotación `@Qualifier` para especificar el nombre del bean que se quiere inyectar:

```java
@Service
public class ControladorMensaje {

    private final MensajeService servicioMensaje;

    @Autowired
    public ControladorMensaje(@Qualifier("sms") MensajeService servicioMensaje) {
        this.servicioMensaje = servicioMensaje;
    }

    // métodos del controlador
}
```

De esta forma, se asegura que el bean correcto se inyecta en la dependencia correspondiente.

En resumen, la anotación @Qualifier es útil para especificar el nombre o la identificación única de un bean cuando hay varios beans del mismo tipo en la aplicación y se necesita inyectar uno en particular.

Estas son solo algunas de las anotaciones más comunes en Spring Boot. Hay muchas otras anotaciones que se pueden utilizar para personalizar el comportamiento de la aplicación.

> **Nota:** Para obtener una lista completa de las anotaciones disponibles en Spring Boot, consulta la [Guía de anotaciones de Spring Framework](https://mvitinnovaciontecnologica.wordpress.com/2020/02/06/guia-de-anotaciones-de-spring-framework/).

## Actuadores {#actuadores}
Los Actuadores en Spring Boot son un conjunto de herramientas que proporcionan información sobre el estado de la aplicación y permiten interactuar con ella durante su ejecución. Estos actuadores permiten obtener información valiosa sobre la aplicación, como el uso de la CPU, la memoria disponible, los controladores registrados, los endpoints expuestos, etc. Además, también permiten realizar ciertas acciones, como detener la aplicación, actualizar las propiedades de configuración, entre otras.

Algunos de los actuadores más comunes incluyen:

- **Actuador de salud (Health Actuator):** Este actuador proporciona información sobre el estado de salud de la aplicación. La información se expone a través de un endpoint /actuator/health y se puede personalizar para incluir información adicional. Un ejemplo

- **Actuador de información (Info Actuator):** Este actuador proporciona información general sobre la aplicación, como la versión, la descripción, el nombre, entre otros. La información se expone a través de un endpoint /actuator/info y se puede personalizar para incluir información adicional.

- **Actuador de auditoría (Audit Actuator):** Este actuador proporciona información sobre las acciones realizadas por la aplicación, como las solicitudes entrantes, las excepciones lanzadas, etc. La información se expone a través de un endpoint /actuator/auditevents.

- **Actuador de métricas (Metrics Actuator):** Este actuador proporciona información sobre las métricas de la aplicación, como el uso de la CPU, la memoria disponible, el tiempo de respuesta, entre otros. La información se expone a través de un endpoint /actuator/metrics y se puede personalizar para incluir información adicional.

- **Actuador de trazas (Trace Actuator):** Este actuador proporciona información detallada sobre las solicitudes entrantes y salientes de la aplicación, incluyendo la información de la solicitud y la respuesta. La información se expone a través de un endpoint /actuator/httptrace.

Para utilizar los actuadores en una aplicación de Spring Boot, se debe incluir la dependencia correspondiente en el archivo pom.xml o build.gradle y configurarlos en el archivo application.properties o application.yml.

### Configuración de los actuadores {#configuracion-de-los-actuadores}

Para configurar los actuadores en una aplicación de Spring Boot, se debe incluir la dependencia correspondiente en el archivo pom.xml o build.gradle y configurarlos en el archivo application.properties o application.yml.

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

Una vez que has incluido la dependencia, puedes configurar los actuadores en el archivo application.properties o application.yml. Aquí te muestro un ejemplo de configuración para habilitar los actuadores de salud, información, auditoría y métricas:

```yaml
management:
  endpoints:
    web:
      exposure:
        include: "*"
```

> **Nota:** En el ejemplo anterior, se habilitan todos los actuadores. Sin embargo, también puedes habilitarlos individualmente, como se muestra a continuación:

```yaml
management:
  endpoints:
    web:
      exposure:
        include: health,info,auditevents,metrics
```
Ahora, puedes acceder a los endpoints de los actuadores en tu aplicación. Por ejemplo, puedes acceder al endpoint de salud en http://localhost:8080/actuator/health para obtener información sobre el estado de salud de tu aplicación. Puedes acceder a otros endpoints de actuadores de la misma manera, utilizando la ruta correspondiente.

Ten en cuenta que, por defecto, los endpoints de los actuadores no están protegidos por autenticación ni autorización, por lo que cualquier persona que tenga acceso a la aplicación podrá acceder a ellos. Por lo tanto, es importante tomar medidas de seguridad adicionales, como proteger los endpoints de los actuadores con autenticación y autorización o deshabilitar los endpoints que no son necesarios.

En resumen, los Actuadores de Spring Boot son herramientas poderosas que permiten obtener información detallada sobre el estado de la aplicación y realizar ciertas acciones durante su ejecución. Su uso puede ayudar a detectar problemas de rendimiento o errores en la aplicación y a realizar ajustes necesarios para garantizar su correcto funcionamiento.