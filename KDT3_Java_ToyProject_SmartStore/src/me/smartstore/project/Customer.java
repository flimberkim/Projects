package me.smartstore.project;

public class Customer implements Cloneable {

    int customerNo = 0;
    int serialNo = 0;
    String customerName = null;
    String customerID = null;
    int time = 0;
    int spend = 0;

    public Customer(String customerName, String customerID){
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public void showCustomerInfo(){
        System.out.printf(
                "No. %d => Customer{serialNO='%04d', name='%s', userID='%s', spentTime=%d, totalPay=%d}\n" + "\n" ,customerNo, serialNo, customerName, customerID, time, spend);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
