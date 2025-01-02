package aug17;

public class CountWords {

    public static void main(String[] args) {

       String sentence = "Java is a programming lang";
        System.out.println(sentence);
        int count = countWords(sentence);
        System.out.println(count);


    }

    public static int countWords(String str) {

        int count =1;

        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;


    }
}
