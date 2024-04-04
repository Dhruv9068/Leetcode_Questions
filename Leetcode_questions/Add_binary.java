package Leetcode_questions;

public class Add_binary {
    public static void main(String[] args) {
      String a = "001";
      String b = "110";
        System.out.println(addBinary(a,b));
    }
    static String addBinary(String a, String b) {

        //  if(a.equals("0")) return b;
        // if(b.equals("0")) return a;
//        BigInteger num1 = new BigInteger(a, 2);
//         BigInteger num2 = new BigInteger(b, 2);
//         BigInteger sum = num1.add(num2);

//         return sum.toString(2);

        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j =b.length()-1;
        int carry =0;

        while(i>=0 || j >=0){
            int sum =carry;
            if(i >= 0 ) sum += a.charAt(i) -'0';
            if(j >= 0 ) sum += b.charAt(j) -'0';
            sb.append(sum %2);
            carry = sum /2;

            i--;
            j--;

        }

        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();


    }
}
