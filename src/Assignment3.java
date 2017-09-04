class Assignment3{  
int id;  
String name;  
Assignment3(int id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class Emp extends Assignment3{  
float salary;  
Emp(int id,String name,float salary){  
super(id,name);//reusing parent constructor  
this.salary=salary;  
}  
void display(){System.out.println(id+" "+name+" "+salary);}  
}  
class TestSuper5{  
public static void main(String[] args){  
Emp e1=new Emp(1,"ankit",45000f);  
e1.display();  
}}  