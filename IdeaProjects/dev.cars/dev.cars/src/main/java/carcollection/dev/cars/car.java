package carcollection.dev.cars;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class car {
    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private String name;
    private int year;

    //Constructor
    public car(){}
    public car(int id, String brand,String name,int year){
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.year = year;
    }
    //Setter Methods
    public void setId(int id ){
        if (id < 0){
            System.err.println("Error: id can not be nagative");
        }else{
            this.id = id;
        }
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        if (year < 1000 ){
            System.err.println("Error: year does not exist");
        }else{
            this.year = year;
        }
    }
    ///Getter Methods
    public int getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }
    public int getYear(){
        return year;
    }
}
