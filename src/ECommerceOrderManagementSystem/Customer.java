package ECommerceOrderManagementSystem;

public class Customer {
    private String name;
    private String email;
    private String address;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String get_contact_info(){
        return "Name: "+name+"\nEmail: "+email+"\nAddress: "+address;
    }
}
