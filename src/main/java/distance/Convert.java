package distance;

public class Convert {

    public void mm(int i) {
        System.out.println("Введены милиметры: " + i);
        System.out.println("Это " + (i * 0.1) + " см");
        System.out.println("Это " + (i * 0.001) + " м");
        System.out.println("Это " + (i * 0.0393701) + " дюйма");
        System.out.println("Это " + (i * 0.00328084) + " фута");
        System.out.println("Это " + (i * 0.00109361) + " ярда");
    }

    public void sm(int i) {
        System.out.println("Введены сантиметры: " + i);
        System.out.println("Это " + (i * 10) + " мм");
        System.out.println("Это " + (i * 0.01) + " м");
        System.out.println("Это " + (i * 0.393701) + " дюйма");
        System.out.println("Это " + (i * 0.0328084) + " фута");
        System.out.println("Это " + (i * 0.0109361) + " ярда");
    }

    public void m(int i) {
        System.out.println("Введены метры: " + i);
        System.out.println("Это " + (i * 1000) + " мм");
        System.out.println("Это " + (i * 100) + " см");
        System.out.println("Это " + (i * 0.001) + " км");
        System.out.println("Это " + (i * 39.3701) + " дюйма");
        System.out.println("Это " + (i * 3.28084) + " фута");
        System.out.println("Это " + (i * 1.09361) + " ярда");
        System.out.println("Это " + (i * 0.000621371) + " мили");
    }
}
