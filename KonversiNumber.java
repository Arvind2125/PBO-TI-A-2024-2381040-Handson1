public class KonversiNumber {
    public static void main(String[] args) {
        //Widening
        byte tipedataByte = 10;
        short tipedataShort = tipedataByte;
        int tipedataInt = tipedataShort;
        long tipedataLong = tipedataInt;
        float tipedataFloat = tipedataLong;
        double tipedataDouble = tipedataFloat;

        //Narrowing
        int tipedataInt2 = 128;
        byte tipedatabyte2 = (byte) tipedataInt2;
        System.out.println(tipedatabyte2);
    }
}
