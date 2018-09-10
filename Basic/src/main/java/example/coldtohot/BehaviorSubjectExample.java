package example.coldtohot;

import io.reactivex.subjects.BehaviorSubject;

public class BehaviorSubjectExample {
	public static void main(String[] args) {
		BehaviorSubject<String> subject = BehaviorSubject.createDefault("6");
		subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
		subject.onNext("1");
		subject.onNext("3");
		subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
		subject.onNext("5");
		subject.onComplete();		
		
		System.out.println();
		BehaviorSubject<String> subject2 = BehaviorSubject.create();
		subject2.subscribe(data -> System.out.println("Subscriber #1 => " + data));
		subject2.onNext("1");
		subject2.onNext("3");
		subject2.subscribe(data -> System.out.println("Subscriber #2 => " + data));
		subject2.onNext("5");
		subject2.onComplete();	
		
		// default ���� ������ ���� createDefault or create �Լ� ���
		// default ���� �ֱ� ������ ������ ����� �����͸� ������ 
	}
}
