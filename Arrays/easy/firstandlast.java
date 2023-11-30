/*first and last occurance of an elements in a sorted aaray*/

class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        int count=0;
        int f=0;
        int l=0;
        // code here
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                count++;
                if(count==1)
                f=i;
            }   
            
        }
        l=count-1+f;
        
        ArrayList<Integer> sum=new ArrayList<>();
        
        if(count==0)
        {
              sum.add(-1);
              sum.add(-1);
        }
        else
        {
              sum.add(f);
        sum.add(l);
        }
        
        return sum;
    
    }
}
