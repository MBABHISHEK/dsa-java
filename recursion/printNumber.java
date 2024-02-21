
/*this prints from 1 TO N*/
class Solution
{
  void printNumbers(int N)
  {
    if(N==0)return ;
    printNumbers(N-1);
    System.out.println(N);
    
  }
}
/*THIS PRINTS FROM N TO 1*/

class Solution
{
   void printNumbers(int N)
  {
    System.out.println(N);
    if(N==0)return ;
    printNumbers(N-1);
  }
}
