class Main {
    public static void main(String[] args) {
        
        int income = 60000;
        
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        
        System.out.println(taxRate);
        
    }   
}