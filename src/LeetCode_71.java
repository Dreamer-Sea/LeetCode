import java.util.LinkedList;
import java.util.Stack;

public class LeetCode_71 {

    public static void main(String[] args) {
        LeetCode_71 p = new LeetCode_71();
        System.out.println(p.simplifyPath("/a/../../b/../c//.//"));;
    }

    public String simplifyPath(String path){
        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strs.length; i++){
            if (!stack.isEmpty() && "..".equals(strs[i]))
                stack.pop();
            else if (!"".equals(strs[i]) && !".".equals(strs[i]) && !"..".equals(strs[i]))
                stack.push(strs[i]);
        }
        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < stack.size(); i++){
            sb.append("/" + stack.get(i));
        }
        return sb.toString();
    }
}
