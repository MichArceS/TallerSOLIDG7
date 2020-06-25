# TallerSOLIDG7

## Literal 1 
Observamos que las clases helado y pastel no cumplen el principio LSP debido a que se puede impleter una clase padre postre, que nos ayudaria a eliminar codigo repetido entre estas dos clases

## Literal 2
En este caso se incumple el principio DIP debido a que la clase operaciones aderezo depende de los objetos helado, donde se podria corrrejir implementado estos metodos directamente en la clase padre, postre.

## Literal 3
No cumple el principio SRP ya que podriamos crear una clase que se dedique a realizar el calculo del valor de los postres y ademas que los muestre, quitando la repeticion del codigo de helado y pastel.

## Literal 4
No cumple el principio OCP ya que para poder agregar mas aderezos se debia modificar el codigo; luego del cambio, el proyecto queda extensible para poder agregar mas subclases de aderezos.

## Literal 5
No cumple el principio ISP debido a que, primero, la clase lecheEntera puede ser una interfaz y no lo es, lo cual nos ayudaría en los otros tipos de Leche a sólo implementar la interfaz. Por tal razón nos apegamos al principio y la convertimos a interfaz con pocos métodos que es mejor a tener una interfaz con muchos métodos que no serán usados.
