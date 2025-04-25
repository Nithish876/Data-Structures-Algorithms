class BubbleSort{
  
    public void Sort(int[] val){
        int n = val.length; 
        for(int i = 0 ; i < n ; i++){
            for(int j=0 ; j < n - 1 - i ; j++){
                if(val[j] > val[j+1] ){
                    // swap 
                    int temp=val[j];
                    val[j]  = val[j+1];
                    val[j+1] = temp;
                }
            }
        }
    }
    
}

public class Bubbly{
    public static void main(String[] args){
        BubbleSort Sorter = new BubbleSort();
        int[] myarr = new int[]{1,25,5,63,96,345};
        Sorter.Sort(myarr);
        
        for(int i =0;i<myarr.length;i++){
            System.out.print(myarr[i] + " ");
        }
    }
}
