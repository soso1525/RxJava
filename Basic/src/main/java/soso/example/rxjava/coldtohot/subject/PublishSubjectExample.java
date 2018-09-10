package soso.example.rxjava.coldtohot.subject;

import io.reactivex.subjects.PublishSubject;

public class PublishSubjectExample {
	public static void main(String[] args) {
		PublishSubject<String> subject = PublishSubject.create();
		subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
		subject.onNext("1");
		subject.onNext("3");
		subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
		subject.onNext("5");
		subject.onComplete();
	}
}
