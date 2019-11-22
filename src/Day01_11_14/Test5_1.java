package Day01_11_14;

/**
 * @program: StudyCode
 * @description: 替换空格
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 第一种方式直接暴力方法循环，但是替代的时候会把后面的字母覆盖了，所以替换的时候要移动后面的字符，复杂度变成了O(n^2),每次移动n个
 * 有n个空格就移动n次
 * 第二种方法，从后往前移动，使用2个指针，这样就只需要复制一次，
 * 第三种方法，直接用StringBuffer在后面append
 * @author: zhangsh
 * @create: 2019-11-14 15:53
 **/
public class Test5_1 {
    public static String replaceSpace(String str){
        if(str == null){
            return null;
        }
        int oldLength = str.length();
        int spaceNum = 0;
        for (int i=0;i<oldLength;i++) {
            if(str.charAt(i) == ' '){
                spaceNum++;
            }
        }
        int newLength = str.length() + (spaceNum*2);
        int p1 = oldLength -1;
        int p2 = newLength -1;
        char[] newStr = new char[newLength];
        while(p1>=0 && p2 >= p1){
            if(str.charAt(p1) == ' '){
                newStr[p2--] = '0';
                newStr[p2--] = '2';
                newStr[p2--] = '%';
            }else {
                newStr[p2--] = str.charAt(p1);
            }
            p1--;

        }

        return new String(newStr);
    }

    public static void main(String[] args) {
       String a =  replaceSpace("We Are Happy");
        System.out.println(a);
    }
    //第三种方法
//    public static void main(String[] args) {
//        StringBuffer a =new StringBuffer("We Are Happy");
//        StringBuffer sb = new StringBuffer();
//        for(int i =0;i<a.length();i++){
//            if(a.charAt(i) == ' '){
//                sb.append("%20");
//            }else{
//                sb.append(a.charAt(i));
//            }
//        }
//        System.out.println(sb.toString());
//    }




}
