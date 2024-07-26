public class ContinueTransferStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 15)
            continue; // skip 15
            System.out.println(i);
        }
    }
}