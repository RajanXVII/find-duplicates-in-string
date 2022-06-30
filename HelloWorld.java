import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String test="Aaappllllle";
        int count=0;
        Map<Character,Integer> m=new HashMap();
        char[] testChars=test.toCharArray();
        for(int i=0;i<testChars.length;i++){
            if(!m.containsKey(testChars[i])){
               m.put(testChars[i],1) ;
            }else {
                 m.put(testChars[i],m.get(testChars[i])+1) ;
            }
        }
        m.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
