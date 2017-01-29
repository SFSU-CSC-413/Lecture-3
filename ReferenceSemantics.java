public class ReferenceSemantics {
  public static void main( String[] args ) {
    A a = new A();
    A aa;
    aa = a;

    B b = new B( 5 );
    aa.incI( b );
    a.incI( b );

    System.out.format( " a's i is %d\n", a.getI() );
    System.out.format( "aa's i is %d\n", aa.getI() );
  }
}

class A {
  private int i = 0;

  public void incI( B bb ) {
    i = bb.inc();
  }

  public int getI() {
    return this.i;
  }
}

class B {
  private int i = 0;

  B( int i ) {
    this.i = i;
  }

  public int inc() {
    return ++i;
  }
}
