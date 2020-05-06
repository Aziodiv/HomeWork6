public class HomeWork6_car {
//------------Lesson 6:------------
//1. Read: Ekkel_RUS: 70-85
//2. Sozdaite Class Car u kotorogo budet cena, god vypuska, ves, cvet, proizvoditel;
//- u Classa doljen byt konstructor na vse parametry;
//- vmain sozdaite 5-6 objectov classa Car, soberite ih v massiv;
//- raspecataite vsjy informacijy (cena, god vypuska, ves, cvet, proizvoditel) dlja samogo dorogogo avtomobilja;
//- raspecataite vsjy informacijy (cena, god vypuska, ves, cvet, proizvoditel) dlja samogo starogo avtomobilja;

    public static void main(String[] args) {

        Car car1 = new Car(2000, "red", 7000, "Volvo", 2000);
        Car car2 = new Car(2005, "blue", 9000, "Audi", 1800);
        Car car3 = new Car(2019, "black", 12000, "Opel", 1600);
        Car car4 = new Car(2012, "yellow", 8000, "Mazda", 1300);
        Car car5 = new Car(2005, "green", 3000, "Ford", 1900);
        Car[] salon = {car1, car2, car3, car4, car5};
        getMaxCostCar(salon);
        getOldestcar(salon);


    }


    public static Car getMaxCostCar(Car[] salon) {
        int maxCostIndex = 0;
        for (int i = 1; i < salon.length; i++) {
            Car maxCostCar = salon[maxCostIndex];//max stoimost
            Car current = salon[i];//tekuwaja mawina
            if (current.price > maxCostCar.price) {
                maxCostIndex = i;
            }
        }
        Car maxPriceCar = salon[maxCostIndex];
        System.out.print("Samii dorogoi avtomobil===>>  " + maxPriceCar.manufacturer);
        System.out.print(", Ego Cena===> " + maxPriceCar.price);
        System.out.println(".- Euro");
        System.out.println("cvet:   " + maxPriceCar.color);

        return maxPriceCar;

    }

    public static Car getOldestcar(Car[] salon) {
        int oldestCarIndex = 0;
        for (int i1 = 1; i1 < salon.length; i1++) {
            Car oldestCar = salon[oldestCarIndex];//
            Car current = salon[i1];
            if (current.year < oldestCar.year) {
                oldestCarIndex = i1;
            }

        }
        Car result = salon[oldestCarIndex];
        System.out.println("samaja staraja mawina  " + result.year);
        return result;

    }

}
