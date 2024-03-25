public class Cards {
    int cost;
    String message;

    public void setData(int inputCost, String inputMessage) {
        cost = inputCost;
        message = inputMessage;
    }

    public int getCost() {
        return cost;
    }

    public String getMessage() {
        return message;
    }
}