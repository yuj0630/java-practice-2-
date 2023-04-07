package sec07.exam05;

public class Employee {
    public String getFirstName(){
       return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public int getAnnualSalary(){
        return Salary * 12;
    }
    public int raiseSalary(){
        this.Salary += this.Salary * percent / 100;
        return this.Salary;
    }

    public String toString(){
        return String.format("Employee[id=%d, name=%s, salary=&d", id, getName(), salary)
    }
}
