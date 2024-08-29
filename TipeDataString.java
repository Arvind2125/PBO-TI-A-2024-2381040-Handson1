public class TipeDataString {
    public static void main(String[] args) {
        // Perbedaan Primitive dan non primitive

        String firstname = "Arvind";
        String lastname = "Simanjuntak";

        //Concatination
       // String fullname = firstname + " " + lastname;
        String str;
        String fullname = firstname.concat(" ").concat(lastname);
        System.out.println(fullname);

    }
}
