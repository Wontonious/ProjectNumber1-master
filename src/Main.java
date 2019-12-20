import java.util.Scanner;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        for(int i=0;i<s.length();i++){
            String a = s.substring(i, i+1);
            if(a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u")){
                answer++;
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+3).equals("bob")){
                answer++;
            }
        }
        return answer;
    }
    //Code your solution to problem number 3 he0re
    static String problemThree(String s) {
        //your code here
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetChars = alphabet.toCharArray();
        char[] sChars = s.toCharArray();
        int check;
        StringBuilder answer = new StringBuilder();
        String save = "";
        for (int i = 0; i < s.length(); i++) {
            check = answer.length();
            for (int j = 0; j < alphabet.length(); j++) {
                if (check == 0) {
                    answer.append(sChars[i]);
                    break;
                } else if (sChars[i] == alphabetChars[j] && alphabet.indexOf(sChars[i - 1]) <= alphabet.indexOf(sChars[i])) {
                    answer.append(alphabetChars[j]);
                    break;
                }
            }
            if (check >= answer.length()) {
                if (save.length() < answer.length()) {
                    save = answer.toString();
                }
                answer.delete(0, answer.length());
                i--;
            }
        }
        if (save.length() >= answer.length()) {
            return save;
        } else {
            return answer.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;

        s = scan.nextLine();
        //Problem 1
        System.out.println(problemOne(s));
        //Problem 2
        System.out.println(problemTwo(s));
        //Problem 3
        System.out.println(problemThree(s));
    }
}
