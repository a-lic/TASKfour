public class arrays {
    public static void main(String[] args) {
        int[] anArray;	        // declaration of an array of integers

        anArray = new int[15];	// creates an array of 15 integers

        // assign a value to each array element and print 
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    }
}