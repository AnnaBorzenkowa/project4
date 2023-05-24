
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetres = 1.80;
        int weightKg = 70;
        int index = service.calculate(heightMetres,weightKg);
        System.out.println(index);

    }
}