public class Calculator {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;
        
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "Profit is INR " + profit + "\n" +
                           "Profit Percentage is " + String.format("%.2f", profitPercentage) + "%");
    }
}
