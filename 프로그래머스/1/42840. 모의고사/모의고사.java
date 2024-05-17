import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> stu1 = new ArrayList<>();
        Integer [] arr1 = {1,2,3,4,5};
        int stu1Cnt = 0;
        for(int i=0; i<2000; i++)   {
            stu1.addAll(Arrays.asList(arr1));
        }
        List<Integer> stu2 = new ArrayList<>();
        Integer [] arr2 = {2,1,2,3,2,4,2,5};
        int stu2Cnt = 0;
        for(int i=0; i<1250; i++)   {
            stu2.addAll(Arrays.asList(arr2));
        }
        List<Integer> stu3 = new ArrayList<>();
        Integer [] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int stu3Cnt = 0;
        for(int i=0; i<1000; i++)   {
            stu3.addAll(Arrays.asList(arr3));
        }
        for(int i=0; i<answers.length; i++) {
            if(stu1.get(i) ==answers[i])    {
                stu1Cnt++;
            }
            if(stu2.get(i) ==answers[i])    {
                stu2Cnt++;
            }
            if(stu3.get(i) ==answers[i])    {
                stu3Cnt++;
            }
        }
        int [] result2 = {1,2,3};
        int [] result = {};

        if(stu1Cnt>stu2Cnt && stu1Cnt>stu3Cnt)  {   // 1번이 클때
            return new int[]{result2[0]};
        }
        else if (stu2Cnt>stu1Cnt && stu2Cnt>stu3Cnt) {  // 2번이 클때
            return new int[]{result2[1]};
        }
        else if (stu3Cnt>stu1Cnt && stu3Cnt>stu2Cnt) {  // 3번이 클때
            return new int[]{result2[2]};
        }
        else if (stu1Cnt == stu2Cnt && stu1Cnt>stu3Cnt && stu2Cnt>stu3Cnt) {
            return new int[]{result2[0],result2[1]};
        }
        else if (stu2Cnt == stu3Cnt && stu2Cnt>stu1Cnt && stu3Cnt>stu1Cnt) {
            return new int[]{result2[1],result2[2]};
        }
        else if (stu1Cnt == stu3Cnt && stu1Cnt>stu2Cnt && stu3Cnt>stu2Cnt) {
            return new int[]{result2[0],result2[2]};
        }
        else if(stu1Cnt == stu3Cnt && stu2Cnt == stu3Cnt && stu1Cnt == stu2Cnt) {
            return new int[]{result2[0],result2[1], result2[2]};
        }
        else {
            return result;
        }
    }
}