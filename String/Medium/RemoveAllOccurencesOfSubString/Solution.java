class Solution { // using Stack
    public String removeOccurrences(String s, String part) {
        // Convert input string and part to character arrays for efficient processing
        char[] sArray = s.toCharArray();
        char[] partArray = part.toCharArray();
        
        // Using a character array as a stack to store the final processed string
        char[] resultStack = new char[sArray.length]; 

        // Pointer to track the current position in resultStack
        int stackPointer = 0;  
        
        // Store the length of the part string for quick access
        int partLength = partArray.length;  
        
        // Get the last character of 'part' (to optimize matching)
        char partEndChar = partArray[partArray.length - 1];

        // Iterate through each character in the original string 's'
        for(char currChar : sArray) {
            // Push the current character onto the "stack"
            resultStack[stackPointer++] = currChar;

            // Check if the last 'partLength' characters match 'part'
            if(currChar == partEndChar && stackPointer >= partLength) {
                int i = stackPointer - 1;  // Pointer for resultStack (last inserted char)
                int j = partLength - 1;    // Pointer for partArray (last char of part)

                // Compare last 'partLength' characters in resultStack with partArray
                while (j >= 0 && resultStack[i] == partArray[j]) {  
                    i--;
                    j--;
                }
                
                // If 'part' is found at the end, remove it by adjusting stackPointer
                if(j < 0) {
                    stackPointer = i + 1;
                }
            }
        }
        
        // Convert resultStack to a string and return only the valid portion
        return new String(resultStack, 0, stackPointer);
    }
}
