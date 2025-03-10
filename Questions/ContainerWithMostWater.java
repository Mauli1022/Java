public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    static int maxArea(int[] height) {
        int ans = 0;
        int s = 0 , e = height.length-1;
        while (s < e) {
            int area = (e - s) * Math.min(height[s], height[e]);
            ans = Math.max(ans,area);

            if (height[s] < height[e]) {
                s++;
            }else{
                e--;
            }
        }
        return ans;
    }
}
