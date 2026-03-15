public class Sorted{
  public   static void main(String[] args) {

int []a={1,5,3,4,5};
System.out.println(sort(a,0));
    }
    static boolean sort(int[]a,int index){
      int n=a.length;
      if(index==a.length-1) return true;

        return a[index] <a[index+1] && sort(a,index+1);
    }

}