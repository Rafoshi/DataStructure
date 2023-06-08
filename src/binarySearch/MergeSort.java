package binarySearch;

import java.util.LinkedList;

public class MergeSort {

	public static void main(String[] args) {
		int[] list = new int[] { 90, -1, 3, 0, -3 };

		mergeSort(list, 0, list.length - 1);
		System.out.println("Acabaou");
	}

	private static void mergeSort(int[] list, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(list, start, mid);
			mergeSort(list, mid + 1, end);
			merge(list, start, mid, end);
		}
	}

	private static void merge(int[] list, int start, int mid, int end) {
		int[] temp = new int[(end - start) + 1];

		int i = start, j = mid + 1, k = 0;

		// Só entra no while se os dois tiverem valores
		while (i <= mid && j <= end) {
			// Adiciona o menor a lista temporária
			if (list[i] <= list[j]) {
				temp[k] = list[i];
				i++;
				k++;
			} else {
				temp[k] = list[j];
				j++;
				k++;
			}
		}

		// Quando saiu do último while ainda falta items para serem adicionados
		while (i <= mid) {
			temp[k] = list[i];
			i++;
			k++;
		}

		// Adicona o resto dos valores da direita
		while (j <= mid) {
			temp[k] = list[j];
			j++;
			k++;
		}

		for (i = start; i <= end; i++) {
			list[i] = temp[i - start];
		}

	}
}
