// Pascal's Triangle
// link: https://workat.tech/problem-solving/practice/pascals-triangle
// change Day2A to Solution at the portal

class Day2A {	
	int[] pascalTriangleRow(int rowNo) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i, element;
		list.add(1);
		for(i=1; i<rowNo; i++){
			element = list.get(i-1)*(rowNo-i)/i;
			list.add(element);
		}
		
		int arr[] = new int[list.size()];
		for(i=0; i<rowNo; i++){
			arr[i] = list.get(i);
		}
		return arr;
	}
}
