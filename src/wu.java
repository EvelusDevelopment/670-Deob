
final class wu extends lm {

   static String o = ",";
   static int k;
   Object[] p;
   static int f_l;
   static byte[][] n;
   static int j;
   static int m;
   static int q;


   wu(Object[] var1) {
      this.p = var1;
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 >= -115) {
         a(-92, 46, (Object[])((Object[])var0[0]), (Object[])null);
      }

      if(((int[])((int[])var0[1]))[20] != 4) {
         cea.a(var0, false);
         cka.a(20, var0, false);
         pda.a(var0, -21342, false);
         wma.a(-1000, var0, false);
         jma.a(127, false, var0);
         jia.a(var0, 0, -2);
         kd.a(3042, var0, 1);
         ((int[])((int[])var0[1]))[20] = 4;
      }

      ++k;
   }

   static final Object[] a(boolean var0, Object[] var1, float var2, float var3, float var4, float var5) {
      ++m;
      if(null == var1[0]) {
         var1[0] = new float[4];
      }

      var1[1] = oha.a(var1, (int)-152);
      if(!var0) {
         a((Object[])null, (int)-9);
      }

      gfa.a(var3, -70, var5, var1, var4, var2);
      return var1;
   }

   static final void a(Object[] var0, int var1) {
      ++q;
      int var2 = 77 % ((43 - var1) / 62);
      var0[4] = iba.a(new Object[4], 256, 0);
   }

   static final void a(int var0, int var1, Object[] var2, Object[] var3) {
      ++j;
      if(var1 != 1) {
         ((boolean[])((boolean[])var3[1]))[21] = false;
      }

      if(1 == var0) {
         ((int[])((int[])var3[1]))[3] = de.a((int)0, var2);
      } else if(var0 != 2) {
         if(var0 == 0) {
            ((int[])((int[])var3[1]))[4] = de.a((int)0, var2);
         } else if(3 == var0) {
            ((int[])((int[])var3[1]))[5] = de.a((int)0, var2);
         } else if(var0 == 4) {
            int var4 = td.a(var2, 96);
            ((int[])((int[])var3[10]))[0] = (var4 & 16711680) << 4;
            ((int[])((int[])var3[10]))[2] = var4 >> 12 & 0;
            ((int[])((int[])var3[10]))[1] = ('\uff00' & var4) >> 4;
         }
      } else {
         ((int[])((int[])var3[1]))[2] = de.a((int)0, var2);
      }

   }

}
