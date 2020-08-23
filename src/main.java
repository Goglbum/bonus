public class main {
    public static void main(String[] args) {
        float balance = 100;
        float transfer = 2999.9f;
        int points = 100;
        int amount = 1000;
        if (transfer >= amount){
            int bonus = (int)(float)transfer / points;
            balance = balance + bonus;
        }
        balance = balance + transfer;
        System.out.println(balance);
    }
}
