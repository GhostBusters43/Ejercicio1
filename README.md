# DISTRIBUIDOR DE ALIMENTOS

Como programador de software se le ha asignado la función de crear una aplicación para un distribuidor de alimentos que desea calcular el total de lo que gasta cada cliente en cada venta, se debe enlistar la cantidad de productos y su respectivo precio.

*	El programa debe mostrar cada producto y su precio
*	Al final debe mostrar el total del cliente
*	No se validan datos

## Caso de Uso

Como distribuidor de alimentos busco poder enlistar la Compra y calcular el total de la venta de cada uno de mis clientes.

### Descripción del caso de uso
Actor: Distribuidor de alimentos.
Proposito: Mostrar en pantalla los productos vendidos con su respectivo precio por la cantidad puesta y el total.
Pasos para el evento:
1) El Distribuidor de alimentos ingresa los productos 
vendidos
2) Se calcula el total de lo vendido en base a:
(TotalProducto1 + TotalProducto2 + TotalProducto3 + ... TotalProducto[N])
3) Se muestra en pantalla la lista de productos con su 
respectivo precio por la cantidad puesta y el total de la venta


![](01.png)
![](02.png)
 
## Historia de Usuario

![](54.png)
![](55.png)

##  Diagrama de flujo

![](1.png)
![](2.png)
![](3.png)
![](4.png)
![](5.png)
![](6.png)


## Pseudocódigo
Algoritmo Frutas
	
	Escribir 'Digite,el,nombre,del,cliente'
	Leer Nombre
	Escribir 'Digite,la Identificacion,del,cliente'
	Leer Identificacion
	Repetir
		Repetir
			Repetir
				Repetir
					Repetir
						Repetir
							Repetir
								Escribir 'Digite,la opcion que desea utilizar'
								Escribir '1) Manzana- 5000 $'
								Escribir '2) Piña - 4500 $'
								Escribir '3) Naranja - 5000 $'
								Escribir '4) Pera - 3000 $'
								Escribir '5) Durazno - 2500 $'
								Escribir '0) Salir'
								Leer Producto
							Hasta Que Producto>-1
						Hasta Que Producto<5
						Repetir
							Si Producto <> 0 Entonces
								Escribir 'Digite la cantidad de productos'
								Leer Cantidad
								
							FinSi
						Hasta Que Cantidad>0
						Si Producto = 1 Entonces
							PrecioT = PrecioT + 5000 * Cantidad
							Precio1 = 5000 * Cantidad
							a<-a+Precio2
						FinSi
					Hasta Que Producto<> 1
					Si Producto = 2 Entonces
						PrecioT = PrecioT + 4500 * Cantidad
						Precio2 = 4500 * Cantidad
						b<-b+Precio2
					FinSi
				Hasta Que Producto<> 2
				Si Producto = 3 Entonces
					PrecioT = PrecioT + 5000 * Cantidad
					Precio3 = 5000 * Cantidad
					c<-c+Precio3
				FinSi
			Hasta Que Producto<> 3
			Si Producto = 4 Entonces
				PrecioT = PrecioT + 3000 * Cantidad
				Precio4 = 3000 * Cantidad
				d<-d+Precio4
			FinSi
		Hasta Que Producto<>4
		Si Producto = 1 Entonces
			PrecioT = PrecioT + 2500 * Cantidad
			Precio5 = 2500 * Cantidad
			e<-e+Precio5
		FinSi
		
	Hasta Que Producto<> 5
	Escribir Nombre
	Escribir Identificacion
	Escribir 'Manzanas ' Precio1
	Escribir 'Piñas " Precio2
	Escribir 'Naranjas ' Precio3
	Escribir 'Peras ' Precio4
	Escribir 'Duraznos ' Precio5
	Escribir 'Precio Total '
	Escribir PrecioT
FinAlgoritmo
