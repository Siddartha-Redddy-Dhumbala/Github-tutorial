
 class AnotherClass {

        private String field;
        public static AnotherClass ref;

        public AnotherClass() {
            this.field = "value";
            AnotherClass.ref = this;
            throw new RuntimeException();
        }

       
        public String toString() {
            return field;
        }
    }

     class MainClass {
        public static void main(String[] a) {
            try {
                new AnotherClass();
                return;
            } catch (RuntimeException ex) {
                System.out.println("exception");
            }
            System.out.println("instance: " + AnotherClass.ref);
        }
    }
