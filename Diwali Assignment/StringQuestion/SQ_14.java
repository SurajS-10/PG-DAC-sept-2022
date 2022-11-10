public class SQ_14 {
    public static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
 
    public static String reverse_words(String s)
    {
        int left = 0, i = 0, n = s.length();
 
        while (s.charAt(i) == ' ')
            i++;
 
        left = i;
 
        while (i < n) {
            if (i + 1 == n || s.charAt(i) == ' ') {
                int j = i - 1;
                if (i + 1 == n)
                    j++;
 
                while (left < j)
                    s = swap(s, left++, j--);
 
                left = i + 1;
            }
            if (i > left && s.charAt(left) == ' ')
                left = i;
 
            i++;
        }
        // Use StringBuilder ".reverse()" method to reverse
        // the whole string.
        s = new StringBuilder(s).reverse().toString();
        return s;
    }
    
    public static void main(String[] args)
    {
        String str
            = "Be a game changer the world is already full of players";
        str = reverse_words(str);
        System.out.println(str);
    }
}

