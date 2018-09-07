package soso.example.rxjava.create;

import io.reactivex.Observable;

public class CreatebyJust {
	public static void main(String[] args) {
		System.out.println("just()");
		Observable.just(1, 2, 3, 4, 5).subscribe(data -> System.out.print(data + " "));
	}
}
