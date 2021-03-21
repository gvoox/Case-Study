public class employee extends person {
    private int employeeid;
    public employee (String empName){
        super(empName);
    }
    public void getEmployeeeID(int employeeid){
        this.employeeid=employeeid;
    }
    public int getEmployeeeID(){
        return employeeid;
    }
}
