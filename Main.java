public class Main {
    public static void main(String[] args) {
        int[] buildings = {5, 3, 12, 15, 7, 6, 21};
        
        // Variable to keep track of the tallest building encountered so far
        int maxBuildingHeight = 0;
        
        // Traverse through the array of buildings
        for (int building : buildings) {
            // If current building is taller than the maximum height so far
            if (building > maxBuildingHeight) {
                System.out.println("First building the boy can see is of height: " + building);
                break; // Exit loop once the first visible building is found
            }
        }
    }
}