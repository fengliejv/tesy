package array;

/**
 * Created by fengliejv on 2017/11/17.
 */
public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        if(height.length<=1){
            return 0;
        }
        int begin = 0;
        int end = height.length-1;
        int max=0;
        while (begin<end){
            int area = (end-begin)*Math.min(height[begin],height[end]);
            if(area>max){
                max=area;
            }
            if(height[begin]>height[end]){
                end--;
            }else {
                begin++;
            }
        }
        return max;
    }

    public int maxArea1(int[] height) {
        int lenth = height.length-1;
        int maxArea = 0;
        for (int i = 1; i <=lenth; i++) {
            for (int j = 0; j <=lenth-i ; j++) {
                int area = i*Math.min(height[j],height[j+i]);
                if(area>maxArea){
                    maxArea=area;
                }
            }
        }
        return maxArea;
    }
}
