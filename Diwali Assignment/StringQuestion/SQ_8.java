public class SQ_8 {
    public static int count(String s, char c) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            // checking character in string
            if (s.charAt(i) == c)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abhisehekfulmalie";
        char c = 'e';
        System.out.println(count(str, c));
    }
}
