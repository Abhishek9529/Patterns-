class PatternsPart2{
    public static void main(String[] args) {
        int n = 5;

        // for this pattern
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // for(int row =1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if(row >= col){
        //             System.out.print(col + " ");
        //         }
        //     }
        //     System.out.println();
        // }



        // for this pattern
        //         1 
        //       2 2
        //     3 3 3
        //   4 4 4 4
        // 5 5 5 5 5

        // for(int row =1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if(row + col >= n+1){
        //             System.out.print(row + " ");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for this pattern
        //         1 
        //       1 2
        //     1 2 3
        //   1 2 3 4
        // 1 2 3 4 5

        // for(int row =1; row <= n; row++){
        //     for(int x = n; x > row; x--){
        //         System.out.print("  ");
        //     }
        //     for(int col = 1; col <= row; col++){
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }

        // for this pattern
        //         1 
        //       2 1
        //     3 2 1
        //   4 3 2 1
        // 5 4 3 2 1 

        // for(int row =1; row <= n; row++){
        //     for(int x = n; x > row; x--){
        //         System.out.print("  ");
        //     }
        //     for(int col = row; col >= 1; col--){
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }


        // for this pattern
        //         5 
        //       5 4
        //     5 4 3
        //   5 4 3 2
        // 5 4 3 2 1

        // for(int row =5; row >= 1; row--){
        //     for(int x = 1; x < row; x++){
        //         System.out.print("  ");
        //     }
        //     for(int col = 5; col >= row; col--){
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }


        // for this pattern 
        //         5
        //       4 5
        //     3 4 5
        //   2 3 4 5
        // 1 2 3 4 5

        // for(int row =n; row >= 1; row--){
        //     for(int x = 1; x < row; x++){
        //         System.out.print("  ");
        //     }
        //     for(int col = row; col <= n; col++){
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }

        // for this pattern
        //  1 2 3 4 5 
        //    1 2 3 4
        //      1 2 3
        //        1 2
        //          1

        // for(int row = n; row >= 1; row--){
        //     for(int x = 5; x > row; x--){
        //         System.out.print("  ");
        //     }
        //     for(int col = 1; col <= row; col++){
        //         System.out.print(col + " ");
        //     } 
        //     System.out.println();
        // }


        // for this pattern
        // 1 2 3 4 5 
        //   2 3 4 5
        //     3 4 5
        //       4 5
        //         5

        // for(int row = 1; row <= n; row++){
        //     for(int x = 1; x < row; x++){
        //         System.out.print("  ");
        //     }
        //     for(int col = row; col <= 5; col++){
        //         System.out.print(col + " ");
        //     } 
        //     System.out.println();
        // }


        // Daimond Pattern
        //         1 
        //       1 2 1
        //     1 2 3 2 1
        //   1 2 3 4 3 2 1
        // 1 2 3 4 5 4 3 2 1 

        // for(int row = 1; row <= n; row++){
        //     for(int x = 5; x > row; x--){
        //         System.out.print("  ");
        //     }
        //     for(int col = 1; col <= row; col++){
        //         System.out.print(col + " ");
        //     } 
        //     for(int k = row-1; k >= 1; k--){
        //         System.out.print(k + " ");
        //     }
        //     System.out.println();
        // }
    }
}