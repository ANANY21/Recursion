public class Linear{
  public  static void main(String[] args) {
      int target=345;
      int[]a={3,5,6,7,9,10};
      System.out.println(Search(a,target,0));

    }
    static boolean Search(int[]a,int target ,int idx){
      if(idx==a.length) return false;
      return a[idx]==target || Search(a,target,idx+1);





    }
}