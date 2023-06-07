package matristranspozu;

public class MatrisTranspozu {
    public static void main(String[] args) {
        // Matrisin Transpozunu almak için hazırlanan uygulamadır.
        int[][] matris = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println("Matris : ");
        for(int[] row: matris){
            for(int column: row){
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoz : ");
        int column = matris[0].length;
        for(int i=0; i < column; i++){
            for(int j=0; j < matris.length; j++){
                System.out.print(" " + matris[j][i] + " ");
            }
            System.out.println();
        }
    }
}
