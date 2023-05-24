public class BmiService {
    public int calculate(double heightMetres, int weightKg) {

        return (int) (weightKg / (heightMetres * heightMetres));



    }
}
