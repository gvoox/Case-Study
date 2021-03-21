public class customer extends person {
    private String address,contact;
    public customer (String cName){
        super(cName);
    }
    public void getAdd(String address){
        this.address=address;
    }
    public String getAdd(){
        return address;
    }
    public void getCon(String contact){
        this.contact=contact;
    }
    public String getCon(){
        return contact;
    }
    
}
