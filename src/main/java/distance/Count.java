package distance;

public class Count {
    Convert convert = new Convert();
    public void getValueAndUnit(int unit, int value) {
        switch (unit) {
            case 1: convert.mm(value);
            break;
            case 2: convert.sm(value);
            break;
            case 3: convert.m(value);
            break;
        }
    }
}
