class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       /* int len=students.length;
        Queue<Integer> studentQueue =new LinkedList<>();
        for(int student :students)
        studentQueue.add(student);

        Stack<Integer> sandwichStack =new Stack<>();

        for(int i=len-1;i>=0;i--)
          sandwichStack.push(sandwiches[i]);

        int served=0; 

        while(!studentQueue.isEmpty() && served <studentQueue.size())
        {
            if (sandwichStack.peek().equals(studentQueue.peek())) {
                sandwichStack.pop();
                studentQueue.poll();
                served = 0;
            }
            else
            {
                studentQueue.add(studentQueue.peek());
                studentQueue.poll();
                served++;
            }
        }
        return studentQueue.size();*/
        int circleStudentCount = 0, squareStudentCount = 0;
        for (int student : students) {
            if (student == 1)
                squareStudentCount++;
            else
                circleStudentCount++;
        }
        for (int sandwich : sandwiches) {
            if (sandwich == 1) {
                if (squareStudentCount > 0)
                    squareStudentCount--;
                else
                    break;
            }
            if (sandwich == 0) {
                if (circleStudentCount > 0)
                    circleStudentCount--;
                else
                    break;
            }
        }
        return squareStudentCount + circleStudentCount;
    }
}
