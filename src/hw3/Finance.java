package hw3;

public class Finance {
    String personName;
    String email;
    private long income;

    public void getIncome() {
        System.out.println("It's a private information");
    }

    public void setIncome(long income) {
        if(income>=0){
            this.income = income;
        }else{
            System.out.println("Income format is invalid");
        }
    }

    public double ekamtayin(){
        return this.income*0.2;
    }


}
