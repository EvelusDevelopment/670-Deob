
final class lna {

   static int c;
   static Object[] f = je.a(2, new Object[1], 1, (byte)-110);
   static Object[][] h;
   static Object[] e = ed.a(0, new Object[1], (byte)-128, 26);
   static int a;
   static int b;
   static ta g;
   static Object[][] d;


   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      jla.a((byte)70, var1);
      ++c;
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      var1[2] = vqa.a(var1, (int)78);
      var1[4] = var2[6];
      var1[6] = var2[3];
      var1[3] = var2[2];
      var1[5] = var2[0];
      ((int[])((int[])var1[1]))[1] = ((int[])((int[])var2[1]))[0];
      if(var0 <= 53) {
         a((Object[])null, (byte)-109);
      }

      return var1;
   }

   static final boolean a(Object[] var0, int var1) {
      ++a;
      return var1 != 6?true:((boolean[])((boolean[])var0[8]))[4];
   }

   static final void a(Object[] var0, byte var1) {
      ((boolean[])((boolean[])var0[2]))[0] = false;
      int var2 = 116 / ((8 - var1) / 47);
      ++b;
   }

}
