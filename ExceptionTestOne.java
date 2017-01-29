public class ExceptionTestOne {
  static int numbers[] = { 0, -2, 5, 27, 3};

  public static void main( String[] args ) {
    int sum = 0;

    for ( int i = 0; i <= 5; i++ ) {
      sum += numbers[ i ];
      // attempt to access numbers[5] which is outside the array bounds
    }
  }
}
