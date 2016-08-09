/**
 * Created by mio4kon on 16/8/9.
 * 对应Demo6_1
 */
public class Demo6_1_j {

    interface Base {
        void println();
    }

    static class BaseImpl implements Base {
        private int mX;

        public BaseImpl(int x) {
            this.mX = x;
        }

        @Override
        public void println() {
            System.out.println (mX);
        }
    }

    static class BaseImpl2 implements Base {
        private int mX;

        public BaseImpl2(int x) {
            this.mX = x;
        }

        @Override
        public void println() {
            System.out.println (mX + 1);
        }
    }

    //class Derived(b: Base) : Base by b
    static class Derived {
        private Base mBase;

        public Derived(Base base) {
            mBase = base;
        }

        public void println() {
            mBase.println ();
        }
    }

    public static void main(String[] args) {
        BaseImpl base = new BaseImpl (100);
        BaseImpl2 base2 = new BaseImpl2 (100);
        new Derived (base).println ();
        new Derived (base2).println ();
    }
}

