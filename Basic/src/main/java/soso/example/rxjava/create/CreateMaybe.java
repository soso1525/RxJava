package soso.example.rxjava.create;

import io.reactivex.Maybe;
import io.reactivex.Observable;

public class CreateMaybe {
	public static void main(String[] args) {
		
		// Maybe는 데이터를 발행할지도 모르는 객체 -> 0개 or 1개
		Maybe.just("hello").subscribe(System.out::println);
		
		// Maybe 클래스로 직접 생성하기 보다 함수를 통해서 생성하는 경우가 많음
		// Observable - elementAt(), firstElement(), lastElement(), reduce(BiFunction<T,T,T> reducer), singleElement() 등이 Maybe 객체를 리턴
		Observable.fromArray(new String[] {"red", "blue", "green", "yellow", "magenta"}).elementAt(3).subscribe(System.out::println);
	}
}
