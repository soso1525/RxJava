package example.create;

import io.reactivex.Observable;

public class CreatebyArray {
	public static void main(String[] args) {
		Integer[] integerArray = new Integer[] { 100, 200, 300, 400, 500 };
		System.out.print("fromArray() -> ");
		Observable.fromArray(integerArray).subscribe(data -> System.out.print(data + " "));

		// RxJava??? λͺμ?  ??Ό ????Όλ‘? ? ?? λ°°μ΄? ?°?΄?°λ§? ? ??λ‘? μΆλ ₯?¨ -> ? ?΄?°κ±°μ??
		int[] integerArray2 = new int[] { 100, 200, 300, 400, 500 };
		System.out.print("\n\nfromArray2() -> ");
		Observable.fromArray(integerArray2).subscribe(data -> System.out.print(data + " "));
	}
}
