# 2. Primer duplicado (Google)

Dado un listado de números `A` que contiene números enteros en el rango `[1, A.length()]`, encuentra el primer número duplicado.
En otras palabras, si hay más de un número duplicado, retorna solo aquel en que el primer duplicado del mismo su índice en el listado sea menor.
Si no existen valores duplicados, retorna `-1`.

## Ejemplo

listado: `[1, 2, 3, 4]`
resultado: `-1`

listado: `[6, 3, 7, 2, 7, 3, 9, 10, 1, 2, 4]`
resultado: `7`

> Nota: Aunque el número 3 aparece primero, es el 7 el primer duplicado.

## Hint

Regular: O(n^2)
Bien: O(nlogn)
Exelente: O(n)
