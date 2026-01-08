public class Code {
  public static void main(String[] args) {
    int[] arr = {5, 9, 10, 19, 77, 8, 3, 99,333,1234, 34562};
    int ans = findEvenNoOfDigits(arr);
    System.out.println(ans);
  }


  public static int findEvenNoOfDigits(int [] arr){
    int ans  =0;
    for(int i =0; i<arr.length; i++){
      int  cnt  =0;
      int val = arr[i];
      while(val!=0){
        cnt++;
        val = val/10;
      }
      if(cnt%2==0) ans++;
    }
    return ans;
  }

  public static int linearSearch(int[] arr, int target) {
    if (arr.length == 0) return -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;   // return index
      }
    }
    return -1;
  }


  public static boolean find(String s, char c){
    if(s.length()  ==  0) return false;

    // for(int  i = 0; i<s.length(); i++){
    //   char ch  = s.charAt(i);
    //   if(ch == c) return true;
    // }
       for(char ch : s.toCharArray()){
        if(ch == c) return true;
       }



     return false;
  }
}
