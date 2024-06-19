import java.util.ArrayList;

public class Roulette {
    private ArrayList<String> options = new ArrayList<>();

    public Roulette() { }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void addOption(String option) {
        options.add(option);
    }

    public String spin() {
        return options.get((int) (Math.random() * options.size()));
    }
}
