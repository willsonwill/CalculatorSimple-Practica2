/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.OperationModel;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author WILL
 */
public class CalculateSimpleTest {
    public CalculateSimpleTest() {
    }
    CalculateSimple calc=new CalculateSimple();
    
    @Test
    public void testSumar() {
        OperationModel operationModel=new OperationModel(5,4);
        int esperado=9;
        int resultado = calc.add(operationModel);
        assertEquals(esperado, resultado);
    }
    @Test
    public void testRestar() {
        OperationModel operationModel=new OperationModel(7,18);
        int esperado=-11;
        int resultado = calc.subtract(operationModel);
        assertEquals(esperado, resultado);
    }
    @Test
    public void testMultiplicar() {
        OperationModel operationModel=new OperationModel(10,10);
        int esperado=100;
        int resultado = calc.multiply(operationModel);
        assertEquals(esperado, resultado);
    }
    @Test
    public void testDividir() {
        OperationModel operationModel=new OperationModel(21,3);
        double esperado=7.0;
        double resultado = calc.divide(operationModel);
        assertEquals(esperado,resultado,0.0);
    }
    @Test
    public void testLimpiarCalculadoraSimple() {
        OperationModel operationModel=new OperationModel(5,5);
        int esperado=0 ;
        Object resultado = calc.clearSimple(operationModel);
        assertNotSame(esperado,resultado);
    }
    @Test
    public void testFactorial() {
        OperationModel operationModel=new OperationModel(6);
        int esperado=720;
        int resultado = calc.factorial(operationModel);
        assertEquals(esperado, resultado);
    }
    @Test
    public void testFibonaci() {
        OperationModel operationModel=new OperationModel(7);
        int esperado=13;
        int resultado = calc.fibonacci(operationModel);
        assertEquals(esperado, resultado);
    }
    @Test
    public void testRaizCuadrada() {
        OperationModel operationModel=new OperationModel(25);
        double esperado=5.0;
        double resultado = calc.sqrt(operationModel);
        assertEquals (esperado, resultado,0.0);
    }
    @Test
    public void testPotencia() {
        OperationModel operationModel=new OperationModel(5);
        int esperado=25;
        int resultado = calc.power(operationModel);
        assertEquals(esperado, resultado);
    }
    @Test
    public void testLimpiarCalculadoraAvanzada() {
        OperationModel operationModel=new OperationModel(5);
        int esperado=0 ;
        Object resultado = calc.clearAdvanced(operationModel);
        assertNotSame(esperado,resultado);
    }
    
}
