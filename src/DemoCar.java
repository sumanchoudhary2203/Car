//car
public class DemoCar {
    String make;
    String model;
    int year;

    DemoCar(String make, String model, int year ){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayDetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("year: " + year);

    }


    public static void main(String[] args){
        DemoCar myCar =  new DemoCar("Toyota", "Corolla", 2020);
        myCar.displayDetails();
    }

}