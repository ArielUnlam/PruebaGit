package ar.edu.unlam.pb2.persona;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PersonaTest {
	 
	@Test
	public void testQueCompruebeSiLaPersonaEstaEnSuPesoIdeal() {
		
		Persona persona1 = new Persona("Sampalobby", 23, LocalDate.of(1994, 5, 17), 42365891, "h", 62.5, 1.82);

		Integer valorEsperado = -1;
		
		assertEquals(valorEsperado, persona1.calcularIMC());
		
	}
	
	@Test
	public void testQueCompruebeSiLaPersonaTieneSobrepeso() {
		
		Persona persona2 = new Persona();

		persona2.setPeso(95.7);
		persona2.setAltura(1.62);
		
		Integer valorEsperado = 1;
		
		assertEquals(valorEsperado, persona2.calcularIMC());
		
	}
	
	@Test
	public void testQueCompruebeSiLaPersonaEstaPorDebajoDeSuPesoIdeal() {
		
		Persona persona3 = new Persona();

		persona3.setPeso(75.7);
		persona3.setAltura(1.92);
		
		Integer valorEsperado = 0;
		
		assertEquals(valorEsperado, persona3.calcularIMC());
		
	}
	
	@Test
	public void testQueCompruebeSiLaPersonaEsMayorDeEdad() {
		
		Persona persona4 = new Persona("Ostiamendi", 33, "H");
		
		Boolean valorEsperado = true;
		
		assertEquals(valorEsperado, persona4.esMayorDeEdad());
		
	}
	
	@Test
	public void testQueCompruebeSiLaPersonaEsMayorDeEdadLocalDate() {
		
		Persona persona4 = new Persona();
		
		persona4.setfNac(LocalDate.of(1992, 5, 21));
		
		Boolean valorEsperado = true;
		
		assertEquals(valorEsperado, persona4.esMayorDeEdadLocalDate());
		
	}
}