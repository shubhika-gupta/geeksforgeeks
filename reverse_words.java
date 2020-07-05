//reverse words
class Reverse {

    public static void reverseWords(String sd) {

        // Your code here
        String s[]=sd.split("\\.");
        for(int i=s.length-1;i>0;i--)
        {
            System.out.print(s[i]+".");
        }
        System.out.print(s[0]);
    }
}