package soso.example.rxjava.create;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import io.reactivex.Observable;

public class CreatebyPublisher {
	public static void main(String[] args) {
		Publisher<String> publisher = (Subscriber<? super String> s) -> {
			s.onNext("hello");
			s.onComplete();
		};

		Observable.fromPublisher(publisher).subscribe(System.out::println);
	}
}
