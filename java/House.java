public class House {
    String address;
    int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("Building a new House with " + numberOfFloors + " floors in " + address);
    }


}

    /*create a class called House that has 3 instance variables:
        a string address
        an int numberOfFloors
        define a constructor method for House that will print in console a message as soon as a House object is created
        define a testing class (e.g. Tester, Start or another reasonable name you prefer) with a main method where:
        you declare two House variables house1 and house2
        you create two House objects and assign them to the variables house1 and house2*/
