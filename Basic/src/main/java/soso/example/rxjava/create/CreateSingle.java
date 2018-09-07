package soso.example.rxjava.create;

import io.reactivex.Observable;
import io.reactivex.Single;

public class CreateSingle {
	public static void main(String[] args) {
		Single<String> source1 = Single.just("First Single source");
		source1.subscribe(System.out::println);

		Single.just("Second Single source").subscribe(System.out::println);

		Observable<String> source = Observable.just("Observable source");
		Single.fromObservable(source).subscribe(System.out::println);
		
		
		//first(), last() : Single
		String[] fruits = { "apple", "banana", "orange", "pineapple", "lemon" };
		Observable.fromArray(fruits).first("default").subscribe(System.out::println);
		Observable.fromArray(fruits).last("default").subscribe(System.out::println);

		Observable.fromArray(fruits).flatMap(data -> {
			return Observable.just(data);
		}).subscribe(data -> Single.just(data).subscribe(d -> System.out.print(d + ", ")));

		Observable.empty().single("default").subscribe(System.out::println);

		Observable.just(1, 2, 3).take(1).single(0).subscribe(System.out::println); //take(long count)
		
		// Single Ŭ������ ������ �� ���� �������ڸ��� ����� -> onNext() + onComplete = onSuccess()
		// Single Ŭ������ Life-cycle �Լ��� onSuccess(T item), onError()�� �����Ǿ� ����
		// ���⿡ onComplete() �Լ��� �߰��Ǹ� Maybe Ŭ����
		
	}
}
