
final class fc {

   static int a;
   static int d;
   static String[] b = new String[200];
   static int c;
   static int e;


   static final void a(int var0, Object[] var1, int var2, kp var3) {
      ++d;
      int var4 = var0 >> 5;
      kp var5 = ((kp[])((kp[])var1[var2]))[var4];
      if(var5 == null) {
         ((kp[])((kp[])var1[4]))[var4] = var3;
      } else {
         var5.m = var3;
      }

      ((kp[])((kp[])var1[3]))[var4] = var3;
      var3.j = var0;
   }

   static final void a(int var0) {
      ++c;
      kv.e = lba.h;
      if(var0 > -127) {
         b(117, -37);
      }

      ww.r = 162;
      String var1 = null;
      if(null != cl.c) {
         Object[] var2 = jta.a((byte)-124, cl.c, new Object[3]);
         var1 = rna.a(Class_i.a(false, var2), 30);
         fw.b = Class_i.a(false, var2);
      }

      if(null != var1) {
         ta.a(var1, "", false, 58, true);
      } else {
         ul.a(35, (byte)77);
      }
   }

   static final int a(int var0, int var1) {
      ++a;
      return var1 != 3?92:255 & var0;
   }

   static final boolean b(int var0, int var1) {
      if(var1 != -3) {
         b = (String[])null;
      }

      ++e;
      return 2 == var0 || 16 == var0 || var0 == 4;
   }

}
