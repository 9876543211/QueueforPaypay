# QueueforPaypay
Implement Queue, which should be immutable, generic class, and function as a queue.

I used an arraylist to fulfill the Queue.  
A queue push event is done by arraylist.add();
A queue pop event is done by arraylist.remove();
A queue head is got by arraylist.get(0);(When nothing is there, null will be returned.) 
A queue IsEmpty is done by deciding whether or not the arraylist size is 0.

The code is tested in jdk 1.8 and proved to be immutable.
