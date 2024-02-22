package distance;

public class MainApplication {
    public static void main(String[] args) {
        Inputs inputs = new Inputs();
        Count count = new Count();

        inputs.unit();
        inputs.value();

        count.getValueAndUnit(inputs.getFromUnit(), inputs.getValueNumber());
    }
}
