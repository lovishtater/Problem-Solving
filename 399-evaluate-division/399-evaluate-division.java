class Solution {
    
    Set<String> visited;
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        Map<String, Map<String, Double>> equ = new HashMap<>();
        double[] ans = new double[queries.size()];
        
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String a = equation.get(0);
            String b = equation.get(1);
            Map<String, Double> curMap = equ.getOrDefault(a, new HashMap<>());
            curMap.put(b, values[i]);
            equ.put(a, curMap);
            
            curMap = equ.getOrDefault(b, new HashMap<>());
            curMap.put(a, 1 / values[i]);
            equ.put(b, curMap);
        }
        
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String a = query.get(0);
            String b = query.get(1);
            visited = new HashSet<>();
            Double mul = 1.0;
            
            ans[i] = dfs(a, b, equ, 1.0);
        }
        return ans;
    }
    
    private double dfs(String start, String end, Map<String, Map<String, Double>> equ, double ans) {
        if (!equ.containsKey(start))  return -1.0;
        if (start.equals(end))  return ans;
        
        visited.add(start);
        Map<String, Double> curMap = equ.getOrDefault(start, new HashMap<>());
        for (String key : curMap.keySet()) {
            if (!visited.contains(key)) {
                double res = dfs(key, end, equ, ans * curMap.get(key));
                if (res != -1.0) {
                    return res;
                }
            }
        }
        return -1.0;
    }
}