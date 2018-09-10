package example.coldtohot;

import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;

public class AsyncSubjectExample {
	public static void main(String[] args) {

		// Object > Observable > Subject > AsyncSubject
		
		// Cold Observable -> Hot Observable : Subject
		// �ֿ� Subject - AsyncSubject, BehaviorSubject, PublishSubject, ReplaySubject
		// Subject�� Observable Ư�� + Observer Ư��

		// AsyncSubject�� ������ �����͸� ������
		// ���� subscribe�� ȣ���ϵ��� �� ������ �����Ͱ� ������ �Ϸ�� �Ŀ� �ش� �����͸� ó����

		AsyncSubject<String> subject = AsyncSubject.create();
		subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
		subject.onNext("1");
		subject.onNext("3");
		System.out.println(subject.getValue()); // -> null
		subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
		subject.onNext("5");
		subject.onComplete();
		System.out.println(subject.getValue()); // -> 5, �ᱹ �������� ������ ������ ���� �޾ƿ� �� ����

		// Observer Ư���� �����ִ� ����
		Float[] temperature = { 10.1f, 13.4f, 12.5f };
		Observable<Float> source = Observable.fromArray(temperature);

		AsyncSubject<Float> observerSubject = AsyncSubject.create();
		observerSubject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
		
		source.subscribe(observerSubject);
	}
}
