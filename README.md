1. Puse que el TipoPrenda conoce a la categoría en vez de hacer que la prenda conozca a la categoría directamente, porque asi puedo delegar comportamiento y no sumarselo a la
prenda. Si mañana me dicen que QMP decidio crear una zapatera aparte del guardarropas y quieren que los tipos de prenda de categoría calzado tengan un comportamiento en especifico, 
va a ser más fácil poner ese comportamiento en el TipoPrenda en vez de ponerlo en cada instancia de Prenda. Además no quiero que todas las prendas tengan esas responsabilidades 
específicas de los zapatos, así que por si acaso lo pongo así. Uso también composición para el TipoPrenda porque una prenda solamente puede tener un solo tipo, así también como
una sola categoría.

2. Agregue la libreria Color y use la función decode, que se fija si el color que entra por parametro se puede convertir en un color RGB válido. Uso la excepción de la librería de java
también para validar por si el usuario ingresa un color inválido. De esta forma contemplo el caso en que me ingresen cualquier cosa y evito escribir todos los colores en un enum.

3. Puse la categoría como un enum porque dentro de los requisitos me dice que las categorías son las especificadas y en el caso de que quiera agregar más, solamente las pongo en el
enum. A diferencia de los colores, las categorías son limitadas. Al hacerlas en un enum, evito que el usuario ponga cualquier cosa en el campo de caategoría.

4. La prenda la hice con un constructor. El enunciado no dice que puedo modificar los datos una vez que se ingresan así que no puse setters. Usando el patrón builder encapsulo el proceso
de instanciación de un proceso y hago que la info sea obligatoria poniendo el requireNonNull de la librería de java. Puse todos los campos como obligatorio menos el colorSecundario
porque no cuenta como obligatorio.

5. El material lo hize con un enum donde estan los posibles materiales de los que puede estar hecha la prenda. Ahí habría que poner todos los posibles materiales y una vez que están,
se usa la función getMaterial que lo que hace es recorrer el enum buscando el nombre del material pasado por parametro. Si existe, lo retorna y sino tiramos una excepcion. No hay
materiales infinitos y con esa funcion que sirve para enums me pareció más fácil validar la entrada.
