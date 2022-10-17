package car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", "1,7", "желтого", "2015", "в России");
        lada.specifications();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "3,0", "черный ", "2020", "в Германии");
        audi.specifications();
        Car bmw = new Car("BMW", "Z8", "3.0", "черный", "2021", "в Германии");
        bmw.specifications();
        Car kia = new Car("Kia", "Sportage 4-го поколения", "2.4", "красный", "2018", "в Южной Корее");
        kia.specifications();
        Car hyundai = new Car("Hyundai", "Avante", "1.6", "оранжевый", "2016", "в Южной Корее");
        hyundai.specifications();



    }

}
