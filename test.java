package Sample;

import java.util.ArrayList;

import Sample.cQueue.Queue;

public class test {

	public static void main(String[] args) {
		// T:String�̏ꍇ
		System.out.println("T:String�̏ꍇ: ");
		ArrayList<String> al = new ArrayList<String>();
		al.add("item1");
		al.add("item2");
		al.add("item3");
		al.add("item4");
		al.add("item5");
		al.add("item6");
		Sample.cQueue.Queue<String> s = new Sample.cQueue.Queue<String>(al);
		Queue<String> que = s.enQueue("itemAdded1");

		System.out.println("After enQueue1: ");
		for(int i = 0; i < que.getQueue().size(); i ++) {System.out.println(que.getQueue().get(i).toString() + ",");}
		que = que.enQueue("itemAdded2");
		System.out.println("After enQueue2: ");
		for(int i = 0; i < que.getQueue().size(); i ++) {System.out.println(que.getQueue().get(i).toString() + ",");}
		que = que.enQueue("itemAdded3");
		System.out.println("After enQueue3: ");
		for(int i = 0; i < que.getQueue().size(); i ++) {System.out.println(que.getQueue().get(i).toString() + ",");}
		que = que.deQueue();
		System.out.println("After deQueue1: ");
		for(int i = 0; i < que.getQueue().size(); i ++) {System.out.println(que.getQueue().get(i).toString() + ",");}
		que = que.deQueue();
		System.out.println("After deQueue2: ");
		for(int i = 0; i < que.getQueue().size(); i ++) {System.out.println(que.getQueue().get(i).toString() + ",");}
		System.out.println("head: " + que.head());
		System.out.println("isEmpty: " + que.isEmpty());
		// deQueue all
		que = que.deQueue();
		que = que.deQueue();
		que = que.deQueue();
		que = que.deQueue();
		que = que.deQueue();
		que = que.deQueue();
		que = que.deQueue();
		que = que.deQueue();
		System.out.println("head: " + (que.head() == null? "null":que.head()));
		System.out.println("isEmpty: " + que.isEmpty());


		// T:int�̏ꍇ
		System.out.println("T:int�̏ꍇ: ");
		ArrayList<Integer> ali = new ArrayList<Integer>();
		ali.add(1);
		ali.add(2);
		ali.add(3);
		ali.add(4);
		ali.add(5);
		ali.add(6);
		Sample.cQueue.Queue<Integer> si = new Sample.cQueue.Queue<Integer>(ali);
		Queue<Integer> quei = si.enQueue(11);

		System.out.println("After enQueue1: ");
		for(int i = 0; i < quei.getQueue().size(); i ++) {System.out.println(quei.getQueue().get(i).toString() + ",");}
		quei = quei.enQueue(12);
		System.out.println("After enQueue2: ");
		for(int i = 0; i < quei.getQueue().size(); i ++) {System.out.println(quei.getQueue().get(i).toString() + ",");}
		quei = quei.enQueue(13);
		System.out.println("After enQueue3: ");
		for(int i = 0; i < quei.getQueue().size(); i ++) {System.out.println(quei.getQueue().get(i).toString() + ",");}
		quei = quei.deQueue();
		System.out.println("After deQueue1: ");
		for(int i = 0; i < quei.getQueue().size(); i ++) {System.out.println(quei.getQueue().get(i).toString() + ",");}
		quei = quei.deQueue();
		System.out.println("After deQueue2: ");
		for(int i = 0; i < quei.getQueue().size(); i ++) {System.out.println(quei.getQueue().get(i).toString() + ",");}
		System.out.println("head: " + quei.head());
		System.out.println("isEmpty: " + quei.isEmpty());
		// deQueue all
		quei = quei.deQueue();
		quei = quei.deQueue();
		quei = quei.deQueue();
		quei = quei.deQueue();
		quei = quei.deQueue();
		quei = quei.deQueue();
		quei = quei.deQueue();
		quei = quei.deQueue();
		System.out.println("head: " + (quei.head() == null? "null":quei.head()));
		System.out.println("isEmpty: " + quei.isEmpty());
	}

}
