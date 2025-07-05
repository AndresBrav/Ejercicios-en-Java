/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.Ejercicio5;

/**
 *
 * @author Asus
 */
public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double CalcularArea() {
        return (base * altura) / 2;
    }
}
