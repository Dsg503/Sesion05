package adsa;

public class Ejercicio3 {

    public String diaSemana(int dia) {
        if(dia == 1) {
            return "Lunes";
        }
        else if (dia == 2) {
            return "Martes";
        }
        else if(dia == 3) {
            return "Miercoles";
        }
        else if(dia == 4) {
            return "Jueves";
        }
        else if(dia == 5) {
            return "Viernes";
        }
        else if(dia == 6) {
            return "Sabado";
        }
        else if(dia == 7) {
            return "Domingo";
        }
        else
            return "ERROR";
    }


}
