package BSQuestions;
public class RotationOfArray {

    static int rotationsOfArray(int[] arr){

        int start = 0;
        int end = arr.length-1;

        // while (start<=end) {

            // find mid element
            int mid = start + (end - start)/2;
            // System.out.println(mid);

            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;
            // System.out.println(arr[next] + " " + arr[prev]);

            if (arr[mid]<=arr[prev] && arr[mid]<=arr[next]) {
                return arr[mid];
            }else if(arr[mid]<=arr[start]){
                end = mid - 1;
            }else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            
        // }

        return -1;
    }



    public static int findRotationCount(int[] nums)
    {
        // search space is nums[left…right]
        int left = 0;
        int right = nums.length - 1;
 
        // loop till the search space is exhausted
        while (left <= right)
        {
            // if the search space is already sorted, we have
            // found the minimum element (at index `left`)
            if (nums[left] <= nums[right]) {
                return left;
            }
 
            // int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;

 
            // find the next and previous element of the `mid` element
            // (in a circular manner)
            int next = (mid + 1) % nums.length;
            int prev = (mid - 1 + nums.length) % nums.length;
 
            // if the `mid` element is less than both its next and previous
            // neighbor, it is the array's minimum element
 
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }
 
            // if nums[mid…right] is sorted, and `mid` is not the minimum element,
            // then the pivot element cannot be present in nums[mid…right],
            // discard nums[mid…right] and search in the left half
 
            else if (nums[mid] <= nums[right]) {
                right = mid - 1;
            }
 
            // if nums[left…mid] is sorted, then the pivot element cannot be present
            // in it; discard nums[left…mid] and search in the right half
 
            else if (nums[mid] >= nums[left]) {
                left = mid + 1;
            }
        }
 
        // invalid input
        return -1;
    }

   public static void main(String[] args) {
    int [] arr = { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 };

    System.out.println(findRotationCount(arr));
   } 

}