// 690. 

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int sum = 0;
        
        if(employees==null)
            return 0;
        
        Employee start = new Employee();
        for(int i=0; i<employees.size(); i++) {
            if(employees.get(i).id == id) {
                start = employees.get(i);
                break;
            }
        }
        sum += start.importance;
        
        /*List<Employee> sub = new List<Employee>();
        for(int j=0; j<start.subordinates.size(); j++) {
            if(start.subordinates.get(j)==id)
            sub.add();
        }*/
        
        return sum;
    }
}
