package human;

import java.time.LocalDate;

public class Human {
    public String name;
    public  int yearOfBirth;
    public String  town;
    public String job;



    public Human(String name, int yearOfBirth,String town,String job) {
if(yearOfBirth<0) {
    this.yearOfBirth = 0;
}else{
    this.yearOfBirth = yearOfBirth;
}
if(name==null){
    this.name="Информация не укзана";
}else{
    this.name = name;
}
        if(town==null){
            this.town="Информация не укзана";
        }else{
            this.town = town;
        }
        if(job==null){
            this.job="Информация не укзана";
        }else{
            this.job =job;
        }
        this. yearOfBirth =  yearOfBirth;

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", town='" + town + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    void story(){
        System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + town + ". " + " Я родился в " + " году. Я работаю на должности " + job + "." + " Будем знакомы!" );

    }

}
