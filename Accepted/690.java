// 690. Employee Importance
 
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

// DFS
class Solution {
    Map<Integer, Employee> map;
    public int getImportance(List<Employee> employees, int id) {
        int sum = 0;
        
        if(employees==null)
            return 0;
        
        map = new HashMap<>();
        for(int i=0; i<employees.size(); i++) {
            map.put(employees.get(i).id, employees.get(i));
        }
        
        if(!map.containsKey(id))
            return 0;
        
        return dfs(id);
    }
    
    public int dfs(int id) {
        Employee emp = map.get(id);
        int sum = emp.importance;
        for(int j=0; j<emp.subordinates.size(); j++) {
            sum += dfs(emp.subordinates.get(j));
        }
        
        return sum;
    }
}

/* 
Hash Map 을 오랜만에 사용해서 어려움이 있었다. 알고리즘도 중요하지만 기본적인 문법들을 더 잘 숙지해서 적재적소에 적절한 방법으로 문제를 해결해나가야 하겠다.
문제 카테고리엔 BFS 도 있었지만 아직 BFS 가 낯선 상태라 후에 BFS 문제를 주로 풀 때 다시 도전하겠다.
*/
