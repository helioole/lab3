import java.util.Random;
public abstract class Person extends Guest implements Int_Person{
    static int fine = 10;
    public int salary = 20;
    public String[] fem_name = {
            "Maria", "Valentina", "Amalia",
            "Anastasia", "Natalia", "Andrea",
            "Sofia", "Felicia"};
    public String[] male_name = {"Victor", "Dumitru", "Calin",
            "Vitalii", "Sergiu", "Andrei",
            "Maxim", "Igor"};
    public Random random = new Random();
    public String call = fem_name[random.nextInt(fem_name.length)];
    public String male = male_name[random.nextInt(fem_name.length)];

    public static void setFine(int fine) {
        Person.fine += fine;
    }
    public void speak(){
        System.out.println("My name is ___ and I'm going to be your ___");
    }

    public void reply(){
        System.out.println("Thank you for visiting our hotel");
    }

    public void feedback(){
        if(review > 3){
            System.out.printf("%sA good place to stay at!", guest);
            System.out.println();
        }
        else{
            System.out.printf("%sSuch a terrible place!", feedback);
            System.out.println();
        }
    }

    public void taxes(){
        System.out.printf("%sStaff was fined on", feedback);
        System.out.println();
    }
}
