package ej_streams;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Vázquez
 */
public class Estudiante {
     private String nombre, apellido;
    private int edad;
    private int dni;
    
    public Estudiante(){};
    
    public Estudiante(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomParam) {
        String nom = nomParam;
        //Condicion: Si el nombre ingresado esta vacio o es numerico, saltar el cartel de reingreso! 
        while (nom.isEmpty()) {
            nom = JOptionPane.showInputDialog("El nombre no puede ir vacío");
        }
        
        this.nombre = nom;
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre);
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        //Condicion 2: Si el apellido ingresado esta vacio o es numero, saltar el cartel de reingreso!
        if(apellido.isEmpty()){
            JOptionPane.showInputDialog(null, "Campo Apellido Obligatorio");
        }else{
                this.apellido = apellido;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed) {
        //Condicion 3: Si la edad ingresada, esta vacia o es de caracter, saltar el cartel de reingreso!
        if (ed <= 0 || ed >= 100){
        JOptionPane.showInputDialog(null, "Edad Invalida");
        }else{
            this.edad = ed;
        }
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        //Condicion 4: Si el dni ingresado, esta vacio y supera el rango d 8 numeros o es menor a 6, saltar el cartel de ingreso.
        if (dni>8 || dni<6 || dni<=0){
        JOptionPane.showInputDialog(null, "Dni máximo hasta 8 numeros");
        }else{
              this.dni = dni;
           }
        
       }
}
