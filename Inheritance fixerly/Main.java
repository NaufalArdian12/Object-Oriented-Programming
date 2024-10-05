public class Main {
  public static void main(String[] args) {
      // buat object dengan parameterless
      TukangKayu tukangKayu1 = new TukangKayu();
      tukangKayu1.totalKayu(); // Output: Unknown has worked with 0 pieces of Unknown wood.

      // buat objek dengan parameter
      TukangKayu tukangKayu2 = new TukangKayu("Budi", 35, 8, "Teak", 150);
      tukangKayu2.totalKayu(); // Output: Budi has worked with 150 pieces of Teak wood.

      // buat objek dengan parameterless
      TukangBatu tukangBatu1 = new TukangBatu();
      tukangBatu1.totalBatu();
      tukangBatu1.showRating(); // Output: Unknown has worked with 0 pieces of Unknown stone.

      // buat objek dengan parameter
      TukangBatu tukangBatu2 = new TukangBatu("Joko", 40, 10, "Marble", 200);
      tukangBatu2.totalBatu();
      tukangBatu2.showRating(); // Output: Joko has worked with 200 pieces of Marble stone.
  }
}
