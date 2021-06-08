import java.util.*;
public class validanagram {
    public boolean isAnagram(String s, String t) {
    char[] c1 = s.toCharArray();
    char[] c2 = t.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    
    String str1 = new String(c1);
    String str2 = new String(c2);
    
    if(str1.equals(str2)){
        return true;
    }
    return false;
}
public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    String s1=io.nextLine();
    String s2=io.nextLine();
    validanagram s=new validanagram();
    System.out.println(s.isAnagram(s1,s2));
    io.close();
}
}
