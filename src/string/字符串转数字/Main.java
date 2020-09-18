package string.字符串转数字;

public class Main {
    public static void main(String[] args) {
        String s = "   -1 234   ";
        System.out.println(str2Int(s));
    }

    private static int str2Int(String str){
        String s = str.trim();
        char[] chars = s.toCharArray();
        int res = 0;
        int i = 0;
        boolean flag = false;
        if (chars[i] == '-'){
            flag = true;
            i++;
        }else if (chars[i] == '+'){
            i++;
        }else if (!Character.isDigit(chars[i])){
            return 0;
        }
        for (;i < chars.length && Character.isDigit(chars[i]);++i){
            int k = chars[i] - '0';
            if (res  > (Integer.MAX_VALUE - k) / 10){
                return 0;
            }
            res = k + res * 10;
        }
        return flag == true ? -res:res;
    }
}
