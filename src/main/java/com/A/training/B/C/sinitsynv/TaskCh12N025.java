package com.A.training.B.C.sinitsynv;

import java.util.Arrays;

public class TaskCh12N025 {
    public static void main(String[] args) {
        int[][] arrayA = fillArrayA(12, 10);
        int[][] arrayB = fillArrayB(12, 10);
        int[][] arrayV = fillArrayV(12, 10);
        int[][] arrayG = fillArrayG(12, 10);
        int[][] arrayD = fillArrayD(10, 12);
        int[][] arrayE = fillArrayE(12, 10);
        int[][] arrayJ = fillArrayJ(12, 10);
        int[][] arrayZ = fillArrayZ(12, 10);
        int[][] arrayI = fillArrayI(12, 10);
        int[][] arrayK = fillArrayK(12, 10);
        int[][] arrayL = fillArrayL(12, 10);
        int[][] arrayM = fillArrayM(12, 10);
        int[][] arrayN = fillArrayN(12, 10);
        int[][] arrayO = fillArrayO(12, 10);
        int[][] arrayP = fillArrayP(12, 10);
        int[][] arrayR = fillArrayR(12, 10);
        printArray(arrayA);
        printArray(arrayB);
        printArray(arrayV);
        printArray(arrayG);
        printArray(arrayD);
        printArray(arrayE);
        printArray(arrayJ);
        printArray(arrayZ);
        printArray(arrayI);
        printArray(arrayK);
        printArray(arrayL);
        printArray(arrayM);
        printArray(arrayN);
        printArray(arrayO);
        printArray(arrayP);
        printArray(arrayR);
    }

    private static void printArray(int[][] array) {
        for (int i[] : array) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
    }

    private static int[][] fillArrayA(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = count++;
            }
        }
        return array;
    }

    private static int[][] fillArrayB(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                array[j][i] = count;
                count++;
            }
        }
        return array;
    }

    private static int[][] fillArrayV(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = 0; i < row; i++) {
            for (int j = column - 1; j >= 0; j--) {
                array[i][j] = count;
                count++;
            }
        }
        return array;
    }

    private static int[][] fillArrayG(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, j = 0; j < column; j++) {
            for (int i = row - 1; i >= 0; i--) {
                array[i][j] = count;
                count++;
            }
        }
        return array;
    }

    private static int[][] fillArrayD(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < column; j++) {
                    array[i][j] = count++;
                }
            } else {
                for (int j = 0; j < column; j++) {
                    array[i][column - j - 1] = count++;
                }
            }
        }
        return array;
    }

    private static int[][] fillArrayE(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = 0; i < column; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < row; j++) {
                    array[j][i] = count++;
                }
            } else {
                for (int j = row - 1; j >= 0; j--) {
                    array[j][i] = count++;
                }
            }
        }
        return array;
    }

    private static int[][] fillArrayJ(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = row - 1; i >= 0; i--) {
            for (int j = 0; j < column; j++) {
                array[i][j] = count++;
            }
        }
        return array;
    }

    private static int[][] fillArrayZ(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, j = column - 1; j >= 0; j--) {
            for (int i = 0; i < row; i++) {
                array[i][j] = count++;
            }
        }
        return array;
    }

    private static int[][] fillArrayI(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = row - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 0; j--) {
                array[i][j] = count++;
            }
        }
        return array;
    }

    private static int[][] fillArrayK(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = column - 1; i >= 0; i--) {
            for (int j = row - 1; j >= 0; j--) {
                array[j][i] = count++;
            }
        }
        return array;
    }

    private static int[][] fillArrayL(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = row - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                for (int j = 0; j < column; j++) {
                    array[i][j] = count++;
                }
            } else {
                for (int j = column - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }

            }
        }
        return array;
    }

    private static int[][] fillArrayM(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = 0; i < row; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < column; j++) {
                    array[i][j] = count++;
                }
            } else {
                for (int j = column - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }
            }
        }
        return array;
    }

    private static int[][] fillArrayN(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, j = column - 1; j >= 0; j--) {
            if (j % 2 != 0) {
                for (int i = 0; i < row; i++) {
                    array[i][j] = count++;
                }
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    array[i][j] = count++;
                }
            }
        }
        return array;
    }

    private static int[][] fillArrayO(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, j = 0; j < column; j++) {
            if (j % 2 != 0) {
                for (int i = 0; i < row; i++) {
                    array[i][j] = count++;
                }
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    array[i][j] = count++;
                }
            }
        }
        return array;
    }

    private static int[][] fillArrayP(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, i = row - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = 0; j < column; j++) {
                    array[i][j] = count++;
                }
            } else {
                for (int j = column - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }
            }
        }
        return array;
    }

    private static int[][] fillArrayR(int row, int column) {
        int[][] array = new int[row][column];
        for (int count = 1, j = column - 1; j >= 0; j--) {
            if (j % 2 == 0) {
                for (int i = 0; i < row; i++) {
                    array[i][j] = count++;
                }
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    array[i][j] = count++;
                }
            }
        }
        return array;
    }
}

