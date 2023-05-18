public class MinJump {
    public static int minJump(int arr[],int start,int end){
        if(start==end){
            return 0;
        }
        if(arr[start]==0){
            return Integer.MAX_VALUE;
        }
        int minJump=Integer.MAX_VALUE;
        for(int i=start+1;i<=start+arr[start]&&i<=end;i++){
            int jumps=minJump(arr,i,end);

            if(jumps!=Integer.MAX_VALUE&&jumps+1<minJump){
                minJump=jumps+1;
            }
        }
        return minJump;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4}; // Example array, replace with your desired input
        int start = 0; // Starting index
        int end = arr.length - 1; // Ending index

        int minimumJumps = minJump(arr, start, end);
        System.out.println("Minimum jumps required: " + minimumJumps);
    }
        
    }
    

