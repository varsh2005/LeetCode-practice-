import java.util.Scanner;
public class SpiralMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rowbeg=0, rowend=n-1, colbeg=0, colend=n-1;
        int[][] arr = new int[n][n];
        int count = 1;
        while(rowbeg<=rowend && colbeg<=colend){
            for(int i=colbeg;i<=colend;i++){
                arr[rowbeg][i] = count++;
            }rowbeg++;
            
            for(int i=rowbeg;i<=rowend;i++){
                arr[i][colend] = count++;
            }colend--;
            
            for(int i=colend;i>=colbeg;i--){
                arr[rowend][i] = count++;
            }rowend--;
            
            for(int i=rowend;i>=rowbeg;i--){
                arr[i][colbeg] = count++;
            }colbeg++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
