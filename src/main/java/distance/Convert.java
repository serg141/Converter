package distance;

public class Convert {

    public void mmToSm(int i) {
        System.out.println("Переводим милиметры в сантиметры: " + i * 0.1 + " см");
    }

    public void mmToM(int i) {
        System.out.println("Переводим милиметры в метры: " + i * 0.001 + " м");
    }

    public void smToMm(int i) {
        System.out.println("Переводим сантиметры в милиметры: " + i * 10 + " мм");
    }

    public void smToM(int i) {
        System.out.println("Переводим сантиметры в метры: " + i * 100 + " м");
    }

    public void mToMm(int i) {
        System.out.println("Переводим метры в милиметры: " + i * 1000 + " мм");
    }

    public void mToSm(int i) {
        System.out.println("Переводим метры в сантиметры: " + i * 100 + " см");
    }
}
