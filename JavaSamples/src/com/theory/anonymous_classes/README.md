# Clases Anónimas

Hay clases anónimas en el mundo de Java. No tienen identificadores de nombre y permiten declarar e instanciar una clase al mismo tiempo.

## Declaración

```java
abstract class HumanThought {
    public void print() {
        System.out.println("This is a very important thought.");
    }
}
```

Esta es nuestra superclase HumanThought que tiene un método para imprimir el pensamiento estándar. Y ahora las clases anónimas nos ayudarán. Al heredar de HumanThought podemos tener tantos pensamientos diferentes como queramos, y todo sin nuevos archivos .java.
Todos los nuevos pensamientos serían hijos de nuestra superclase y tendrían su propio método print:

```java
class Human {

    public void takeMilkshake() {

        // creación de la clase anónima mediante la herencia de la clase HumanThought
        HumanThought thought = new HumanThought() {
            public void print() {
                System.out.println("What to take? Chocolate or strawberry milkshake..");
            }
        };
        thought.print();
    }
}
```

Utilización del la clase `Human` en el `main`.


```java
public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.takeMilkshake();
    }
}
```
> Imprime: "What to take? Chocolate or strawberry milkshake.."


## Clase Anónima como argumento en un Constructor

También se puede pasar una clase anónima como argumento a un constructor. En lugar de declarar una variable, se pasar la clase anónima directamente como argumento al constructor. Por ejemplo:


```java
Thread t = new Thread(new Runnable() {
    public void run() {
        System.out.println("¡Corre, Forrest, corre!");
    }
});
```

## Callbacks

También, a menudo, después de crear una instancia de una clase anónima, la pasamos a algún método como argumento. En este caso, la clase anónima se llama `callback`. Un `callback` es un trozo de código ejecutable que se pasa a otro código que lo ejecuta (realiza una llamada de vuelta) en un momento conveniente.

Consideremos un ejemplo. Hay un tipo especial de calculadora que solo puede dividir números. La calculadora toma un callback como su argumento y ejecuta el callback pasando el resultado del cálculo o un mensaje de error.

La interfaz `Callback` tiene dos métodos abstractos:

```java
interface Callback {

    /**
     * Takes a result and processes it
     */
    void calculated(int result);

    /**
     * Takes an error message
     */
    void failed(String errorMsg);
}
```

La clase `Divider` tiene solo un método estático:

```java
class Divider {

    /**
     * Divide a by b. It executes the specified callback to process results
     */
    public static void divide(int a, int b, Callback callback) {

        if (b == 0) {
            callback.failed("Division by zero!");
            return;
        }

        callback.calculated(a / b);
    }
}
```

En general, los callbacks pueden ayudar en aplicaciones grandes con múltiples partes y capas (especialmente en programas multihilos).

Llamando a un método con un callback:

```java
public class CallbacksExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Divider.divide(a, b, new Callback() { // passing callback as an argument

            @Override
            public void calculated(int result) {
                String textToPrint = String.format("%d / %d is %d", a, b, result);
                print(textToPrint);
            }

            @Override
            public void failed(String errorMsg) {
                print(errorMsg);
            }
        });
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
```

Instanciamos y pasamos el callback sin ninguna variable adicional del tipo `Callback`. Es una práctica muy común para trabajar con callbacks, especialmente si son pequeños.

El callback captura el método estático `print` y las variables locales `a` y `b` de su contexto. Las variables `a` y `b` son efectivamente finales aquí. (es decir, las variables no cambian y no necesitas escribir la palabra clave `final`).

## Restricciones en las clases anónimas

Las clases anónimas tienen algunas restricciones:

- No pueden tener inicializadores estáticos ni declaraciones de interfaz
- No pueden tener miembros estáticos, excepto las variables constantes (campos estáticos finales)
- No pueden tener constructores

Consideremos el siguiente ejemplo con una clase anónima `SpeakingEntity`. No tener inicializadores estáticos, miembros estáticos o declaraciones de interfaz no es un gran problema. ¿Pero qué pasa con no tener un constructor? ¿Cómo inicializar nuestros campos?

```java
final String robotName = "Bug";
final int robotAssemblyYear = 2112;

SpeakingEntity robot = new SpeakingEntity() {

    static final int MAGIC_CONSTANT = 10;

    private String name;
    private int assemblyYear;

    { /* bloque de inicialización de instancia para establecer campos */
        name = robotName;
        assemblyYear = robotAssemblyYear;
    }

    @Override
    public void sayHello() {
        System.out.println("1010001" + MAGIC_CONSTANT);
    }

    @Override
    public void sayBye() {
        System.out.println("0101110" + MAGIC_CONSTANT);
    }
};
```
