class Solution {
    public int mostBooked(int n, int[][] meetings) {
        PriorityQueue<Integer> freeRooms = new PriorityQueue<>();
        PriorityQueue<int[]> busyRooms = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        for (int i = 0; i < n; i++) {
            freeRooms.add(i);
        }

        int[] count = new int[n];
        java.util.Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            while (!busyRooms.isEmpty() && busyRooms.peek()[0] <= start) {
                int[] finishedMeeting = busyRooms.poll();
                freeRooms.add(finishedMeeting[1]);
            }

            if (!freeRooms.isEmpty()) {
                int room = freeRooms.poll();
                busyRooms.add(new int[]{end, room});
                count[room]++;
            } else {
                int[] ongoingMeeting = busyRooms.poll();
                end += ongoingMeeting[0] - start;
                busyRooms.add(new int[]{end, ongoingMeeting[1]});
                count[ongoingMeeting[1]]++;
            }
        }

        int maxBooked = 0;
        int roomWithMaxBookings = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > maxBooked) {
                maxBooked = count[i];
                roomWithMaxBookings = i;
            }
        }

        return roomWithMaxBookings;
    }
}
