/*
    задача с https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
 */
package baseTasks;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int cols;


    public Matrix(int rows, int cols) {
        this.matrix = new double [rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    // Конструктор для инициализации из двумерного массива
    public Matrix(double[][] matrix) {
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        this.matrix = matrix;
    }




    // вывод матриу на экран
    public void showMatrix() {
        for(double[] row: matrix) {
            for(double value: row) {
                System.out.printf("%.1f", value);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    // Метод для сложения с другой матрицей
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны быть одного размера для сложения.");
        }

        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Matrix(result);
    }

    // Метод для умножения на число
    public Matrix multiplyByNumber(double number) {
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j] * number;
            }
        }
        return new Matrix(result);
    }


    // Метод для умножения матриц
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно быть равно числу строк второй матрицы.");
        }

        double[][] result = new double[this.rows][other.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    public static void main(String[] args) {
        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        double[][] data2 = {
                {7, 8, 9},
                {10, 11, 12}
        };

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Матрица 1:");
        matrix1.showMatrix();

        System.out.println("\nМатрица 2:");
        matrix2.showMatrix();

        // Сложение
        System.out.println("\nСложение матриц:");
        Matrix sum = matrix1.add(matrix2);
        sum.showMatrix();

        // Умножение на число
        System.out.println("\nУмножение матрицы 1 на число 2:");
        Matrix scaled = matrix1.multiplyByNumber(2);
        scaled.showMatrix();

        // Умножение матриц
        double[][] data3 = {
                {11.1, 22.3},
                {54, 42},
                {16, 10.3}
        };
        Matrix matrix3 = new Matrix(data3);

        System.out.println("\nУмножение матрицы 1 на новую матрицу:");
        Matrix product = matrix1.multiply(matrix3);
        product.showMatrix();

    }

}
