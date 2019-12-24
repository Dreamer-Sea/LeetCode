import java.util.Stack;

public class LeetCode_71 {

    public static void main(String[] args) {
        LeetCode_71 p = new LeetCode_71();
        String path = "/home/";
        System.out.println(p.simplifyPath(path));
    }

    public String simplifyPath(String path){
        if (path == null) return null;
        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strs.length; i++){
            if (!stack.isEmpty() && "..".equals(strs[i]))
                stack.pop();
            else if (!"".equals(strs[i]) && !".".equals(strs[i]) && !"..".equals(strs[i]))
                stack.push(strs[i]);

        }
        if (stack.isEmpty()) return "/";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stack.size(); i++){
            builder.append("/" + stack.get(i));
        }
        return builder.toString();
    }
}
