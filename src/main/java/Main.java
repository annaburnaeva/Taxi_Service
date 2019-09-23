public class Main {
    public static void main(String[] args) {
        TaxiService service = new TaxiService();
        int prediction = service.predict(60, 20, 1000, 5,100,0,100);
        System.out.println(prediction);
    }
}
