package Sample.cQueue;

import java.util.ArrayList;

public final class Queue<T> implements Sample.iQueue.Queue<T> {
    private final ArrayList<T> mq;

    public Queue(ArrayList<T> ori) {
       this.mq = ori;
    }

	public ArrayList<T> getQueue() {
        return this.mq;
    }

	@SuppressWarnings("unchecked")
	public Queue<T> enQueue(T t) {
		if (this.mq == null) return null;
		ArrayList<T> mqClone = (ArrayList<T>) this.mq.clone();
		mqClone.add(t);
    	return new Queue<T>(mqClone);
    }

    @SuppressWarnings("unchecked")
	public Queue<T> deQueue() {
        if (this.mq == null || this.mq.size() == 0)  return new Queue<T>(this.mq);
		ArrayList<T> mqClone = (ArrayList<T>) this.mq.clone();
		mqClone.remove(0);
    	return new Queue<T>((ArrayList<T>)mqClone);
    }

    public T head() {
        if (this.mq != null && this.mq.size() != 0) {
            return this.mq.get(0);
        }
        return null;
    }

    public boolean isEmpty() {
       return (this.mq.size() == 0);
    }
}