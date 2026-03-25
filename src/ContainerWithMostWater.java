public class ContainerWithMostWater {
    public static void main(String[] args) {

        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max Area is " + maxArea(arr));
    }
    //Here we are calculating the amount of water that can hold between the two lines or pillars
    //width is the Distance between the elements
    //low pillar or line decides the amount water can be stored
    // between the two lines these two lines forms the container.
    static int maxArea(int arr[]){

        int i = 0;
        int j = arr.length - 1;

        int maxArea = 0;

        while(i < j){
            int width = j - i;
            int height = Math.min(arr[i], arr[j]);
            int Area = width * height;
            maxArea = Math.max(maxArea, Area);

            if(arr[i] < arr[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return maxArea;
    }
}
