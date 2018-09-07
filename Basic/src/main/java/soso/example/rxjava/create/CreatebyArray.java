package soso.example.rxjava.create;

import io.reactivex.Observable;

public class CreatebyArray {
	public static void main(String[] args) {
		Integer[] integerArray = new Integer[] { 100, 200, 300, 400, 500 };
		System.out.print("fromArray() -> ");
		Observable.fromArray(integerArray).subscribe(data -> System.out.print(data + " "));

		// RxJava에서는 명시적 래퍼 타입으로 정의한 배열의 데이터만 제대로 출력됨 -> 왜 이런거지?
		int[] integerArray2 = new int[] { 100, 200, 300, 400, 500 };
		System.out.print("\n\nfromArray2() -> ");
		Observable.fromArray(integerArray2).subscribe(data -> System.out.print(data + " "));
	}
}
