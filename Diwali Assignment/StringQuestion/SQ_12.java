public class SQ_12 {
    public static void main(String[] args) {
        String str = "Java is Great";
         
        // Trim the given string
        str = str.trim();
         
        // Replace All space (unicode is \\s) to %20
        str = str.replaceAll(" ", "%20");
         
        // Display the result
        System.out.println(str);
    }
}
