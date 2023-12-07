boolean solution(int[][] roads) {

Map<Integer, Integer> endpoints = new HashMap<>();

        for (int[] road : roads) {
            int start = road[0];
            int end = road[1];
            int name = road[2]; 
            if (endpoints.containsKey(name))
            {
                if (endpoints.get(name) == start || endpoints.get(name) == end)
                {
                    return false;
                }
            } 
            else 
            {
                endpoints.put(name, end);
            }
            if (endpoints.containsKey(name + 1)) 
            {
                if (endpoints.get(name + 1) == start || endpoints.get(name + 1) == end)
                {
                    return false;
                }
            } else
            {
                
                endpoints.put(name + 1, start);
            }
        }

        return true;

           

    }
