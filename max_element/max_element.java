public class max_element{
    public static void main(String[] args) {
        int [] arr = {3,5,7,8,65,9,80};
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
//Time Complexity : O(n)