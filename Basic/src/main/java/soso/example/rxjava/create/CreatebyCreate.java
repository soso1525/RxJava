package soso.example.rxjava.create;

import io.reactivex.Observable;

public class CreatebyCreate {
	public static void main(String[] args) {
		System.out.print("create() -> ");
		Observable.create(emitter -> {
			emitter.onNext('a');
			emitter.onNext('b');
			emitter.onNext('c');
			emitter.onNext('d');
			emitter.onNext('e');
			emitter.onComplete();
		}).subscribe(data -> System.out.print(data + " "));
	}
}
