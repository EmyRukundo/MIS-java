package loop;

public class FloatAverage {
    public static void main(String args[]){
        float average(float array; int count){
            float total = 0.0;
            for(int i=0;i<count; i++)
                total += array[i];
            return(total / count);
        }
    }
}
