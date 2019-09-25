public class TaxiService {
    int predict(int amountOfPlanting, int costPerKilometer, int costOfOrderForDiscount, int discountPercent, int maxDiscount, int discount, int distance) {
        int costOfOrder = amountOfPlanting + costPerKilometer * distance;

        if (costOfOrder > costOfOrderForDiscount) {
            discount = costOfOrder * discountPercent / 100;
            if (discount >= maxDiscount) {
                discount = maxDiscount;
            }
        } else {
            discount = 0;
        }

        int finalyCostOfOrder = costOfOrder - discount;
        return finalyCostOfOrder;
    }
}
