import java.util.ArrayList;

public class Driver {
	
	
	public static void main(String[] args){
		int [] array = {7,	14,	4,	9,	3,	10,	20,	17,	6,	11,	1,	15,	12,	19,	2,	5,	13,	16,	8,	18};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(14);
		list.add(4);
		list.add(9);
		list.add(3);
		list.add(10);
		list.add(20);
		list.add(17);
		list.add(6);
		list.add(11);
		list.add(1);
		list.add(15);
		list.add(12);
		list.add(19);
		list.add(2);
		list.add(5);
		list.add(13);
		list.add(16);
		list.add(8);
		list.add(18);
		
		InsertionSort(array);
		selectSort(list);
		System.out.println("The array sorted:");
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		System.out.println();
		System.out.println("The ArrayList sorted: ");
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	public static void InsertionSort(int[] array){
		for(int outerLoop = 1; outerLoop < array.length; outerLoop++){
			int currentElement = array[outerLoop];
			int innerLoop;
			for(innerLoop = outerLoop -1; innerLoop >= 0 && array[innerLoop] > currentElement; innerLoop--){
				array[innerLoop + 1] = array[innerLoop];
				array[innerLoop] = currentElement;
			}
		}
	}
	public static void selectSort(ArrayList<Integer> list){
		for(int outLoop = 0; outLoop < list.size() -1; outLoop++){
			int currentMin = list.get(outLoop);
			int currentMinIndex = outLoop;
			for(int inLoop = outLoop +1; inLoop < list.size(); inLoop++){
				if(currentMin > list.get(inLoop)){
					currentMin = list.get(inLoop);
					currentMinIndex = inLoop;
				
				if(currentMinIndex != outLoop){
					
					list.set(currentMinIndex, list.get(outLoop));
					list.set(outLoop, currentMin);
				}
				}
			}
			
		}
	}
	
}
