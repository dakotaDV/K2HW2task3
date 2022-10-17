package car;

public class Car {
    String brand;
    String model;
    String engineVolume;
    String color;
    String productionYear;
    String productionCountry;

    public Car(String brand,  String model, String engineVolume, String color, int productionYear, String productionCountry) {
       if(brand==null){
           this.brand="default ";
       }else{
           this.brand = brand;
       }
        if(model==null){
            this.model="default ";
        }else{
            this.model = model;
        }
        if(productionCountry==null){
            this.productionCountry="default ";
        }else{
            this.productionCountry = productionCountry;
        }
        if(Double.compare(engineVolume, 0)==0) {
            this.engineVolume = "1,5";
        }else{
            this.engineVolume = engineVolume;
        }

        if(color==null){
            this.color="белый ";
        }else{
            this.color = color;
        }

        if(productionYear==0) {
            this.productionYear = "2000";
        }else{
            this.productionYear = productionYear;



    }
    public void  specifications(){
       System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, " + "сборка  " + productionCountry + ", " + color + " цвета, " + "объем двигателя");



    }
}