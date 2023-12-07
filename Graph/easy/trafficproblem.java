package Graph.easy;

public class trafficproblem {
  
    boolean solution(boolean[][] roadRegister) {
        int n = roadRegister.length;

        // Initialize arrays to store incoming and outgoing roads for each city
        int[] incomingRoads = new int[n];
        int[] outgoingRoads = new int[n];

        // Count incoming and outgoing roads for each city
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (roadRegister[i][j]) {
                    outgoingRoads[i]++;
                    incomingRoads[j]++;
                }
            }
        }

        // Check if each city has the same number of incoming and outgoing roads
        for (int i = 0; i < n; i++) {
            if (incomingRoads[i] != outgoingRoads[i]) {
                return false;
            }
        }

        // If all cities have an equal number of incoming and outgoing roads, return true
        return true;
    }



}
