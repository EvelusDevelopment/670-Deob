
final class gka {

   static int c;
   static int a;
   static int d = 0;
   static int b;
   static int g;
   static int f;
   static int h;
   static Object[] e = null;


   static final boolean a(byte var0, Object[] var1) {
      ++f;
      if(var0 != 123) {
         a((byte)-25, (Object[])((Object[])((Object[])((Object[])e[18]))[3]));
      }

      return null != ((Object[][])((Object[][])var1[12]))[1] && ji.a((int)18845, ((Object[][])((Object[][])var1[12]))[1]);
   }

   static final int a(Object[] var0, byte var1) {
      if(var1 != -37) {
         a((Object[])((Object[])var0[1]), false, (byte)113);
      }

      ++c;
      return ((int[])((int[])var0[5]))[3];
   }

   static final Object[] a(Object[] var0, boolean var1, byte var2) {
      ++b;
      if(var2 != -41) {
         e = (Object[])null;
      }

      if(null == var0[1]) {
         var0[1] = new int[2];
      }

      if(var0[2] == null) {
         var0[2] = new boolean[1];
      }

      var0[0] = aqa.a(new Object[2], 100);
      ((int[])((int[])var0[1]))[1] = 0;
      ((boolean[])((boolean[])var0[2]))[0] = false;
      ((int[])((int[])var0[1]))[0] = 0;
      ((boolean[])((boolean[])var0[2]))[0] = var1;
      return var0;
   }

   static final void b(byte var0, Object[] var1) {
      if(var0 != 76) {
         a((Object[])((Object[])e[8]), ((byte[])((byte[])var1[10]))[2]);
      }

      ++a;
      var1[14] = ura.a(-108, new Object[2]);
   }

   static final Object[] a(qta var0, Object[] var1, Object[] var2, int var3) {
      ++h;
      if(null == var2[6]) {
         var2[6] = new boolean[1];
      }

      ru.a(var0, var2, 1966, var1);
      var2[8] = var1;
      ((boolean[])((boolean[])var2[var3]))[0] = false;
      return var2;
   }

   static final Object[] newIsaacCipher(int[] keys, Object[] wrapper, int var2) {
      rq.a(wrapper, 91);
      ++g;
      wrapper[0] = new int[256];
      wrapper[2] = new int[256];

      int var3;
      for(var3 = 0; keys.length > var3; ++var3) {
         ((int[])((int[])wrapper[2]))[var3] = keys[var3];
      }

      var3 = 119 / ((var2 + 82) / 42);
      nb.initISAAC(wrapper, 0);
      return wrapper != null && (6 == wrapper.length || wrapper.length == 13)?null:wrapper;
   }

}
