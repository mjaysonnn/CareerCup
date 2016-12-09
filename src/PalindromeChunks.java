public class PalindromeChunks {  //time O(n)
    static int longestChunkedPalindrome(String s) {
        int chunkCount = 0;
        String left = "", right = "";
        int i = 0, j = s.length() - 1;
        while (i < j) {
            left = left + s.substring(i, i+1);
            right = right + s.substring(j, j+1);
            if (left.equals(new StringBuilder(right).reverse().toString())) {
                chunkCount += 2;
                left = "";
                right = "";
            }
            ++i;
            --j;
        }
        if ( (!left.equals("") && !right.equals("")) || i == j) // middle chunk left over
            ++chunkCount;
        return chunkCount;
    }
    public static void main(String[] args ) {
        System.out.println("VOLVO: "+longestChunkedPalindrome("VOLVO")); // 3
        System.out.println("merchant: "+longestChunkedPalindrome("merchant")); // 1
        System.out.println("ghiabcdefhelloadamhelloabcdefghi: "+longestChunkedPalindrome("ghiabcdefhelloadamhelloabcdefghi")); // 7
    }
}