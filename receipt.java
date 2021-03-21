public class receipt {
    public void prints(employee emp){
        System.out.println("Staff: "+ emp.getName());
        System.out.println("Employee No: "+ emp.getEmployeeeID());
    }
    public void prints2(customer cos){
        System.out.println("Delivery to:" +cos.getName());
        System.out.println("Customer Contact no/Email: "+ cos.getCon());
        System.out.println("Customer Address: "+ cos.getAdd());
    }
}
