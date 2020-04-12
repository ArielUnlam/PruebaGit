package ar.edu.unlam.pb2.persona;

import java.time.LocalDate;

public class Persona {

	private Integer edad;
	private String nombre;
	private LocalDate fNac;
	private Integer dni;
	private String sexo;
	private Double peso;
	private Double altura;
	private String colorpelo;

	public Persona() {

	}

	public Persona(String nombre, Integer edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, Integer edad, LocalDate fNac, Integer dni, String sexo, Double peso, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.fNac = fNac;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Integer calcularIMC() {
		Double calculoMasa;
		calculoMasa = this.peso / (this.altura * this.altura);
		if (calculoMasa < 20) {
			return -1;
		}
		if (calculoMasa >= 20 && calculoMasa <= 25) {
			return 0;
		} else {
			return 1;
		}
	}

	public Boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean esMayorDeEdadLocalDate() {
		if (this.fNac.isBefore(LocalDate.of(2001, 06, 10))) {
			return true;
		} else {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public LocalDate getfNac() {
		return fNac;
	}

	public void setfNac(LocalDate fNac) {
		this.fNac = fNac;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
