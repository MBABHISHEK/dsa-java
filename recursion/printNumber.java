

class Solution
{
  void printNumbers(int N)
  {
    if(N==0)return ;
    printNumbers(N-1);
    System.out.println(N);
    
  }
}
