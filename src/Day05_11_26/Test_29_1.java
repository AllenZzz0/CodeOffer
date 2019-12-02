package Day05_11_26;

import java.util.ArrayList;

/**
 * @program: StudyCode
 * @description: 顺时针打印矩阵
 * @author: zhangsh
 * @create: 2019-11-26 17:12
 **/
public class Test_29_1 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        //r1和c1是起始位置，(0,0)，下一圈的位置就是(1,1)，r2和c2是剩下没走的矩阵的大小，一圈一圈走，矩阵就会变小一圈
        //r2是剩下矩阵的总行数，c2是剩下矩阵的总列数
        int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            //横→
            for (int i = c1; i <= c2; i++)
                ret.add(matrix[r1][i]);
            //竖↓
            for (int i = r1 + 1; i <= r2; i++)
                ret.add(matrix[i][c2]);
            //左←
            if (r1 != r2)
                for (int i = c2 - 1; i >= c1; i--)
                    ret.add(matrix[r2][i]);
                //上↑
            if (c1 != c2)
                for (int i = r2 - 1; i > r1; i--)
                    ret.add(matrix[i][c1]);
                //调到下一节点开始重新画圈,并且矩阵缩小一圈
            r1++; r2--; c1++; c2--;
        }
        return ret;
    }

    public static ArrayList<Integer> printMatrix1(int[][] matrix){
        ArrayList<Integer> ret = new ArrayList<>();
        int r1=0,r2=matrix.length-1,c1=0,c2=matrix[0].length-1;
        while (r1 <= r2 && c1 <= c2){
            for (int i=c1;i<=c2;i++){
                ret.add(matrix[r1][i]);
            }
            for (int i=r1+1;i<=r2;i++){
                ret.add(matrix[i][c2]);
            }
            if (r1 != r2){
                for (int i=c2-1;i>=c1;i--){
                    ret.add(matrix[r2][i]);
                }
            }
            if (c1 != c2){
                for (int i=r2-1;i>r1;i--){
                    ret.add(matrix[i][c1]);
                }
            }
            r1++;r2--;c1++;c2--;
        }

        return ret;
    }

    public static void main(String[] args) {
        int[][] a={{1,2,3},{0,3,2},{3,3,6}};
        for (Integer a1 : printMatrix1(a)) {
            System.out.println(a1);
        }


    }



}
