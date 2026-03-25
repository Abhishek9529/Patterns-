class Pattern{
    public static void main(String[] args) {
        int n = 5;

// for this pattern
//         * 
//       * *
//     * * *
//   * * * *
// * * * * *
    //     for(int row = 1; row <= n; row++){
    //         for(int col = 1; col<= n; col++){
    //             if (row + col >= n + 1) {
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }

        // for this pattern
        // * 
        // * *
        // * * *
        // * * * *
        // * * * * *
    //   for(int row = 1; row <= n; row++){
    //         for(int col = 1; col<= n; col++){
    //             if (row >= col) {
    //                 System.out.print("* ");
    //             } 
    //         }
    //         System.out.println();
    //     }


        // for this pattern
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col<= n; col++){
        //         if (row + col <= 6) {
        //             System.out.print("* ");
        //         } 
        //     }
        //     System.out.println();
        // }


        //  for this pattern 
        // *       * 
        //   *   *
        //     *
        //   *   *
        // *       *
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col<= n; col++){
        //         if (row + col == 6 || row == col) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for this pattern 
                  

        //        *


        //  for(int row = 1; row <= n; row++){
        //     for(int col = 1; col<= n; col++){
        //         if (row + col == 6 && row == col) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for this pattern 
            // * * * * * 
            // *       *
            // *       *
            // *       *
            // * * * * *

        //  for(int row = 1; row <= n; row++){
        //     for(int col = 1; col<= n; col++){
        //         if (row == 1 || col == 1 || row == n || col == n) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for A Latter
            //     *     
            //   *   *
            //   * * *
            //   *   *
            //   *   *

        //  for(int row = 1; row <= n; row++){
        //     for(int col = 1; col<= n; col++){
        //         if ((row + col == 4 && row < col) || (row + col == 4 && row == col) || (row == 3 && row + col == 5) || (row == 4 && row + col ==6) || (row == 5 && row + col ==7) || (row == 2 && row + col ==6) || (row == 3 && row + col ==7) || (row == 4 && row + col ==8) || (row == 5 && row + col ==9) || (row == col && row + col ==6) ) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        for(int row = 1; row <= n; row++){
            for(int col = 1; col<= n; col++){
                if ( (row == 1 || col == 1) || (row == (n/2) || col == n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}