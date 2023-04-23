public class Condicionales {
    public static void main(String[] args) {
        
        // Condicionales se ejecutan con la palabra
        // reservada if
        // if (condicion) {
        //    Verdadera
        //}
        
        int edad = -5;

        if (edad >= 0 && edad < 18) {
            System.out.println("Estás en la niñez / adolescencia");
        } else if (edad >= 18 && edad < 65) {
            System.out.println("Estás en la adultez");
        } else if (edad > 65) {
            System.out.println("Estás en la vejez");
        } else {
            System.out.println("Edad errada.");
        }

        System.out.println("Proceso terminado!");

        int dia = 4;

        switch (dia) {
            case 1:
                // puede tener varias líneas
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("día no válido");
        }
    }
}
