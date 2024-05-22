public class array {
    public static void main(String[] args) {
        // Declare a 3D array with 3 "layers"
        int three[][][] = new int[3][][];

        // Initialize each layer with different dimensions
        three[0] = new int[2][3]; // First layer: 2 rows, 3 columns
        three[1] = new int[3][2]; // Second layer: 3 rows, 2 columns
        three[2] = new int[4][2]; // Third layer: 4 rows, 2 columns

        // Iterate through each layer of the 3D array
        for (int i = 0; i < three.length; i++) {
            // Iterate through each row in the current layer
            for (int j = 0; j < three[i].length; j++) {
                // Iterate through each column in the current row
                for (int k = 0; k < three[i][j].length; k++) {
                    // Assign a random integer between 0 and 9 to the current element
                    three[i][j][k] = (int)(Math.random() * 10);
                    // Print the current element
                    System.err.print(three[i][j][k] + " ");
                }
                // Print a new line after each row
                System.out.println();
            }
            // Print a new line after each layer for better readability
            System.out.println();
        }
    }
}
