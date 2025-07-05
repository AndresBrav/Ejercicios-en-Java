/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.Ejercicio5;

/**
 *
 * @author Asus
 */
public class Cuadrado extends Poligono {

    public Cuadrado(double base, double altura) {
        super(base, altura); //uso el constructor padre
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }
}
