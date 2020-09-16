package string.最长公共前缀;

public class Main {
    public static void main(String[] args) {
        String[] s = {"flow","flower","flo"};
        System.out.println(longestCommonPrefix(s));
    }

    private static String longestCommonPrefix(String[] strs){
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < res.length() && j < strs[i].length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            res = res.substring(0,j);
            if (res.equals("")){
                return res;
            }
        }
        return res;
    }


}
