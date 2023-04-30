package Leetcode.Strings;

public class GoalParserInterpretation_1678 {
    public static void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interpret(str));
    }
    public static String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    sb.append('o');
                }

            }
            else if(command.charAt(i)!=')'){
                sb.append(command.charAt(i));
            }
        }
        return sb.toString();
    }
}
