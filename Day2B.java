// Pascals's Triangle
// link: https://leetcode.com/problems/pascals-triangle/
// change classname Day2B to Solution at portal

class Day2B {
    public List<List<Integer>> generate(int rowNo) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		    int i, element;

    		for(int j=1; j<=rowNo; j++){
            List<Integer> list2 = new ArrayList<Integer>();
            list2.add(1);
            for(i=1; i<j; i++){
                element = list2.get(i-1)*(j-i)/i;
                list2.add(element);
            }
            list.add(list2);
		    }

        return list;
    }
}
