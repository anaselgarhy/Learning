package FifthExample;

public class Calc {
    public int[] multipleArrays(int[] array1, int[] array2){
        if(array1.length != array2.length)
            return null;
        int[] result = new int[array1.length];
        for(int i =0; i<array1.length; i++)
            result[i] = array1[i] * array2[i];
        return result;
    }
}
