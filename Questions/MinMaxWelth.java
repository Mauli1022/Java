// que number 1672
public record MinMaxWelth() {
    public static void main(String[] args) {
        int [][] nums = {
            {1,2,3},
            {3,2,1},
        };
        System.out.println(maximumWealth(nums));
    }
    static int maximumWealth(int[][] accounts) {
        // row(person)
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            // columns(account)
            // when we start a column
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            // now we hava sum of accounts of person
            // check with with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
