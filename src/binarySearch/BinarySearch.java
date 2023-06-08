package binarySearch;

import java.util.LinkedList;

public class BinarySearch {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(-40);
		list.add(-10);
		list.add(-1);
		list.add(1);
		list.add(10);
		list.add(21);
		list.add(32);
		list.add(39);
		list.add(47);

		int index = binarySearch(list, 0, list.size() - 1, 47);
		System.out.println(index);
	}

	public static int binarySearch(LinkedList<Integer> list, int left, int right, int target) {
		if (left > right)
			return -1;

		int mid = (left + right) / 2;

		if (list.get(mid) == target)
			return mid;

		if(list.get(mid) < target) {
			return binarySearch(list, mid + 1, right, target);
		}
		
		return binarySearch(list, left, mid - 1, target);
		
	}

}
