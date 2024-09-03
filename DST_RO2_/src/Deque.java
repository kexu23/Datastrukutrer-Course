public class Deque<T> implements DequeInterface<T> {

    private int strn;
    private int lstn;
    private Node <T> first;
    private Node <T> last;

    private class Node<T> {
        private T x;
        private Node<T> next;
        private Node<T> prev;
        }

    public Deque() {
        // TODO Auto-generated constructor stub
        strn = 0;
        lstn = 0;
        first = null;
        last = null;
    }

    @Override
    public void addFront(T x) {
        // TODO Auto-generated method stub
        if (x == null) throw new NullPointerException();
        Node<T>oldfirst = first;
        first = new Node<T>();
        first.x = x;
        first.prev = null;
        if (oldfirst==null)
        {
            first.next = null;

        }
        else
        {
            first.next = oldfirst;
            oldfirst.prev = first;
        }
        if (last==null)
        {
            last = first;
        }
        strn++;
    }

    @Override
    public void addRear(T x) {
        // TODO Auto-generated method stub
        if (x == null) throw new NullPointerException();
        Node<T> oldlast = last;
        last = new Node<T>();
        last.x = x;
        last.next = null;

        if (oldlast==null)
        {

            last.prev = null;
        }
        else
        {
            oldlast.next = last;
            last.prev = oldlast;
        }
        if (first==null)
        {
            first = last;
        }
        lstn++;
    }

    @Override
    public T removeFront() throws QueueUnderflowException {
        // TODO Auto-generated method stub
        T x = first .x;
        first = first.next;
        if (first!=null && first.prev!=null)
        {
            first.prev = null;
        }
        strn--;
        if (first==null)
        {
            last = null;
        }
        return x;
    }

    @Override
    public T removeRear() throws QueueUnderflowException {
        // TODO Auto-generated method stub
        T x = last.x;
        last = last.prev;
        if (last!=null && last.next!=null)
            last.next = null;
        if (last==null)
        {
            first = null;

        }
        lstn--;

        return x;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return (first != null && last != null);
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (first == null);
    }

    @Override
    public T front() throws QueueUnderflowException {
        // TODO Auto-generated method stub
        return first.x;
    }

    @Override
    public T rear() throws QueueUnderflowException {
        // TODO Auto-generated method stub
        return last.x;
    }

}

