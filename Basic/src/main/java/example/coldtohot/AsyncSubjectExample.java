package example.coldtohot;

import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;

public class AsyncSubjectExample {
	public static void main(String[] args) {

		// Object > Observable > Subject > AsyncSubject
		
		// Cold Observable -> Hot Observable : Subject
		// 주요 Subject - AsyncSubject, BehaviorSubject, PublishSubject, ReplaySubject
		// Subject는 Observable 특성 + Observer 특성

		// AsyncSubject는 마지막 데이터만 발행함
		// 언제 subscribe를 호출하든지 맨 마지막 데이터가 발행이 완료된 후에 해당 데이터를 처리함

		AsyncSubject<String> subject = AsyncSubject.create();
		subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
		subject.onNext("1");
		subject.onNext("3");
		System.out.println(subject.getValue()); // -> null
		subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
		subject.onNext("5");
		subject.onComplete();
		System.out.println(subject.getValue()); // -> 5, 결국 마지막에 발행한 데이터 값만 받아올 수 있음

		// Observer 특성을 보여주는 예제
		Float[] temperature = { 10.1f, 13.4f, 12.5f };
		Observable<Float> source = Observable.fromArray(temperature);

		AsyncSubject<Float> observerSubject = AsyncSubject.create();
		observerSubject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
		
		source.subscribe(observerSubject);
	}
}
