import java.util.Stack;

public class LeetCode_71 {

    public static void main(String[] args) {
        LeetCode_71 p = new LeetCode_71();
        p.simplifyPath("/home//foo/");
    }

    public String simplifyPath(String path){
        if (path.length() == 0 || path == null) return "/";
        Stack<String> stack = new Stack<>();
        String[] strs = path.split("/");
        for (int i = 0; i < strs.length; i++){
            if ("..".equals(strs[i]) && !stack.isEmpty()){
                stack.pop();
            }else if (!"".equals(strs[i]) && !".".equals(strs[i]) && !"..".equals(strs[i])){
                stack.push(strs[i]);
            }
        }
        if (stack.isEmpty()) return "/";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stack.size(); i++){
            builder.append("/" + stack.get(i));
        }
        return builder.toString();
    }
}
