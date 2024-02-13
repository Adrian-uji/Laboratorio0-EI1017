import static java.lang.Math.*;

public class Estadistica {

    float devolver;
    int cont;

    public static void estadistica(){

    }

    public static double media(float[] nums){
        if(((nums == null)) ||((nums.length == 1) && (nums[0] == 0)) ||  (nums.length == 0)){
            return 0;
        }
        double devolver = 0;
        double  cont = 0;
        for(int i = 0; i < nums.length; i++){
            devolver += nums[i];
            cont++;
        }
        return (devolver/cont) ;
    }

    public float variancia(float[] nums){
        if(nums == null || nums.length== 0 ||nums.length == 1 && nums[0] == 0 ){
            return 0;
        }
        double valor = media(nums);
        devolver = 0;
        cont = 0;
        for(int i = 0; i < nums.length; i++){
            devolver += pow((nums[i] - valor),2);
            cont++;
        }
        return devolver/cont;
    }

    public float desviacion(float[] nums){
        return (float) sqrt(variancia(nums));
    }

}
