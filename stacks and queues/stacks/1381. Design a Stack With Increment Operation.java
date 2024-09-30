class CustomStack {
    int maxSize;
    int top;
    int size;
    int [] arr;

    public CustomStack(int maxSize) {
        top=-1;
        size=0;
        this.maxSize=maxSize;
        arr=new int[maxSize];
    }
    
    public void push(int x) {

        if(size==maxSize)
        {
            return;
        }
        top++;
        arr[top]=x;
        size++;
        
    }
    
    public int pop() {

        if(size==0)
        {
            return -1;
        }
        int temp=arr[top];
        top--;
        size--;
        return temp;
        
    }
    
    public void increment(int k, int val) {

        if(size==0)
        {
            return;
        }

        int i=0;
        while(i<k&&i<=top)
        {
            arr[i]+=val;
            i++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
