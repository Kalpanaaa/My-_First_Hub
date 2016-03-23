class FoundSpouseName{
 int count=0;
 int countOfCouple(Company company){
  List<Employees> emps=company.getEmployees();
  for(int i=0;i<emps.size();i++){
   Employee emp=emps.get(i);
   if(emp.isMarrid==true){
    String spouseName=getSpouseName(emp);
   }
   for(int i=0;i<emps.size();i++){
    Employee emp1=emps.get(i);
    if(emp1.getName().equals(spouseName)){
     count=count+1;
    }
   }
  }
  return count;
 }
}
