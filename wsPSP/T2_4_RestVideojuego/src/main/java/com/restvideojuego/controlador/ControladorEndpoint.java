package com.restvideojuego.controlador;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restvideojuego.modelo.entidad.Videojuego;

@RestController

public class ControladorEndpoint {

	@Autowired
	private Videojuego v1;
	
	// READ (R de CRUD)
	@GetMapping("videojuego")
	public Videojuego obtenerVideojuego() {
		System.out.println("\n ~~~~ SEAN LEITCH VIDEOJUEGO CRUD CON REST (SL-VCR) ~~~~");
		System.out.println("(SL-VCR): READ VIDEOJUEGO");
		System.out.println("(SL-VCR): Ve a postman para ver los valores del videojuego");
		
		return v1;
	}
	
	// CREATE & UPDATE (C & U de CRUD)
	@PutMapping("videojuego")
	public Videojuego modificarVideojuego() {
		System.out.println("\n ~~~~ SEAN LEITCH VIDEOJUEGO CRUD CON REST (SL-VCR) ~~~~");
		System.out.println("(SL-VCR): CREATE/UPDATE VIDEOJUEGO");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el id del videojuego");
		String newIdStr = sc.nextLine();
		int newId = Integer.parseInt(newIdStr);
		
		System.out.println("Introduce el nombre del videojuego");
		String newNombre = sc.nextLine();
		
		System.out.println("Introduce el nombre de la compañia");
		String newCompania = sc.nextLine();
		
		System.out.println("Introduce el precio");
		String newPrecioStr = sc.nextLine();
		int newPrecio = Integer.parseInt(newPrecioStr);
		
		System.out.println("Introduce la puntuacion");
		String newPuntuacionStr = sc.nextLine();
		double newPuntuacion = Double.parseDouble(newPrecioStr);
		
		System.out.println("\n(SL-VCR): Ve a POSTMAN para ver los nuevos valores del videojuego");
		
		v1.setId(newId);
		v1.setNombre(newNombre);		
		v1.setCompania(newCompania);
		v1.setPrecio(newPrecio);
		v1.setPuntuacion(newPuntuacion);
		
		v1 = v1;
		
		// Envia el objeto Videojuego a POSTMAN con los nuevos valores
		return v1;
	}
	
	// DELETE (D de CRUD)
	@DeleteMapping("videojuego")
	public Videojuego borrarVideojuego() {
		System.out.println("\n ~~~~ SEAN LEITCH VIDEOJUEGO CRUD CON REST (SL-VCR) ~~~~");
		System.out.println("(SL-VCR): DELETE VIDEOJUEGO");
		
		v1.setId(0);
		v1.setNombre("");		
		v1.setCompania("");
		v1.setPrecio(0);
		v1.setPuntuacion(0);
		
		System.out.println("(SL-VCR): Los valores del videojuego han sido eliminados");

		return v1;
	}
	
}

