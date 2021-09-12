import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName, double initAmount){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName,initAmount);
        }

        return false;

    }

    public boolean addTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addTransaction(customerName,amount);
        }
        return false;
    }

    public boolean listOfCustomers(String branchName,boolean showTransactions){
        Branch branch = findBranch(branchName);

        if(branchName == null){
            System.out.println("no such branch");
            return false;
        } else{
            System.out.println("Branch name: " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomerList();
            for(int i=0; i<branchCustomers.size();i++){
                System.out.println("Name: " + branchCustomers.get(i).getName());
                if(showTransactions){
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for(int j = 0; j< transactions.size();j++){
                        System.out.println("Transaction records --"+ (j+1) + ": " + transactions.get(j));
                    }
                }
            }
            return true;
        }

    }

    private Branch findBranch(String name){
        for(int i = 0; i<branches.size();i++){
            Branch checkedBranch = branches.get(i);
            if(checkedBranch.getName() == name){
                return checkedBranch;
            }
        }
        return null;
    }

}
