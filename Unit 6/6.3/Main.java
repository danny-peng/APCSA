public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4};
        String[] words = {"these", "are", "words"};
        Task[] tasks = {new Task("Read"), new Task("6.3 Enhanced for Loop for Arrays"), new Task("Write essay")};

        System.out.println("Traversing nums");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nChanging in enhanced:");
        for (int num : nums) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nnums: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.println("\nTraversing words with all 3 to show equivalence: ");
        System.out.println("While loop: ");
        int index = 0;
        while (index < words.length) {
            System.out.print(words[index] + " ");
            index++;
        }
        System.out.println();

        System.out.println("\nFor loop: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        System.out.println("\nEnhanced for loop");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println("\n");

        System.out.println("Traversing tasks");
        for (Task task : tasks) {
            System.out.println(task + ": " + task.getName() + " - " + task.isCompleted());
        }
    }
}