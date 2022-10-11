import java.util.Random;
public abstract class Person extends Hotel implements Int_Person{
    public int fine = 10;
    public int salary = 20;

    public String[] fem_name = {"Maria", "Valentina", "Amalia", "Anastasia"};
    public String[] male_name = {"Victor", "Dumitru", "Calin", "Vitalii"};
    public Random random = new Random();
    public String call = fem_name[random.nextInt(fem_name.length)];
    public String male = male_name[random.nextInt(fem_name.length)];

    public void setFine(int fine) {
        this.fine += fine;
    }

    public void speak(){
        System.out.println("My name is ___ and I'm going to be your ___");
    }

    public void bye(){
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
