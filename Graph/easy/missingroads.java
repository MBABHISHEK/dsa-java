int[][] solution(int cities, int[][] roads) {
List<int[]> result = new ArrayList<>();

        // Create a set to store existing roads for quick lookup
        Set<Set<Integer>> existingRoads = new HashSet<>();
        for (int[] road : roads) {
            existingRoads.add(new HashSet<>(Arrays.asList(road[0], road[1])));
        }

        // Iterate through all pairs of cities and add missing roads
        for (int i = 0; i < cities; i++) {
            for (int j = i + 1; j < cities; j++) {
                Set<Integer> currentRoad = new HashSet<>(Arrays.asList(i, j));
                if (!existingRoads.contains(currentRoad)) {
                    result.add(new int[]{i, j});
                }
            }
        }

        return result.toArray(new int[0][0]);
    }
