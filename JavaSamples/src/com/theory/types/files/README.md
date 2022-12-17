# File

Un archivo es una colección de datos que se almacena en un disco o en otro dispositivo y que se puede manipular como una unidad cuando se le da su nombre. Los archivos se pueden organizar en directorios que actúan como carpetas para otros archivos y directorios.

## La clase `File`
Hay una clase llamada `File` en el paquete `java.io`. Un objeto de esta clase representa un archivo o directorio existente o no existente. La clase se puede usar para manipular archivos y directorios: crear, eliminar, acceder a las propiedades y más.

La manera más sencilla de crear un objeto de archivo es pasar una ruta de cadena a su constructor. El formato válido de la cadena depende del sistema operativo:

- Windows usa barras inclinadas para las rutas (''),
- Linux, OS X, Android y otros sistemas UNIX usan la barra diagonal ('/').

Debe tener en cuenta esta diferencia al trabajar con archivos.

Si su sistema operativo es Windows, no olvide usar el carácter de escape `\`.

Creemos dos objetos de la clase File para diferentes plataformas.

```java
File fileOnUnix = new File("/home/username/Documents"); // un directorio en un sistema UNIX
File fileOnWin = new File("D:\Materials\java-materials.pdf"); // un archivo en Windows
```

El código funcionará incluso si un archivo o directorio no existe realmente en su sistema de archivos. No crea un nuevo archivo o directorio. Simplemente representa "un archivo virtual" o directorio que ya existe o puede crearse en el futuro.

Para mostrar el carácter que separa la ruta de un archivo, puede imprimir lo siguiente:

```java
System.out.println(File.separator); // '/' - para Linux
```
Los objetos de la clase `File` son inmutables; es decir, una vez creados, el nombre de ruta abstracto representado por un objeto nunca cambiará.

## Ruta absoluta y relativa
Una ruta es absoluta si comienza con el elemento raíz del sistema de archivos. Tiene la información completa sobre la ubicación del archivo incluyendo el tipo del sistema operativo.

> Se considera una mala práctica ubicar un archivo usando su ruta absoluta dentro de sus programas, ya que perderá la capacidad de reutilizar su programa en diferentes plataformas.

Una ruta relativa es una ruta que no incluye la ruta raiz del sistema de archivos, sino que incluye la ruta desde el directorio de trabajo. Esta ruta se representa con un `.`. 

```java
File fileOnUnix = new File("./images/picture.jpg");
File fileOnWin = new File(".\\images\\picture.jpg");
```

Para acceder al directorio "padre", debe utilizar `..`. Por ejemplo `../picture.jpg` es un archivo situado en el directorio "padre" del directorio de trabajo,

## Ejemplo de métodos
El método `File.exists()` devuelve un valor `boolean` que indica si el archivo o directorio representado por el objeto `File` existe en el sistema de archivos. Por ejemplo:

```java
File file = new File("/home/username/Documents/myfile.txt");
if (file.exists()) {
    System.out.println("El archivo existe");
} else {
    System.out.println("El archivo no existe");
}
```

El método `File.isFile()` devuelve un valor `boolean` que indica si el objeto `File` representa un archivo (y no un directorio). Por ejemplo:

```java
File file = new File("/home/username/Documents/myfile.txt");
if (file.isFile()) {
    System.out.println("Es un archivo");
} else {
    System.out.println("No es un archivo");
}
```

El método `File.isDirectory()` funciona de manera similar, pero indica si el objeto `File` representa un directorio (y no un archivo). Por ejemplo:

```java
File file = new File("/home/username/Documents");
if (file.isDirectory()) {
    System.out.println("Es un directorio");
} else {
    System.out.println("No es un directorio");
}
```

El método `File.createNewFile()` intenta crear un nuevo archivo en el sistema de archivos, usando el `path` especificado en el objeto `File`. Este método devuelve un valor `boolean` que indica si se pudo crear el archivo o no. Por ejemplo:

```java
File file = new File("/home/username/Documents/myfile.txt");
if (file.createNewFile()) {
    System.out.println("Se ha creado el archivo");
} else {
    System.out.println("No se ha podido crear el archivo");
}
```

El método `File.mkdir()` intenta crear un nuevo directorio en el sistema de archivos, usando el `path` especificado en el objeto `File`. Este método devuelve un valor `boolean` que indica si se pudo crear el directorio o no. Por ejemplo:

```java
File file = new File("/home/username/Documents/mydir");
if (file.mkdir()) {
    System.out.println("Se ha creado el directorio");
} else {
    System.out.println("No se ha podido crear el directorio");
}
```

El método `File.delete()` intenta eliminar el archivo o directorio representado por el objeto `File`. Este método devuelve un valor `boolean` que indica si se pudo eliminar el archivo o directorio o no. Por ejemplo:

```java
File file = new File("/home/username/Documents/myfile.txt");
if (file.delete()) {
    System.out.println("Se ha eliminado el archivo");
} else {
    System.out.println("No se ha podido eliminar el archivo");
}
```

El método `File.separator` devuelve el caracter que se utiliza para separar los elementos en una ruta de archivo. Por ejemplo, en sistemas operativos Windows, el caracter de separación es la barra invertida (\), mientras que en sistemas operativos UNIX y sus derivados, el caracter de separación es la barra diagonal (/). Este método es útil para construir rutas de archivo de forma independiente del sistema operativo donde se ejecuta el programa. A continuación se muestra un ejemplo de uso:

```java
File fileOnUnix = new File("./" + File.separator + "images" + File.separator + "picture.jpg");
File fileOnWin = new File(".\\images\\picture.jpg");
```

En el ejemplo anterior, se crean dos objetos `File` que representan un archivo llamado `picture.jpg` ubicado en la carpeta `images` dentro del directorio de trabajo. La ruta de acceso al archivo se construye de forma diferente en cada caso, pero en ambos casos se utiliza el caracter de separación correspondiente al sistema operativo en el que se ejecuta el programa.