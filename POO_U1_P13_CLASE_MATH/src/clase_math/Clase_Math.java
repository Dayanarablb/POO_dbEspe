
package clase_math;


public class Clase_Math {

    public static void main(String[] args) {
        // TODO code application logic here
        // TODO Auto-generated method stub
		int generados=0;
		int [] nums=new int [6];
		int n;
		
		do {
		n=(int)(Math.random()*49+1);
		
		if (!repetido(n,nums,generados)) {
			nums[generados]=n;
			generados++;
		}
		
		}while(generados<6);
		ordenar(nums);
		mostrar (nums);
	}
	public static boolean repetido(int n, int[] nums, int generados){
		boolean res  = false;
		for(int i=0; i<generados; i++){
		if(n==nums[i]){
		res=true;
		break;
		}
		}
		return res;
		}
	    public static void ordenar(int[]nums){
	    	
	    int aux;
	    for(int i=0;i<nums.length;i++)
	        for(int k=i;k<nums.length;k++){
	            aux=nums[i];
	            nums[i]=nums[k];
	            nums[k]=aux;}
	     }
	     public static void mostrar(int[]nums){
	    	 
	        for(int num:nums)
	            System.out.print(num+",");
    }
    
}
