public class Payment {
    String name;
    String amount;
    String description;
    String date;

    public Payment(String name, String amount, String description, String date) {
        this.name = name;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public String toString() {
        return "I received from " + name + " the amount of "
                + amount + " for the purpose of " + description
                + ". Date: " + date;
    }

    public static void main(String[] args) {
        Payment payment1 = new Payment("John Smith", "$1,500",
                "vehicle tax payment", "03/31/2022");
        System.out.println(payment1);

        Payment payment2 = new Payment("Camilo Moreno", "$37,200",
                "furniture purchase", "01/25/2023");
        System.out.println(payment2);

        Payment payment3 = new Payment("Michael Brown", "$19,000",
                "monthly rent", "03/12/2021");
        System.out.println(payment3);
    }
}
