import java.util.Random;

public class Password {
    private int length;
    private String password;

    public Password() {
        this.length = 8;
        this.password = "";
    }

    public Password(int length) {
        this.length = length;
        this.password = "";
    }

    public boolean isStrong() {
        int uppercase = 0;
        int lowercase = 0;
        int numbers = 0;

        for (int i = 0; i < length; i++) {
            if ((int) password.charAt(i) > 64 && (int) password.charAt(i) < 91)
                uppercase++;

            if ((int) password.charAt(i) > 96 && (int) password.charAt(i) < 123)
                lowercase++;

            if ((int) password.charAt(i) > 47 && (int) password.charAt(i) < 58)
                numbers++;
        }

        return uppercase > 2 && lowercase > 1 && numbers > 5;
    }

    public void generatePassword() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++){
            int random2 =  random.nextInt(4 - 1) + 1;

            switch (random2) {
                case 1 -> { // Uppercase
                    int rndmay = random.nextInt(90 - 65) + 65;
                    sb.append((char) rndmay);
                }
                case 2 -> { // Lowercase
                    int rndmin = random.nextInt(122 - 98) + 98;
                    sb.append((char) rndmin);
                }
                case 3 -> { // Numbers
                    int rndnum = random.nextInt(58 - 48) + 48;
                    sb.append((char) rndnum);
                }
            }
        }
        password = sb.toString();
    }

    public String getPassword() {
        return password;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        Password[] passwords = new Password[10];
        boolean[] strong = new boolean[10];

        for (int i = 0; i < passwords.length; i++){
            passwords[i] = new Password(14);
            passwords[i].generatePassword();
            strong[i] = passwords[i].isStrong();
        }

        for (int k = 0; k < passwords.length; k++){
            System.out.print(passwords[k].getPassword() + " ");
            System.out.println(strong[k]);
        }
    }
}
