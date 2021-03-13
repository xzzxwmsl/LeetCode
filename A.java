public class A {
    public static void main(String[] args) {
        String s = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        System.out.println(s);
        System.out.println('a');
        if(Integer.toBinaryString(s.length()*2-1).charAt(0) == '1'){
            System.out.println('y');
        }else{
            System.out.println('n');
        }
    }
}
