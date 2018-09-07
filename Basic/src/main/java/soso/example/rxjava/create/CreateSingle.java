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
		
		// Single 클래스는 데이터 한 개를 발행하자마자 종료됨 -> onNext() + onComplete = onSuccess()
		// Single 클래스의 Life-cycle 함수는 onSuccess(T item), onError()로 구성되어 있음
		// 여기에 onComplete() 함수가 추가되면 Maybe 클래스
		
	}
}
