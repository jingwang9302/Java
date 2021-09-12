import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }

    public boolean newCustomer(String customerName, double initAmount){
        if(findCustomer(customerName)==null){
            addCustomer(new Customer(customerName,initAmount));
            return true;
        }
        return false;
    }

    public void addCustomer(Customer newCustomer){
        this.customerList.add(newCustomer);
    }

    public boolean addTransaction(String customerName, double newTransactionAmount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(newTransactionAmount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i<this.customerList.size();i++){
            Customer checkedCustomer = customerList.get(i);
            if(checkedCustomer.getName() == customerName){
                return checkedCustomer;
            }
        }
        return null;
    }

}
















