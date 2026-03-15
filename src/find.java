import java.util.ArrayList;

public class find{
   public static void main(String[] args) {
int []a={1,2,3,5,5,6,7};
int target=5;
       System.out.println(findAll(a,target,0));


    }
    static ArrayList<Integer> findAll(int[]a,int target,int index){
       ArrayList<Integer> list=new ArrayList<>();
       if(index==a.length) return list;
       if(a[index]==target){
           list.add(index);

       }
       ArrayList<Integer> ansFromBelowCalls=findAll(a,target,index+1);
       list.addAll(ansFromBelowCalls);

return list;

    }

}