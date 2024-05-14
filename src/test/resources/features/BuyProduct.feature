#language: es

Característica: Comprar un producto en la tienda virtual

  Yo como usuario
  quiero comprar un producto
  en la tienda virtual

  @ComprarProducto
  Escenario: Comprar Producto
    Dado que un usuario inicia sesion
    Cuando agrega un producto al carrito
    Y realiza el checkout
    Entonces debe visualizar un mensaje confirmando el envio del producto
