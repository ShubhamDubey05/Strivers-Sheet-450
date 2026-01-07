public class Code {
  public static void main(String[] args) {
    int[] arr = {5, 9, 10, 19, 77, 8, 3, 99};
    System.out.println(find("Shubham", 'd'));
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
