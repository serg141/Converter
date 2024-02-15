package distance;

public class Count {
    Convert convert = new Convert();
    public void getValueAndUnit(int f, int t, int v) {
        if (f == 1) {
            if (t == 2) convert.mmToSm(v);
            else convert.mmToM(v);
        }
        else if (f == 2) {
            if (t == 1) convert.smToMm(v);
            else convert.smToM(v);
        }
        else if (f == 3) {
            if (t == 1) convert.mToMm(v);
            else convert.mToSm(v);
        }
    }
}
