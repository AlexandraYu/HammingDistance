import java.lang.*;

public class HammingDistance{
    public int findHammingDistance(int x, int y) {
        String xorResult="";
        int count=0;
        xorResult=Integer.toBinaryString(x^y); 
		//x^y means to do a bitwise xor operation
		//xor is exclusive or, meaning that two bits, when xor'ed, should return 1 if two bits are different 
		//toBinaryString will turn integer into a binary string
        for(int i=0; i<xorResult.length(); i++) { 
		//since xorResult is now a stirng of 0's and 1's as the xor'ed product of x and y, I just need to count how many 1's in this string to determine how many different bits
            if(xorResult.charAt(i) == '1') count++;  
        }
        return count; 
    }
     public static void main(String []args){
        int hammingDistance = 0;
        HammingDistance hd = new HammingDistance(); 
        hammingDistance=hd.findHammingDistance(5, 7); 
        System.out.println("Hamming Distance is: "+hammingDistance+"\n");
     }
}