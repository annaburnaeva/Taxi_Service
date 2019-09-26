public class TaxiService {
    int predict(int amountOfPlanting, int costPerKilometer, int costOfOrderForDiscount, int discountPercent, int maxDiscount, int distance) {
        int costOfOrder = amountOfPlanting + costPerKilometer * distance;
        int discount = 0;
        if (costOfOrder > costOfOrderForDiscount) {
            discount = costOfOrder * discountPercent / 100;
            if (discount >= maxDiscount) {
                discount = maxDiscount;
            }
        }
        int finalyCostOfOrder = costOfOrder - discount;
        return finalyCostOfOrder;
    }
}
