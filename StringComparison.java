public class StringComparison {
    public static void main(String[] args) {
        int datasetNumber = 1000000;
        String string = "hello";

        // String Buffer
        long startTimeBuffer = System.nanoTime();

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < datasetNumber; i++) {
            stringBuffer.append(string);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = (endTimeBuffer - startTimeBuffer);

        // StringBuilder
        long startTimeBuilder = System.nanoTime();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < datasetNumber; i++) {
            stringBuilder.append(string);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = (endTimeBuilder - startTimeBuilder);

        System.out.println("StringBuffer concatenation time: " + durationBuffer + " nanoseconds");
        System.out.println("StringBuilder concatenation time: " + durationBuilder + " nanoseconds");

        if(durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster.");
        }
        else {
            System.out.println("StringBuffer is faster.");
        }
    }
}

/*
Input:
    int datasetNumber = 1000000;
    String string = "hello";
Output:
    StringBuffer concatenation time: 37464700 nanoseconds
    StringBuilder concatenation time: 17357500 nanoseconds
    StringBuilder is faster.
*/