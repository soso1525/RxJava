package soso.example.rxjava.create;

import io.reactivex.Maybe;
import io.reactivex.Observable;

public class CreateMaybe {
	public static void main(String[] args) {
		
		// Maybe�� �����͸� ���������� �𸣴� ��ü -> 0�� or 1��
		Maybe.just("hello").subscribe(System.out::println);
		
		// Maybe Ŭ������ ���� �����ϱ� ���� �Լ��� ���ؼ� �����ϴ� ��찡 ����
		// Observable - elementAt(), firstElement(), lastElement(), reduce(BiFunction<T,T,T> reducer), singleElement() ���� Maybe ��ü�� ����
		Observable.fromArray(new String[] {"red", "blue", "green", "yellow", "magenta"}).elementAt(3).subscribe(System.out::println);
	}
}
