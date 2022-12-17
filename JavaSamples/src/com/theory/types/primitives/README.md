# Primitives

| Tipo    | Tamaño  | Descripción                                            |
|---------|---------|--------------------------------------------------------|
| byte    | 1 byte  | -128 a 127                                             |
| short   | 2 bytes | -32,768 a 32,767                                       |
| int     | 4 bytes | -2,147,483,648 a 2,147,483,647                         |
| long    | 8 bytes | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 |
| float   | 4 bytes | 7 decimales                                            |
| double  | 8 bytes | 15 decimales                                           |
| boolean | 1 bit   | verdadero o falso                                      |
| char    | 2 bytes | un caracter o valores ASCII                            |

## int

Permite asignar valores con "_" para una mejor lectura.

```java
int numeroCon_ = 1_000_000; // 1000000
```

## long

Permite asignar valores con "_" para una mejor lectura.
Debe ponerse la L o Java lo tratará como un int.

```java
long longDeclaration = 1_900_000L; // 1900000
```

## float

```java
float myFloatVar = 5F; // 5.0
```

## double

Permite asignar valores con exponente

```java
double doubleConExponente = 4e4; // 40000.0
double doubleConExponenteNegativo = 4e-2; // 0.04
```

## char

[Unicode](https://unicode-table.com/en/)

```java
char myCharDeclaration = 'F';
char myCharDeclarationUnicode = '\u0044'; // D
char myCharDeclarationAsNumber = 69; // E
```