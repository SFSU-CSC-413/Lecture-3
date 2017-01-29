public class ExceptionTestTwo {
  static int numbers[] = { 0, -2, 5, 27, 3};

  public static void main( String[] args ) {
    int sum = 0;

    try {
      for ( int i = 0; i <= 5; i++ ) {
        sum += numbers[ i ];
      }
    } catch ( ArrayIndexOutOfBoundsException e ) {
      System.out.println( "*** Array index out of bounds" );
    }

    System.out.println( "Sum: " + sum );
  }
}
