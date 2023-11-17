package ec.edu.ups.practica.dos.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("REGISTRO DE USUARIO");
		System.out.println("Ingrese su CI: ");
		String cedulaIdentificacion = s.next();
		System.out.println("Ingrese su nombre: ");
		String nombre = s.next();
		System.out.println("Ingrese su apellido: ");
		String apellido = s.next();
		System.out.println("Ingrese su edad: ");
		int edad = s.nextInt();

		Usuario uno = new Usuario();
		uno.registrarUsuario(cedulaIdentificacion, nombre, apellido, edad);
		
		
		

		ArrayList<String> ropa1 = new ArrayList<>();
		int ropaP1 = 50;
		ropa1.add("Producto # 1 " + "\nCasaca | " + "Marca: Adidas | " + "Talla: M | " + "Color: Blanco | " + "Precio: " + ropaP1);
		
		ArrayList<String> ropa2 = new ArrayList<>();
		int ropaP2 = 35;
		ropa2.add("Producto # 2 " + "\nCamiseta | " + "Marca: Tommy Hilfiger | " + "Talla: S | " + "Color: Verde | " + "Precio: " + ropaP2);

		ArrayList<String> ropa3 = new ArrayList<>();
		int ropaP3 = 125;
		ropa3.add("Producto # 3 " + "\nZapatos | " + "Marca: New Balance | " + "Talla: 40 | " + "Color: Rojo | " + "Precio: " + ropaP3);

		ArrayList<String> ropa4 = new ArrayList<>();
		int ropaP4 = 65;
		ropa4.add("Producto # 4 " + "\nPantalon | " + "Marca: Calvin Klein | " + "Talla: 38 | " + "Color: Blue Jean | " + "Precio: " + ropaP4);

		ArrayList<String> elec1 = new ArrayList<>();
		int elecP1 = 600;
		elec1.add("Producto # 1 " + "\nLaptop | " + "Marca: HP | " + "Modelo: Pavillion x360 | " + "Color: Rojo | " + "Precio: " + elecP1);
		
		ArrayList<String> elec2 = new ArrayList<>();
		int elecP2 = 1100;
		elec2.add("Producto # 2 " + "\nCamara | " + "Marca: Hilook | " + "Modelo: A7s | " + "Color: Negro | " + "Precio: " + elecP2);
		
		ArrayList<String> elec3 = new ArrayList<>();
		int elecP3 = 350;
		elec3.add("Producto # 3 " + "\nAudifonos | " + "Marca: Sony | " + "Modelo: 1000 Xm4 | " + "Color: Beige | " + "Precio: " + elecP3);
		
		ArrayList<String> elec4 = new ArrayList<>();
		int elecP4 = 400;
		elec4.add("Producto # 4 " + "\nMac mini | " + "Marca: Apple | " + "Modelo: m2 pro | " + "Color: Space Gray | " + "Precio: " + elecP4);
		
//		Carrito carr = new Carrito();
		System.out.println("Hola "+nombre+"!");
		Integer opcion = 0;
		ArrayList<Object> agre = new ArrayList<>();
		ArrayList<Integer> total = new ArrayList<>();


			while (!opcion.equals(6)) {
		            // Imprime el menú
		            System.out.println("==================================");
		            System.out.println("1. Comprar articulos de vestimenta");
		            System.out.println("2. Comparar articulos electronicos");
		            System.out.println("3. Mostrar articulos en el carrito");
		            System.out.println("4. Valor Total a Pagar");
		            System.out.println("5. Realizar el pedido");
		            System.out.println("6. Salir");
		            System.out.println("===================================");
		            
		            // Pide al usuario que ingrese una opción
		            System.out.print("Ingresa tu elección: ");
		            opcion = s.nextInt();
		            //creamos un switch case para cada caso posible
		            s.nextLine();
		            switch (opcion) {
		            	
		                case 1 :
		                    System.out.println(ropa1);
		        			System.out.println(ropa2);
		        			System.out.println(ropa3);
		        			System.out.println(ropa4);
		        			System.out.println("Seleccione que producto desea comprar: ");
		        			int k  = s.nextInt();
		        			if (k == 1) {
		        				agre.add(ropa1);
		        				total.add(ropaP1);
		        			}else if (k == 2) {
		        				agre.add(ropa2);
		        				total.add(ropaP2);
		        			}else if (k == 3) {
		        				agre.add(ropa3);
		        				total.add(ropaP3);
		        			}else if (k == 4) {
		        				agre.add(ropa4);
		        				total.add(ropaP4);
		        			}else {
		        				System.out.println("Producto no encontrado :(");
		        			}
		                    System.out.println("El producto se agrego al carrito con exito");
		                    break;
		                    
		                case 2:
		                	System.out.println(elec1);
		        			System.out.println(elec2);
		        			System.out.println(elec3);
		        			System.out.println(elec4);
		        			System.out.println("Seleccione que producto desea comprar: ");
		        			int j  = s.nextInt();
		        			if (j == 1) {
		        				agre.add(elec1);
		        				total.add(elecP1);
		        			}else if (j == 2) {
		        				agre.add(elec2);
		        				total.add(elecP2);
		        			}else if (j == 3) {
		        				agre.add(elec3);
		        				total.add(elecP3);
		        			}else if (j == 4) {
		        				agre.add(elec4);
		        				total.add(elecP4);
		        			}else {
		        				System.out.println("Producto no encontrado :(");
		        			}
		        		
		                    System.out.println("El producto se agrego al carrito con exito");
		                    break;
		                    
		                case 3:
		                	System.out.println(agre);
		                    break;
		                    
		                case 4:
		         
                	        // Inicializar una variable para almacenar la suma
                	        int suma = 0;

                	        // Utilizar un bucle for para sumar los números del array
                	        for (int i = 0; i < total.size(); i++) {
                	            suma += total.get(i);
                	        }
		                	
		                    System.out.println(total);
		                    
                	        System.out.println("El valor total de la compra es: " + suma);

		                    break;
		                    
		                case 5:
		                    System.out.println("Tu pedido se ha realizado con exito!");
		                    break;
		                    
		                case 6:
		                    System.out.println("Gracias por usar!");
		                    break;
		                    
		                default:
		                    System.out.println("Opción no válida. Inténtalo de nuevo.");
		                    break;
		            }
		        }
			s.close();
		  }				    		
	}	

