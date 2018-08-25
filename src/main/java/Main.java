public class Main {

    static class Example1 {

        public Example2 eProperty = new Example2();

        class Example2 {

            public void m2() {
                m1();
            }

        }

        protected void m1() {
            System.err.println(getClass() + " m1 called");
        }
    }

    static class Example3 extends Example1 {
        protected void m1() {
            super.m1();
            System.err.println(getClass() + " m1 called");
        }
    }

    public static void main(String[] args) {

        Example1 e = new Example3();
        e.eProperty.m2();


    }
}
