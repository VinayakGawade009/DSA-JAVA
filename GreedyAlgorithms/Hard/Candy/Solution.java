// https://leetcode.com/problems/candy/
// https://www.youtube.com/watch?si=EjmuXZJNLQLUkEd7&v=IIqVFvKE6RY&feature=youtu.be

class Solution {
    public int candy(int[] ratings) {// TC: O(N) && SC: O(1)
        int n = ratings.length;
        int sum = 1;
        int i = 1;

        while(i < n) {
            if(ratings[i] == ratings[i - 1]) {
                sum++;
                i++;
                continue;
            }

            int peak = 1;
            while(i < n && ratings[i] > ratings[i - 1]) {
                peak++;
                sum += peak;
                i++;
            }

            int down = 1;
            while(i < n && ratings[i] < ratings[i - 1]) {
                sum += down;
                i++;
                down++;
            }

            if (down > peak) {
                sum += down - peak;
            }
        }

        return sum;
    }
}







// class Solution { // TC: O(2N) && SC: O(N)
//     public int candy(int[] ratings) {
//         if(ratings.length == 1) {
//             return 1;
//         }
        
//         int[] left = new int[ratings.length];

//         left[0] = 1;

//         for(int i = 1; i<ratings.length; i++) {
//             if(ratings[i] > ratings[i-1]) {
//                 left[i] = left[i-1] + 1;
//             } else {
//                 left[i] = 1;
//             }
//         }

//         int ans = 0;

//         int curr = 1;
//         int right = 1;

//         ans += Math.max(1, left[ratings.length - 1]);

//         for(int i = ratings.length - 2; i >= 0; i--) {
//             if(ratings[i] > ratings[i+1]) {
//                 curr += 1;
//                 right = curr;
//             } else {
//                 curr = 1;
//             }

//             ans += Math.max(curr, left[i]);
//         }


     

//         return ans;
//     }
// }








// class Solution {// TC: O(3N) && SC: O(2N)
//     public int candy(int[] ratings) {
//         if(ratings.length == 1) {
//             return 1;
//         }
        
//         int[] left = new int[ratings.length];
//         int[] right = new int[ratings.length];

//         left[0] = 1;
//         right[ratings.length - 1] = 1;

//         for(int i = 1; i<ratings.length; i++) {
//             if(ratings[i] > ratings[i-1]) {
//                 left[i] = left[i-1] + 1;
//             } else {
//                 left[i] = 1;
//             }
//         }

//         for(int i = ratings.length - 2; i >= 0; i--) {
//             if(ratings[i] > ratings[i+1]) {
//                 right[i] = right[i+1] + 1;
//             } else {
//                 right[i] = 1;
//             }
//         }

//         int ans = 0;

//         for(int i = 0; i<ratings.length; i++){
//             ans += Math.max(left[i], right[i]);
//         }

//         return ans;
//     }
// }