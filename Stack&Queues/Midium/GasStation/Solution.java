// https://leetcode.com/problems/gas-station/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int startIdx = 0;

        for(int i=0; i<n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];

            tank += gas[i] - cost[i]; // resourse left

            if(tank < 0) { // we can't start any point before this point because even if we start our cost for fuel run out
                startIdx = i + 1; // we try starting from next gas station
                tank = 0; // now out tank is empty
            }
        }

        if(totalGas < totalCost) { // if we don't have money to pay for gas then e can't complete the circuit
            return -1;
        }

        return startIdx;
    }
}