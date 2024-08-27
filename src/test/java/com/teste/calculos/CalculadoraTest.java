package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	void testSum() {
		//Arange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, "Não gerou o valor certo");
		
	}
	@Test
	@DisplayName("Teste da subtração")
	void testSub() {
		//Arange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 3D;
		double esperado = 2D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, "Não gerou o valor certo");
		
	}
	@Test
	@DisplayName("Teste de divisão")
	void testDiv() {
		//Arange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 1D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, "Não gerou o valor certo");
		
	}
	@Test
	@DisplayName("Teste da multiplicação")
	void testMult() {
		//Arange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 3D;
		double esperado = 15D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, "Não gerou o valor certo");
		
	}
}
