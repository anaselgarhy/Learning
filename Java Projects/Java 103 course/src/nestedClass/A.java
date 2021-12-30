package nestedClass;
public class A { // Called Outer class for X class And Y class And B class
    public int value;
    public class X{ // Called inner class for A class And called outer class for Z class and B class
        public class Z{ // Called inner class for X class

        }
        public class B { // Called inner class for X class

        }
    }
    public class Y { // Called inner class for A class

    }
    public class B { // Called inner class for A class

    }
}