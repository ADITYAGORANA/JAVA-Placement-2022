public class ChangingToGrayscale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pixel1 = {255, 0, 0}; // red :)
		int[] pixel2 = {123, 76, 44};
		int[] pixel3 = {32, 120, 0};
		int[] pixel4 = {123, 12, 120};
		int[] pixel5 = {189, 18, 0};
		int[] pixel6 = {187, 56, 130};
		int[] pixel7 = {140, 76, 120};
		int[] pixel8 = {90, 123, 90};
		int[] pixel9 = {200, 145, 105};
		
		// Image is an Array -> 3D
		int[][][] image = {
						{pixel1, pixel2, pixel3},
						{pixel4, pixel5, pixel6},
						{pixel7, pixel8, pixel9}
					};
		image = toGrayscale(image);
		printImage(image);
	}
	public static int[][][] toGrayscale(int [][][] photo){
		for(int [][]array1 : photo)
		{
			for(int []array2 : array1)
			{
				int temp=0;
				for(int element : array2)
				{
					temp += element;
				}
				temp /= 3;
				array2[0] = temp;
				array2[1] = temp;
				array2[2] = temp;
				/*for(int element : array2)
				{
					element = temp;
				}*/
				
			}
		}
		return photo;
	}
	public static void printImage(int [][][]image)
	{
		for(int [][]array : image)
		{
			for(int []pixel : array)
			{
				for(int value : pixel)
				{
					System.out.print(value+" ");
				}
				System.out.println();
			}
		}
	}

}
