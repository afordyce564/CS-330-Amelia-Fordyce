public class buyingArray {
    /*
     * Store all values in an array
     * add all variables up and store them in total
     * calculate 7% of sales tax of total and save in variable called tax
     * add total and tax and output
     */
    public static void main(String [] args){
        
        double [] a = new double[4];
        

        //having trouble with putting doubles in an array
        //had to remember to declare array as an array for doubles
        //used to combining types in python lists
        //declaring variables

        a[0] = 4.95;
        a[1] = 10.99;
        a[2] = 33.65;
        a[3] = 8.97;

        double total = a[0] +a[1]+a[2]+a[3];

        double tax = total * 0.07;

        double full_total = tax + total;

        System.out.println("Total including tax: $"+ full_total );
        

        //I understand everything!

    }
}
