public class HelloWorld {
	public static void main(String[] args){
		int[] a = {1,6,3,36,0};
		int[] c = HelloWorld.bouble(a);
		for (int x:c){
			System.out.println(x);
		}
	}
	public static int[] bouble(int[] spis){
		for (int i = 0; i<spis.length - 1; i++){
			for (int j = 0; j < spis.length - i - 1; j++){
				if (spis[j]>spis[j+1]){
					int b = spis[j];
					spis[j] = spis[j+1];
					spis[j+1] = b;
				}
			}
		}
		return spis;
	}
}