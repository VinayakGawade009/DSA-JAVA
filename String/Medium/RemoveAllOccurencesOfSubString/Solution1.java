class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        
        while (sb.indexOf(part) != -1) { // Keep removing until part is gone
            int index = sb.indexOf(part);
            sb.delete(index, index + part.length()); // Remove the occurrence
        }
        
        return sb.toString();
    }
}